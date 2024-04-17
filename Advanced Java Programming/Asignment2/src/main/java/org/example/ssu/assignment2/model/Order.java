package org.example.ssu.assignment2.model;

import lombok.Getter;
import lombok.Setter;

import java.sql.Date;

@Getter
@Setter
public class Order {
    private int orderId;
    private int customerId;
    private int bookId;
    private int salePrice;
    private Date orderdate;
}
