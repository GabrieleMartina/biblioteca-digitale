package com.gabriele.service;
import java.util.ArrayList;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gabriele.model.Books;
import com.gabriele.repository.BooksRepository;

@Service
public class BooksService 
{
	@Autowired
	BooksRepository booksRepository;
	//prende tutti i libri usando il metodo findall
	public List<Books> getAllBooks() 
	{
		List<Books> books = new ArrayList<Books>();
		booksRepository.findAll().forEach(books1 -> books.add(books1));
		return books;
	}



	public Books getBooksByBookname(String bookname) 
	{
		return booksRepository.findByBookname(bookname);
	}


	/*prende uno specifico record usando un il metodo findbyid
		public Books getBooksBybookname(String bookname) 
		{
			List<Books> books = new ArrayList<>();

			Books booksFilter = books.stream()
					  .filter(value -> bookname.equals(value.getBookname()))
					  .findAny()
					  .orElse(null);

			System.out.println("booksFilterbooksFilterbooksFilterbooksFilterbooksFilterbooksFilterbooksFilterbooksFilterbooksFilter"+booksFilter);
			return booksRepository.findBybookname(booksFilter).get();
		}



	public Books getBooksById(int id) 
	{
		return booksRepository.findById(id).get();
	}

	 */


	//salva uno specifico record attraverso il metodod save
	public void saveOrUpdate(Books books) 
	{
		booksRepository.save(books);
	}
	//cancella uno specifico id usando il metodo deletebyid
	public void delete(int id) 
	{
		booksRepository.deleteById(id);
	}
	//update a record
	public void update(Books books, int bookid) 
	{
		booksRepository.save(books);
	}


}