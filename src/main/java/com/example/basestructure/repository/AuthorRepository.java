package com.example.basestructure.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.basestructure.model.Author;

public interface AuthorRepository extends JpaRepository<Author, Long> {}
