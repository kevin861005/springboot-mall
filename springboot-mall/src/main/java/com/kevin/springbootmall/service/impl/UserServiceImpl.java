package com.kevin.springbootmall.service.impl;

import com.kevin.springbootmall.dao.UserDao;
import com.kevin.springbootmall.dto.UserRegisterRequest;
import com.kevin.springbootmall.model.User;
import com.kevin.springbootmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public Integer register(UserRegisterRequest userRegisterRequest) {
        return userDao.createUser(userRegisterRequest);
    }

    @Override
    public User getUserById(Integer userId) {
        return userDao.getUserById(userId);
    }
}
