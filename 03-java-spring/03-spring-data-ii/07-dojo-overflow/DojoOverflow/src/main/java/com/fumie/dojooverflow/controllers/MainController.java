package com.fumie.dojooverflow.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.fumie.dojooverflow.models.Answer;
import com.fumie.dojooverflow.models.Question;
import com.fumie.dojooverflow.services.OverflowService;
import com.fumie.dojooverflow.validators.TagValidator;

@Controller
public class MainController {
	@Autowired
	private OverflowService oService;
	@Autowired
	private TagValidator tValidator;
	

	
	@GetMapping("/questions")
	public String getQuestion(Model viewModel) {
		viewModel.addAttribute("allqs", this.oService.getAllQuestions());
		return "dashboard.jsp";
	}
	@GetMapping("/new")
	public String addQuestion(@ModelAttribute("question")Question question) {
		return "new.jsp";
	}
	
	@PostMapping("new/question")
	public String addQuestion(@Valid @ModelAttribute("question") Question question, BindingResult result) {
		tValidator.validate(question, result);
		if(result.hasErrors()) {
			return "new.jsp";
		}else {
			this.oService.createQuestion(question);
			return "redirect:/questions";
		}
	}
	@GetMapping("show/{id}")
	public String show(@PathVariable("id")Long id, Model viewModel, @ModelAttribute("answer")Answer aswer) {
		viewModel.addAttribute("question", this.oService.getOneQuestion(id)) ;
		return "show.jsp";
	}
		
	@PostMapping("/addAnswer")
		public String addAnswer(@Valid @ModelAttribute("answer") Answer answer, BindingResult result, Model viewModel) {
			if(result.hasErrors()) {
			viewModel.addAttribute("question", this.oService.getOneQuestion(answer.getQuestion().getId()));
				return "show.jsp";
			}else {
				this.oService.createAnswer(answer);	
				return "redirect:/show/" + answer.getQuestion().getId();
			}
	}
}
