package com.example.demo.entities;

import jakarta.persistence.Entity;

@Entity
public class Admin extends User {
    private Email email;

    public Admin() {
    }


    public Email getEmail() {
        return this.email;
    }

    public void setEmail(Email email) {
        this.email = email;
    }

    
}
