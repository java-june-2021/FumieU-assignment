package com.fumie.book.services;

import java.util.List;

import org.springframework.stereotype.Service;

//import org.springframework.stereotype.Service;
import com.fumie.book.models.Book;
import com.fumie.book.repositories.BookRepository;
@Service
public class BookService {
	   private final BookRepository bRepo; 
	    
	    public BookService(BookRepository repo) {
	        this.bRepo =  repo;
	    }
	    //get all object
	    public List<Book> getAllBooks() {
	        return this.bRepo.findAll();
	    }
	    //get one object
	   public Book getSingleBook(Long id){
		return this.bRepo.findById(id).orElse(null);
	   }
	    //create
	    public Book createBook(Book book) {
	        return this.bRepo.save(book);
	    }
	    //delete
	   public void deleteBook (Long id){
		this.bRepo.deleteById(id);
	  }
	  //update
	  public void updateBook (Long id, Book book) {
		  this.bRepo.save(book);
		  }
	  
	}
	 


