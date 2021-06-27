package com.fumie.dojosurvey.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
	@GetMapping("/")
	public String index() {
		return "index.jsp";
	}
	@PostMapping("/input")
	public String process(HttpSession session, @RequestParam(value="name") String name, @RequestParam(value="location") String location,@RequestParam(value="language") String language,@RequestParam(value="comment") String comment){
		session.setAttribute("name", name);
		session.setAttribute("location", location);
		session.setAttribute("language",  language);
		session.setAttribute("comment", comment);
		return "redirect:/result";
	}
	@GetMapping("/result")
	public String result(HttpSession session, Model viewModel) {
	String user_name = (String) session.getAttribute("name");
	String favorite_location = (String) session.getAttribute("location");
	String favorite_language = (String) session.getAttribute("language");
	String some_comment = (String) session.getAttribute("comment");
	viewModel.addAttribute("name", user_name);
	viewModel.addAttribute("location", favorite_location);
	viewModel.addAttribute("language", favorite_language);
	viewModel.addAttribute("comment", some_comment);
	
	
//initialize method with session and viewModel
//pull variable from session and set to viewModel
	return "result.jsp";
			
	}		
	@PostMapping("/clear")
	public String reset(HttpSession session) {
		session.invalidate();
		return "index.jsp";
	}
}

