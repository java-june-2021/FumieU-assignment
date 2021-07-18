package com.fumie.loginandreg.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.fumie.loginandreg.models.User;
import com.fumie.loginandreg.services.UserService;

@Controller
public class MainController {
	@Autowired
	private UserService uService;
	
	@GetMapping("/registration")
	public String registration(@ModelAttribute ("user") User user){
		return "registrationPage.jsp";
	}
	@PostMapping("/registration")
    public String registerUser(@Valid @ModelAttribute("user") User user, BindingResult result, HttpSession session) {
		if(result.hasErrors()) {
			return "registrationPage.jsp";
		}else {
			User newUser = this.uService.registerUser(user);
			session.setAttribute("user__id", newUser.getId());
		}
			return "redirect:/home";
	}
	
	@GetMapping("/home")
	public String home(HttpSession session, Model viewModel) {
		Long userId = (Long)session.getAttribute("user__id");
		User u = uService.findUserById(userId);
		viewModel.addAttribute("user", u);
		return "homePage.jsp";
	
	}
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:/login";
		
	}
	@GetMapping("/login")
	public String login() {
		return "loginPage.jsp";
				
	}
	@PostMapping("/login")
	public String loginUser(@RequestParam("email") String email, @RequestParam("password") String password, HttpSession session, Model viewModel) {
		boolean isAuthenticated = uService.authenticationUser(email, password);
		if (isAuthenticated){
			User u = uService.findByEmail(email);
			session.setAttribute("user__id", u.getId());
			return "redirect:/home";
		}else {
			viewModel.addAttribute("error", "Invalid input.  Please try again");
			return "loginPage.jsp";
		}
		
	}
	
}
