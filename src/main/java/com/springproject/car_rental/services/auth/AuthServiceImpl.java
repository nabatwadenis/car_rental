package com.springproject.car_rental.services.auth;

import com.springproject.car_rental.dto.SignUpRequest;
import com.springproject.car_rental.dto.UserDto;
import com.springproject.car_rental.entity.User;
import com.springproject.car_rental.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService {
    private UserRepository userRepository;


    @Override
    public UserDto createCustomer(SignUpRequest signUpRequest) {
        User user = new User();
        user.setName(signUpRequest.getName());
        user.setEmail(signUpRequest.getEmail());
        user.setPassword(signUpRequest.getPassword());
        user.setUserRole(signUpRequest.getUserRoles());
        User createdUser = userRepository.save(user);
        UserDto userDto = new UserDto();
        userDto.setId(createdUser.getId());
        return userDto;
    }
}
