package org.example.ssu.assignment2.repository;

import org.example.ssu.assignment2.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Integer> {
}
