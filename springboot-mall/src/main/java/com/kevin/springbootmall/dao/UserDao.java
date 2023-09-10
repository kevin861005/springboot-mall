package com.kevin.springbootmall.dao;

import com.kevin.springbootmall.dto.UserRegisterRequest;
import com.kevin.springbootmall.model.User;

public interface UserDao {

    Integer createUser(UserRegisterRequest userRegisterRequest);

    User getUserById(Integer userId);
}
