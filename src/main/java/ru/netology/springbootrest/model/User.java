package ru.netology.springbootrest.model;

import jakarta.validation.constraints.NotBlank;

public class User {
    @NotBlank(message = "Username cannot be blank")
    private String user;

    @NotBlank(message = "Password cannot be blank")
    private String password;

    // Конструкторы, геттеры и сеттеры
    public User() {}

    public User(String user, String password) {
        this.user = user;
        this.password = password;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
