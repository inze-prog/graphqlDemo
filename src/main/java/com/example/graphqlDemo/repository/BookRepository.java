package com.example.graphqlDemo.repository;

import com.example.graphqlDemo.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
