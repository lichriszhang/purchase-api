package com.purchase.mapper;

import java.util.List;

import org.springframework.stereotype.Component;

import com.purchase.entity.Users;
@Component
public interface UsersMapper {

    List<Users> selectAllUsers();

}