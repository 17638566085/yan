package com.yan.springboot.service.impl;

import com.yan.springboot.entity.User;
import com.yan.springboot.mapper.UserMapper;
import com.yan.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 2018/8/26$ {Yan_y}
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> findUserId() {

        return userMapper.getUserId();

    }
}
