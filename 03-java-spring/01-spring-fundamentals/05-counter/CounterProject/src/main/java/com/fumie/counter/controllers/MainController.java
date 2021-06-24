package com.fumie.counter.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;

	
@Controller
public class MainController {
	
	@GetMapping("/")
	public String index(HttpSession session) {
		if (session.getAttribute("count") == null) {
			session.setAttribute("count", 0);
		}
		else {
			Integer counter = (Integer) session.getAttribute("count");
			counter++;
			session.setAttribute("count", counter);
		}
		return "index.jsp";
	}
	@GetMapping("/counter")
	public String currentCount(HttpSession session, Model viewModel) {
		Integer currCount = (Integer)session.getAttribute("count");
		if(currCount == null){
			viewModel.addAttribute("current", 0);
		}
		else {
			viewModel.addAttribute("current", currCount);
		}
		return "counter.jsp";
	}
	@GetMapping("/counttwo")
	public String countTwo(HttpSession session) {
		if (session.getAttribute("count") == null) {
			session.setAttribute("count", 0);
		}
		else {
			Integer counter = (Integer) session.getAttribute("count");
			counter += 2;
			session.setAttribute("count", counter);
		}
		return "counter.jsp";
	}
	@GetMapping("/reset")
	public String reset(HttpSession session) {
			session.invalidate();
			return "counter.jsp";
		}
		
	}

