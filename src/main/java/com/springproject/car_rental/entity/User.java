package com.springproject.car_rental.entity;

import com.springproject.car_rental.enums.UserRoles;
import jakarta.persistence.*;
import lombok.Data;


@Entity
@Data
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String password;
    private UserRoles userRoles;


    public String getName() {
        return name;
    }

    public void setUserRole(Object userRoles) {
    }

    public void setPassword(String password) {
    }

    public void setEmail(String email) {
    }

    public void setName(String name) {
    }

    public Long getId() {
        return
    }
}
