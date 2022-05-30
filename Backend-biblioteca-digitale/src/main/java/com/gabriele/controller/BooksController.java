package com.gabriele.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.gabriele.model.Books;
import com.gabriele.service.BooksService;

@CrossOrigin
@RestController
public class BooksController 
{

	@Autowired
	BooksService booksService;
	
	//creando un Get Mapping che recupera tutti i dettagli dei libri dal database
	@GetMapping("/getallbook")
	private List<Books> getAllBooks() 
	{
		return booksService.getAllBooks();
	}
	
	@GetMapping("/getasinglebookByName/{bookname}")
	private List<Books> getBooks(@PathVariable("bookname") String bookname) 
	{
		return booksService.getBooksByBookname(bookname);
		
	}
	//creo un GetMapping che recupera i dettagli di uno specifico libro
	/*
	 * @GetMapping("/getasinglebookById/{bookid}")
	private Books getBooks(@PathVariable("bookid") int bookid) 
	{
		return booksService.getBooksById(bookid);
	}
	*/
	
	//creo un DeleteMapping che cancella  uno specifico libro
	@DeleteMapping("/deleteasinglebook/{bookid}")
	private void deleteBook(@PathVariable("bookid") int bookid) 
	{
		booksService.delete(bookid);
	}
	
	
	
	//creazione di post mapping che inserisce i dettagli del libro nel database
	@PostMapping("/createbooks")
	private int saveBook(@RequestBody Books books) 
	{
		booksService.saveOrUpdate(books);
		return books.getBookid();
	}
	
	
	
	//creando una mappatura put che aggiorna il dettaglio del libro
	@PutMapping("/books")
	private Books update(@RequestBody Books books) 
	{
		booksService.saveOrUpdate(books);
		return books;
	}
}
