package com.example.basestructure.service;

import com.example.basestructure.model.Book;
import com.example.basestructure.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    // Method to add a new book
    public Book addBook(Book book) {
        return bookRepository.save(book);
    }

    // Method to retrieve all books
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    // Method to update an existing book
    public Book updateBook(Long id, Book bookDetails) {
        Book book = bookRepository.findById(id).orElseThrow(); // Fetching existing book

        // Using getters and setters to update fields
        book.setTitle(bookDetails.getTitle());
        book.setGenre(bookDetails.getGenre());
        book.setAuthor(bookDetails.getAuthor());

        return bookRepository.save(book); // Saving updated book
    }

    // Method to delete a book by ID
    public void deleteBook(Long id) {
        bookRepository.deleteById(id);
    }
}