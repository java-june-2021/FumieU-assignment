package com.fumie.dojoninja.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.fumie.dojoninja.models.Dojo;
import com.fumie.dojoninja.models.Ninja;
import com.fumie.dojoninja.services.DojoService;
import com.fumie.dojoninja.services.NinjaService;

@Controller
public class MainController {
	@Autowired
	private DojoService dService;
	@Autowired
	private NinjaService nService;
	
	@GetMapping("/new")
	public String index(@ModelAttribute("dojo") Dojo dojo) {
		return "index.jsp";
	}

	@PostMapping("/new/dojo")
	public String createDojo(@Valid @ModelAttribute("dojo") Dojo dojo, BindingResult result, Model viewModel) {

		if(result.hasErrors()) {
			viewModel.addAttribute("dojos", this.dService.getAllDojos());
			return "index.jsp";
		}else {
			this.dService.createDojo(dojo);
			return "redirect:/new/ninja";
		}	
	}
	@GetMapping("/new/ninja")
	public String createNinja(@ModelAttribute("ninja") Ninja ninja, Model viewModel) {
		viewModel.addAttribute("dojo", this.dService.getAllDojos());
		return "ninja.jsp";
	}
	@PostMapping("/add/ninja")
	public String addNinja(@Valid @ModelAttribute("dojo") Dojo dojo, @ModelAttribute("ninja") Ninja ninja, BindingResult result, Model viewModel) {
		viewModel.addAttribute("dojo", this.dService.getAllDojos());
		if(result.hasErrors()) {
			return "ninja.jsp";
		}else {
			Long dojoId = dojo.getId();
			this.nService.createNinja(ninja);
			return "redirect:/dojos/" + dojoId;
		}
	}
	
	@GetMapping("/dojos/{id}")
	public String showLocation(@PathVariable("id") Long id,@ModelAttribute("ninja") Ninja ninja, Model viewModel) {
		Dojo dojoToShow = this.dService.getSingleDojo(id);
		viewModel.addAttribute("dojo", dojoToShow);
	    viewModel.addAttribute("ninja", this.nService.getAllNinjas());
		return "location.jsp";
	}
}
