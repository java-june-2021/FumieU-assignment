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
public class ProductController {
	@Autowired
	private ProductService pService;
	@Autowired
	private CategoryService cService;
	
	@GetMapping("/product/new")
	public String index(@ModelAttribute("product") Product product) {
		return "index.jsp";
	}
	@PostMapping("/product/new/process")
	public String createProduct(@Valid @ModelAttribute("product") Product product, BindingResult result, Model viewModel) {
	if(result.hasErrors()) {
		viewModel.addAttribute("product", this.pService.getAllProducts());
		return "index.jsp";
	}else {
		Product newProduct = this.pService.createProduct(product);
		Long productId = newProduct.getId();
		this.pService.createProduct(product);
		return "redirect:/product/" + productId;
		}
	}
	
	@GetMapping("/product/{id}")
	public String addProductCategory(@ModelAttribute("category")Category category, Model viewModel, @PathVariable("id")Long id) {
		viewModel.addAttribute("allCategory", this.cService.getAllCategories());
		Product oneProduct = pService.getSingleProduct(id);
		List<Category> others = cService.findCategoriesNotInProduct(oneProduct);
		viewModel.addAttribute("product", oneProduct);
		viewModel.addAttribute("notInProducts", others);
		return "productCategory.jsp";
	}
	@PostMapping("/product/category/process")
	public String processProductCategory(@Valid @ModelAttribute("category")Category category, BindingResult result) {
		if(result.hasErrors()) {
			return "productCategory.jsp";
		}else {
			this.cService.createCategory(category);
			return "redirect:/category/new";
		}
	}
	
	
	
}
