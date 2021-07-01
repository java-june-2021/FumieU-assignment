package com.fumie.book.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;



@Entity
@Table(name = "books")
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private Long id;
	@Size (min=5, max=200)
	private String name;
	@Size (min=5, max=200)
	private String description;
	@Size (min=5, max=200)
	private String language;
	@Size (min=5, max=200)
	private int numberOfPages;
	@Size (min=5, max=1000)
	public Book(){
	}
	public Book(String name, String description, String language, int numberOfPages) {
		this.name = name;
		this.description = description;
		this.language = language;
		this.numberOfPages = numberOfPages;
    }
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public int getNumberOfPages() {
		return numberOfPages;
	}
	public void setNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
	}
}