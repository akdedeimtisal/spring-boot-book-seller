package com.sha.springbootbookseller.service;

import model.Book;

import java.util.List;

public interface IBookService {
    public Book saveBook(Book book);
    public void deleteBook(Long id);
    public List<Book> findAllBooks();
}
