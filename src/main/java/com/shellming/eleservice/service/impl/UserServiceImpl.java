package com.shellming.eleservice.service.impl;

import com.shellming.eleservice.entity.User;
import com.shellming.eleservice.mapper.UserMapper;
import com.shellming.eleservice.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> list(Map map){
        System.out.println("map" + map);
        List ret = userMapper.list(map);
        System.out.println("ret" + ret);
        return ret;
    }

    @Override
    public int create(User map) {
        System.out.println("map" + map);
        int ret = userMapper.insert(map);
        System.out.println("ret" + ret);
        return ret;
    }
}