package com.gabriele.model;

import java.time.LocalDate;

import javax.persistence.*;

@Entity
@Table(name = "Books")
public class Books
{
	//book primary key generata 
	@Id	
	@Column 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int bookid;
	@Column 	
	private String bookname;
	@Column 	
	private String author;
	@Column (name="published" ) 
	private LocalDate datePublished;
	@Column (length = 1000)
	private String description;
	
	
	public Books(int bookid, String bookname, String author, LocalDate datePublished, String description) {
		super();
		this.bookid = bookid;
		this.bookname = bookname;
		this.author = author;
		this.datePublished = datePublished;
		this.description = description;
	}
	
	public Books() {
		
	}

	

	public int getBookid() {
		return bookid;
	}
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public LocalDate getDatePublished() {
		return datePublished;
	}
	public void setDatePublished(LocalDate datePublished) {
		this.datePublished = datePublished;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	

}