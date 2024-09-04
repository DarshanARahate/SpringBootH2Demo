package com.example.SpringBootH2Demo.repository;

import com.example.SpringBootH2Demo.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Integer> {
}
