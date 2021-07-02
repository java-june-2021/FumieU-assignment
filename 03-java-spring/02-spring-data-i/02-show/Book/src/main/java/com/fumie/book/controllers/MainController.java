package com.fumie.book.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestMapping;

import com.fumie.book.models.Book;
import com.fumie.book.services.BookService;

@Controller
public class MainController{

	
	@Autowired
	private BookService bService;
	
	public MainController(BookService bService) {
		this.bService = bService;
	}

	@GetMapping("/") 
	public String index(Model viewModel){
		List<Book> books = bService.getAllBooks();
		viewModel.addAttribute("books", books);
		return "index.jsp";
	}
	@GetMapping("/input")
	public String input(@ModelAttribute("book") Book newBook) {
		return "input.jsp";
	}
	@PostMapping("/input")
	public String create(@Valid @ModelAttribute("book") Book book, BindingResult result){
		if(result.hasErrors() ){
			return "input.jsp";
		}else {
			bService.createBook(book);
		return "redirect:/{id}";
		}
	}

	@GetMapping("/{id}")
	public String getSingleBook(@PathVariable("id") Long id){
		this.bService.getSingleBook(id);
		return "show.jsp";
	}

	@PutMapping("/update/{id}")
	public String update(@PathVariable("id") Long id, Book updateBook){
		this.bService.updateBook(updateBook);
		return "redirect:/{id}";
	}
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable("id") Long id){
		this.bService.deleteBook(id);
	}


}
