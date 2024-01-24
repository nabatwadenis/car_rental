package com.springproject.car_rental.dto;

import com.springproject.car_rental.enums.UserRoles;
import lombok.Data;

@Data
public class UserDto {
    private Long id;
    private String name;
    private String email;

    private UserRoles userRoles;

    public void setId(Long id) {
    }
}
