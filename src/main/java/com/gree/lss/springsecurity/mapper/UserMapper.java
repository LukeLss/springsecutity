package com.gree.lss.springsecurity.mapper;

import com.gree.lss.springsecurity.model.UserEntity;

public interface UserMapper {
    UserEntity findByName(String username);
}
