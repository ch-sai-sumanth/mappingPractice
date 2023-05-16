package com.example.mappingPractice.services;

import com.example.mappingPractice.models.Book;
import com.example.mappingPractice.repository.IBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookServices {
    @Autowired
    IBookRepository iBookRepository;


    public void addBook(Book mybook)
    {
        iBookRepository.save(mybook);
    }

    public void updateBookById(Book myBook, Integer id) {
        myBook.setBookID(id);
        iBookRepository.save(myBook);
    }

    public void deleteBookById(Integer id) {
        iBookRepository.deleteById(id);
    }

    public List<Book> getAllBooks() {
        return iBookRepository.findAll();
    }

    public Optional<Book> getBookById(Integer id) {
        return iBookRepository.findById(id);
    }
}
