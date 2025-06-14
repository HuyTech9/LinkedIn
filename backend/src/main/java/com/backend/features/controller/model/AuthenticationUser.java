package com.backend.features.controller.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name = "user")
public class AuthenticationUser {
    @Id
    private long id;
    private String email;
    private String password;

    public AuthenticationUser(long id, String email, String password) {
        this.id = id;
        this.email = email;
        this.password = password;
    }
    public AuthenticationUser() {

    }

    public void setId(long id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }



    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
