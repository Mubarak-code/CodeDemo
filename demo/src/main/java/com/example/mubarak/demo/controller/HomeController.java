package com.example.mubarak.demo.controller;


import com.example.mubarak.demo.dao.BookRepo;
import com.example.mubarak.demo.model.Books;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Iterator;
import java.util.List;

@RestController
public class HomeController {

    @Autowired
    private BookRepo bookRepo;


    @GetMapping("/return-book")
    public Books returnBookByName(@RequestParam ("bookName") String bookName ){
        return bookRepo.returnBookByBookName(bookName);
    }

    @GetMapping("/insertBooks")
    public String testHome(){
        bookRepo.insertRecords();

        return "Book has been added";
    }

    @GetMapping("/return-all-books")
    public List<Books> returnAllBooks(){
        return bookRepo.getAllBooks();
    }

    @GetMapping("/list-size")
    public Integer emptyList(){
        bookRepo.getAllBooks().removeAll(bookRepo.getAllBooks());
        return bookRepo.getAllBooks().size();
    }


    @GetMapping("/add-new-book")
    public String addNewBook (@RequestParam("bookName") String bookName , @RequestParam ("bookAuthor")String bookAuthor){
        Books newBook = new Books(0, bookName, bookAuthor, false);
       try {
           List<Books> allBok  = bookRepo.getAllBooks();
           if (allBok.size() == 0){
               bookRepo.getAllBooks().add(newBook);
               return " new book added";
           }else {
               int id = 0;
               for (Books book : allBok) {
                   if (book.getBookId() != null) {
                       System.out.println("looping thru book list , curent element name is " + book.getBookName());
                       id = book.getBookId();
                   }
               }
               id += 1;
              return  bookRepo.addNewBook(new Books (id, bookName, bookAuthor, false));
           }
//
//
       }catch (Exception e){
           e.printStackTrace();
           System.out.println("error encountered " +  e.getStackTrace());
           return " Book not added";

       }
    }





}
