package com.fumie.productandcategory.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.fumie.productandcategory.models.Category;
import com.fumie.productandcategory.models.Product;
import com.fumie.productandcategory.repositories.ProductRepository;

@Service
public class ProductService {
	private final ProductRepository pRepo;
	
	public ProductService(ProductRepository repo) {
		this.pRepo = repo;
	}
	public List<Product> getAllProducts(){
		return this.pRepo.findAll();
	}
	public Product getSingleProduct(Long id) {
		return this.pRepo.findById(id).orElse(null);
	}
	public Product createProduct(Product product) {
		return this.pRepo.save(product);
	}
	public void deleteProduct(Long id) {
		this.pRepo.deleteById(id);
	}
	public void updateProduct(Long id, Product product) {
		this.pRepo.save(product);
	}
	public List<Product> findProductsNotInCategory(Category category) {
		return pRepo.findByCategoriesNotContains(category);
	}
}
