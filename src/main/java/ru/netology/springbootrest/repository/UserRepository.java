package ru.netology.springbootrest.repository;

import ru.netology.springbootrest.model.Authorities;

import java.util.Arrays;
import java.util.List;

public class UserRepository {
    public List<Authorities> getUserAuthorities(String user, String password) {
        // Имитация базы данных пользователей
        if ("admin".equals(user) && "12345".equals(password)) {
            return Arrays.asList(Authorities.READ, Authorities.WRITE, Authorities.DELETE);
        } else if ("user".equals(user) && "54321".equals(password)) {
            return Arrays.asList(Authorities.READ);
        }
        return List.of();
    }
}
