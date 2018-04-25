package com.gree.lss.springsecurity.service;

import com.gree.lss.springsecurity.mapper.UserMapper;
import com.gree.lss.springsecurity.model.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class UserService implements UserDetailsService{

    @Autowired
    private UserMapper userMapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserEntity user = userMapper.findByName(username);
        if (user == null) {
            throw new UsernameNotFoundException("未有此用户:" + username + "信息！");
        }
        return user;
    }
}
