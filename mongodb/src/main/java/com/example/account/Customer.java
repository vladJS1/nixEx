package com.example.account;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("Customer_collection")
public class Customer {
    @Id
    public String id;
    public String firstName;
    public String lastName;

    public Customer() { }

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return String.format("Customer[i=%s, firstName=%s, lastName=%s]",id, firstName, lastName);
    }
}
