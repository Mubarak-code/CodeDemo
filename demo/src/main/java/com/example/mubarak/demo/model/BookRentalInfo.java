package com.example.mubarak.demo.model;

public class BookRentalInfo {

    private int bookRentalInfoId;

    private int bookId;

    private int renterId;

    private String dateRented;

    private String dateToBeReturned;

    public BookRentalInfo(){}

    public BookRentalInfo(int bookRentalInfoId, int bookId, int renterId, String dateRented, String dateToBeReturned) {
        this.bookRentalInfoId = bookRentalInfoId;
        this.bookId = bookId;
        this.renterId = renterId;
        this.dateRented = dateRented;
        this.dateToBeReturned = dateToBeReturned;
    }

    public int getBookRentalInfoId() {
        return bookRentalInfoId;
    }

    public void setBookRentalInfoId(int bookRentalInfoId) {
        this.bookRentalInfoId = bookRentalInfoId;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public int getRenterId() {
        return renterId;
    }

    public void setRenterId(int renterId) {
        this.renterId = renterId;
    }

    public String getDateRented() {
        return dateRented;
    }

    public void setDateRented(String dateRented) {
        this.dateRented = dateRented;
    }

    public String getDateToBeReturned() {
        return dateToBeReturned;
    }

    public void setDateToBeReturned(String dateToBeReturned) {
        this.dateToBeReturned = dateToBeReturned;
    }
}
