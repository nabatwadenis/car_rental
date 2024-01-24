package com.springproject.car_rental.dto;

public class SignUpRequest {
    private String email;
    private String name;
    private String password;


    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return  password;
    }

    public Object getUserRoles() {
    }
}
