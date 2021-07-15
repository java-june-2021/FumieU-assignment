package com.fumie.productandcategory.controllers;

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

import com.fumie.productandcategory.models.Category;
import com.fumie.productandcategory.models.Product;
import com.fumie.productandcategory.services.CategoryService;
import com.fumie.productandcategory.services.ProductService;

@Controller
public class CategoryController {
	@Autowired
	private ProductService pService;
	@Autowired
	private CategoryService cService;
	
	@GetMapping("/category/new")
	public String createCategory(@ModelAttribute("category") Category category) {
		return "category.jsp";
	}
	@PostMapping("/category/new/process")
	public String createCategory(@Valid @ModelAttribute("category") Category category, BindingResult result, Model viewModel) {
		if(result.hasErrors()) {
			viewModel.addAttribute("category", this.cService.getAllCategories());
			return "category.jsp";
		}else {
			Category newCategory = this.cService.createCategory(category);
			Long categoryId = newCategory.getId(); 			
			return "redirect:/category/" + categoryId;
		}		
	}
	
	@GetMapping("category/{id}")
	public String categoryDetail(@ModelAttribute("product") Product product, Model viewModel, @PathVariable("id") Long id) {
		viewModel.addAttribute("allProduct", this.pService.getAllProducts());
		Category oneCategory = cService.getSingleCategory(id);
		List<Product> others = pService.findProductsNotInCategory(oneCategory);
		viewModel.addAttribute("category", oneCategory);
		viewModel.addAttribute("notInCategories", others);
		return "categoryProduct.jsp";
		
	}
	@PostMapping("/category/product/process")
	public String processCategoryProcess(@Valid @ModelAttribute("product")Product product, BindingResult result) {
		if(result.hasErrors()) {
			return "categoryProduct.jsp";
		}else {
			this.pService.createProduct(product);
			return "redirect:/product/new";
		}
	}
	
	
}
