package com.fumie.license.controllers;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


import com.fumie.license.models.License;
import com.fumie.license.models.Person;
import com.fumie.license.services.LicenseService;
import com.fumie.license.services.PersonService;

@Controller
public class MainController {

	@Autowired
	private PersonService pService;
	@Autowired
	private LicenseService lService;

	
	@GetMapping("/person/new")
	public String index(@ModelAttribute("person")Person person) {
	return "index.jsp";
	}
	@PostMapping("/create/person")
	public String createPerson(@Valid @ModelAttribute("person")Person person, BindingResult result) {
		if(result.hasErrors()){
			return "index.jsp";
		}else {
			this.pService.createPerson(person);				
		}
		return "redirect:/license/new";
	}
	
	@GetMapping("/license/new")
	public String showPersonToRegister(@ModelAttribute("license") License license,  Model viewModel) {
	viewModel.addAttribute("person",this.pService.getAllPersons());
		return "license.jsp";
	}
	
	@PostMapping("/license/input")
	public String createLicense(@Valid @ModelAttribute("license") License license, BindingResult result) {
		if(result.hasErrors()) {
			return "license.jsp";
		}
	    License newLicense = this.lService.createLicense(license);
			Long newId=newLicense.getId();	
	        return "redirect:/person/" + newId;
	}
		
	@GetMapping("/person/{id}")
	public String showLicense(Model viewModel, @PathVariable("id") Long id) {
		viewModel.addAttribute("license", this.lService.getSingleLicense(id));
		viewModel.addAttribute("person", this.lService.getSingleLicense(id).getPerson());
		return "personLicense.jsp";
	}
}