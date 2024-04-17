package org.example.ssu.assignment2.repository;

import org.example.ssu.assignment2.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
