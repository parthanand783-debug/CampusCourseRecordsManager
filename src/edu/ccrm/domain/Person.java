package edu.ccrm.domain;

import java.time.LocalDateTime;

public abstract class Person {
    private String id;
    private String fullName;
    private String email;
    private LocalDateTime createdDate;
    
    // Constructor - demonstrating encapsulation
    public Person(String id, String fullName, String email) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.createdDate = LocalDateTime.now();
    }
    
    // Abstract method - demonstrating abstraction
    public abstract void displayProfile();
    
    // Getters and setters - demonstrating encapsulation
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    
    public String getFullName() { return fullName; }
    public void setFullName(String fullName) { this.fullName = fullName; }
    
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    
    public LocalDateTime getCreatedDate() { return createdDate; }
    
    // Override toString() - demonstrating polymorphism
    @Override
    public String toString() {
        return String.format("ID: %s, Name: %s, Email: %s", id, fullName, email);
    }
}