package org.example.ssu.assignment2.repository;

import org.example.ssu.assignment2.model.Orders;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdersRepository extends JpaRepository<Orders, Integer> {
}
