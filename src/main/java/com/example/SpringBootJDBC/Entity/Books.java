package com.example.SpringBootJDBC.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.ManyToAny;

@Entity
public class Books {

	/***
	 * CREATE TABLE books ( book_id INT NOT NULL AUTO_INCREMENT, title VARCHAR(100),
	 * author_fname VARCHAR(100), author_lname VARCHAR(100), released_year INT,
	 * stock_quantity INT, pages INT, PRIMARY KEY(book_id) );
	 */

	@Id
	private Integer book_id;
	private String title;
	private String author_fname;
	private String author_lname;
	private Integer released_year;
	private Integer pages;
	
	//@ManyToMany
	
	//@ManyToOne
	// Courses course;

	public Books() {
		//super();
	}

	public Books(Integer book_id, String title, String author_fname, String author_lname, Integer released_year,
			Integer pages) {
		super();
		this.book_id = book_id;
		this.title = title;
		this.author_fname = author_fname;
		this.author_lname = author_lname;
		this.released_year = released_year;
		this.pages = pages;
	}

	public Integer getBook_id() {
		return book_id;
	}

	public void setBook_id(Integer book_id) {
		this.book_id = book_id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor_fname() {
		return author_fname;
	}

	public void setAuthor_fname(String author_fname) {
		this.author_fname = author_fname;
	}

	public String getAuthor_lname() {
		return author_lname;
	}

	public void setAuthor_lname(String author_lname) {
		this.author_lname = author_lname;
	}

	public Integer getReleased_year() {
		return released_year;
	}

	public void setReleased_year(Integer released_year) {
		this.released_year = released_year;
	}

	public Integer getPages() {
		return pages;
	}

	public void setPages(Integer pages) {
		this.pages = pages;
	}

}
