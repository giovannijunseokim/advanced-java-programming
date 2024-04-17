package org.example.ssu.assignment2.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Orders {
    @Id
    private int orderId;
    private int custId;
    private int bookId;
    private int salePrice;
    private Date orderDate;
}
