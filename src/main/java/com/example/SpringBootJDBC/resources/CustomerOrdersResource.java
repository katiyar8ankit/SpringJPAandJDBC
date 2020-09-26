package com.example.SpringBootJDBC.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringBootJDBC.Entity.Books;
import com.example.SpringBootJDBC.Entity.BooksRepository;
import com.example.SpringBootJDBC.service.CustomerOrdersResourceService;

@RestController
@RequestMapping("/service")
public class CustomerOrdersResource {
	
	@Autowired
	BooksRepository repository;
	
	@GetMapping("/books")
	public List<Books> getUserDetails() {
		List<Books> listOfBooks = new ArrayList<Books>();
		repository.findAll().forEach(book -> listOfBooks.add(book));
		
		return listOfBooks;
	}
	
	/**
	@PostMapping("\book")
	public void insertBook(@RequestBody Book book) {
		repository.save(book);
		
		return new ResponseEntity.ok();
	}
	**/
}
