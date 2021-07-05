package com.fumie.language.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fumie.language.models.Language;
import com.fumie.language.services.LanguageService;

@Controller
@RequestMapping("/language")
public class MainController {

	@Autowired
	private LanguageService lService;
	
	public MainController(LanguageService lService) {
		this.lService = lService;
	}

	@GetMapping("")
	public String index(Model viewModel) {
		List<Language> languages = lService.getAllLanguages();
		viewModel.addAttribute("languages", languages);
		return "index.jsp";
	}
		
	@PostMapping("/create")
	public String create(@ModelAttribute ("language") Language language, BindingResult result) {
		if(result.hasErrors()) {
			return "index.jsp";
		}else {
		Language newLanguage=this.lService.createLanguage(language);
		Long newId=newLanguage.getId(); 
//		System.out.print(newId + "**************");
		return "redirect:/language/" + newId;
	    }
	}
	@GetMapping("/{id}")
	public String detail(Model viewModel, @PathVariable("id") Long id) {
			Language languageToShow = this.lService.getSingleLanguage(id);
			viewModel.addAttribute("language", languageToShow);
			return "show.jsp";
		}	
	
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable("id") Long id){
		this.lService.deleteLanguage(id);
		return "redirect:/language";
	}
	
	@GetMapping("/update/{id}")
	public String update(Model viewModel, @PathVariable("id") Long id, @ModelAttribute("language") Language editLanguage) {
		viewModel.addAttribute(this.lService.getSingleLanguage(id));
		System.out.println("I am here");
		return "edit.jsp";
		
	}	
	@PostMapping("/{id}")
	public String updateProcess(@Valid @ModelAttribute("language") Language language, BindingResult result, Model viewModel, @PathVariable("id") Long id) {
		if(result.hasErrors()) {
			return "show.jsp";
		}else {
			this.lService.updateLanguage(id, language);
			return "redirect:/language/{id}";
		}
		
	}
	
}
	
