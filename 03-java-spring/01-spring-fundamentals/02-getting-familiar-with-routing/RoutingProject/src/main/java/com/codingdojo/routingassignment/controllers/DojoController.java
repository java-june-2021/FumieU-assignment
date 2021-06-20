package com.codingdojo.routingassignment.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dojo")
public class DojoController {

	@RequestMapping("")
	public String dojo() {
		return "The Dojo is awsome!";
	}
	
	@RequestMapping("/burbank")
	public String burbank() {
		return "Burbank is ocated in Southern California";
	}
	@RequestMapping("/sanjose")
	public String sanjose() {
		return "SJ dojo is the headquarters";
	}
}
