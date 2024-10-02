package com.example.basestructure.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.basestructure.model.Book;

public interface BookRepository extends JpaRepository<Book, Long> {}
