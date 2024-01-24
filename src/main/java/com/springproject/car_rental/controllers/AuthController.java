package com.springproject.car_rental.controllers;

import com.springproject.car_rental.dto.SignUpRequest;
import com.springproject.car_rental.dto.UserDto;
import com.springproject.car_rental.services.auth.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
public class AuthController {

    private  AuthService authService;
    @PostMapping("/signup")

    public ResponseEntity<?> signUpCustomer(@RequestBody SignUpRequest signUpRequest){
        UserDto createdCustomerDto =authService.createCustomer(signUpRequest);
        if(createdCustomerDto == null) return new ResponseEntity<>(
                "customer not created", HttpStatus.BAD_REQUEST);
        return  new ResponseEntity<>(createdCustomerDto, HttpStatus.CREATED);

    }
}
