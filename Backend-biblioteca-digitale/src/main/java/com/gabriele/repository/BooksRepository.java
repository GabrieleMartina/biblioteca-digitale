package com.gabriele.repository;




import org.springframework.data.repository.CrudRepository;
import com.gabriele.model.Books;



public interface BooksRepository extends CrudRepository<Books, Integer> {



	Books findByBookname(String bookname);


}

