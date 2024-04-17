package org.example.ssu.assignment2.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Customer {
    @Id
    private int custId;
    private String name;
    private String address;
    private String phone;
}
