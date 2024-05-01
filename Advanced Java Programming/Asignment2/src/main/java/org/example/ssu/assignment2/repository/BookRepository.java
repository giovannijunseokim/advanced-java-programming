package org.example.ssu.assignment2.repository;

import org.example.ssu.assignment2.model.Book;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends ReactiveCrudRepository<Book, Integer> {
}
