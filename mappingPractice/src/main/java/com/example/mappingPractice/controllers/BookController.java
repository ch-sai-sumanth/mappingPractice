package com.example.mappingPractice.controllers;

import com.example.mappingPractice.models.Book;
import com.example.mappingPractice.services.BookServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class BookController {

    @Autowired
    BookServices bookServices;

    @PostMapping("/book")
    public void addBook(@RequestBody Book mybook)
    {
        bookServices.addBook(mybook);
    }

    @PutMapping("/book/{id}")
    public void updateBookById(@RequestBody Book myBook, @PathVariable Integer id)
    {
        bookServices.updateBookById(myBook,id);
    }
    @DeleteMapping("/book/{id}")
    public void deleteBookById( @PathVariable Integer id)
    {
        bookServices.deleteBookById(id);
    }
    @GetMapping("/book/all")
    public List<Book> getAllBooks()
    {
        return bookServices.getAllBooks();
    }

    @GetMapping("/book/{id}")
    public Optional<Book> getBookById(@PathVariable Integer id)
    {
        return bookServices.getBookById(id);
    }
}
