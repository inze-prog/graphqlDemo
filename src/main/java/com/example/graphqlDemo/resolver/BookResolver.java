package com.example.graphqlDemo.resolver;

import com.example.graphqlDemo.model.Book;
import com.example.graphqlDemo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class BookResolver {

    @Autowired
    private BookService bookService;

    @QueryMapping
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }

    @MutationMapping
    public Book addBook(@Argument String title, @Argument String author) {
        Book book = new Book();
        book.setTitle(title);
        book.setAuthor(author);
        return bookService.addBook(book);
    }
}