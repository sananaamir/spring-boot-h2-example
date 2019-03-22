package com.sanan.h2example.entity;

import javax.persistence.Entity;
import javax.persistence.Id;


/**
 * This is an entity class for Student
 */

 @Entity
 public class User {
     @Id
     private int id;
     private String email;
     private String firstName;
     private String lastName;

     public void setId(int id) {
         this.id = id;
     }

     public void setEmail(String email) {
        this.email = email;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public String getEmail() {
        return email;   
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLasttName() {
        return lastName;
    }

    @Override
    public String toString() {
        return id + " " + email + " " + firstName + " " + lastName;
    }
 }