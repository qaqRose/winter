package com.qaq.cms.model;

import java.util.List;

/**
 * @author : Administrator
 */
public class UserVO extends User {

    private List<Book> books;

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return "UserVO{" +
                "books=" + books +
                "} " + super.toString();
    }
}