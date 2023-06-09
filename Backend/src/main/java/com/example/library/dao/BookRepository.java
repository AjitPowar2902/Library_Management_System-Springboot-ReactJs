package com.example.library.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.library.model.Book;
@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {
	
	List<Book> findByCategory(String category);
	List<Book> findByAuthor(String author);


}
