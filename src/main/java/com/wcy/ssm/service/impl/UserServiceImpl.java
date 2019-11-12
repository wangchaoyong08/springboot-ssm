package com.wcy.ssm.service.impl;

import com.wcy.ssm.beans.User;
import com.wcy.ssm.mapper.UserMapper;
import com.wcy.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;
    @Override
    public List<User> findAllUser() {
        return userMapper.findAll();
    }
}
