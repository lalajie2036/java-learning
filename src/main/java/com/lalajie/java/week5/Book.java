package com.lalajie.java.week5;

import lombok.Builder;
import sun.awt.SunGraphicsCallback;

/**
 * @ClassName Book
 * @Description TODO
 * @Author Mister-Lu
 * @Date 2020/11/2
 **/
@Builder
public class Book {
    private String ISBN;
    private String bookName;
    private int price;

    public Book(String ISBN, String bookName, int price) {
        this.ISBN = ISBN;
        this.bookName = bookName;
        this.price = price;
    }


    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
