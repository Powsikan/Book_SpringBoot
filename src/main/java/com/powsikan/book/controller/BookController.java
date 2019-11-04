package com.powsikan.book.controller;

import com.powsikan.book.model.Book;
import com.powsikan.book.repository.BookRepository;
import com.powsikan.book.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/")
public class BookController {
    @Autowired
    BookRepository bookRepository;

    @Autowired
    BookService bookService;

    @GetMapping("books")
    public  Book getById(@RequestParam Long id){
        return bookRepository.findById(id).get();
    }

@GetMapping("book")
    public List<Book> getResult() {
        return bookService.getAll();
    }

    @GetMapping("bookname/{name}")
    public Book getByName(@PathVariable String name){
        return bookRepository.findByName(name);
    }

    @PostMapping("book")
    public String save(@RequestBody  Book book ){
    bookRepository.save(book);
    return "Success";

    }


}
