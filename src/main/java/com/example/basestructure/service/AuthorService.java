package com.example.basestructure.service;

import com.example.basestructure.model.Author;
import com.example.basestructure.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorService {

    @Autowired
    private AuthorRepository authorRepository;

    // Method to add a new author
    public Author addAuthor(Author author) {
        return authorRepository.save(author);
    }

    // Method to retrieve all authors
    public List<Author> getAllAuthors() {
        return authorRepository.findAll();
    }

    // Method to update an existing author
    public Author updateAuthor(Long id, Author authorDetails) {
        Author author = authorRepository.findById(id).orElseThrow(); // Fetching existing author

        // Using getters and setters to update fields
        author.setName(authorDetails.getName());

        return authorRepository.save(author); // Saving updated author
    }

    // Method to delete an author by ID
    public void deleteAuthor(Long id) {
        authorRepository.deleteById(id);
    }
}