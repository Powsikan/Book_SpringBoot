package com.powsikan.book.service;

import com.powsikan.book.model.Book;
import com.powsikan.book.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    BookRepository bookRepository;

    public List<Book> getAll(){
       return bookRepository.findAll();
    }
}
