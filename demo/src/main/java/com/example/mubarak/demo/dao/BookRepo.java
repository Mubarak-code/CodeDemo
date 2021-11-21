package com.example.mubarak.demo.dao;

import com.example.mubarak.demo.model.Books;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Component
public class BookRepo {

    public List<Books> allBooks = new ArrayList<>();

    Books book1  = new Books(1, "Ada goes to school ", "Chibuzor Ike" , false);
    Books book2 = new Books(2, "Intro to Java" ,"Martin Fowler", false);
    Books book3 = new Books(3, "Algprithms and running time", "Chris Rock", false);
    Books book4 = new Books(4, "Test book", "Test Author", false);



    //creating a book record of 4
    public void insertRecords (){
        allBooks.add(book1);
        allBooks.add(book2);
        allBooks.add(book3);
        allBooks.add(book4);
    }

    public String addNewBook (Books newBook){
        for (Books book : allBooks){
            System.out.println("bookName is " + book.getBookName() + " name to be compared is " + newBook.getBookName());
            if(book.getBookName().equals(newBook.getBookName())) {
                return "Book already exist";
            }
        }
        allBooks.add(newBook);
        return "Book added sucessfully";

    }

    public List<Books> getAllBooks(){

        return allBooks;

    }


   // return a book by book title
    public Books returnBookByBookName(String name){

        for(Books book : allBooks){
            if (book.getBookName().equals(name)){
                return book;
            }

        }
        return null;
    }

    public List<Books> booksNotRented(){
        List <Books> result = new ArrayList<>();

        for (Books book : allBooks){
            if (!book.isRentStatus()){
                result.add(book);
            }
        }
        return result;
    }

    public List<Books> booksRented(){
        List <Books> result = new ArrayList<>();

        for (Books book : allBooks){

            if (book.isRentStatus()){
                result.add(book);
            }
        }
        return result;
    }







}
