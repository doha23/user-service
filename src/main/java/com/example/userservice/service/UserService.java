package com.example.userservice.service;

import com.example.userservice.dto.UserDto;
import com.example.userservice.jpa.UserEntity;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    UserDto createsUser(UserDto userDto);
    
    UserDto getUserByUserId(String userId);
    Iterable<UserEntity> getUserByAll(); // 반복적인 데이터

    UserDto getUserDetailByEmail(String userName);
}
