package com.springproject.car_rental.services.auth;

import com.springproject.car_rental.dto.SignUpRequest;
import com.springproject.car_rental.dto.UserDto;

public interface AuthService {
    UserDto createCustomer(SignUpRequest signUpRequest);
}
