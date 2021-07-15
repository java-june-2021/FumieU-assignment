package com.fumie.productandcategory.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.fumie.productandcategory.models.Category;
import com.fumie.productandcategory.models.Product;
import com.fumie.productandcategory.repositories.CategoryRepository;

@Service
public class CategoryService {
	private final CategoryRepository cRepo;
	
	public CategoryService(CategoryRepository repo) {
		this.cRepo = repo;
	}
	public List<Category> getAllCategories(){
		return this.cRepo.findAll();
	}
	public Category getSingleCategory(Long id) {
		return this.cRepo.findById(id).orElse(null);
	}
	public Category createCategory(Category category) {
		return this.cRepo.save(category);
	}
	public void deleteCategory(Long id) {
		this.cRepo.deleteById(id);
	}
	public void updateCategory(Long id, Category category) {
		this.cRepo.save(category);
	}
	public List<Category> findCategoriesNotInProduct(Product product) {
		return cRepo.findByProductsNotContains(product);
	}

}
