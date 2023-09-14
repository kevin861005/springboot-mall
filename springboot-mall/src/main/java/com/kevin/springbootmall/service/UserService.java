package com.kevin.springbootmall.service;

import com.kevin.springbootmall.dto.UserLoginRequest;
import com.kevin.springbootmall.dto.UserRegisterRequest;
import com.kevin.springbootmall.model.User;

public interface UserService {
    Integer register(UserRegisterRequest userRegisterRequest);

    User getUserById(Integer userId);

    User login(UserLoginRequest userLoginRequest);
}
