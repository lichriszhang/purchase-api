package com.purchase.sevice.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.purchase.entity.Users;
import com.purchase.entity.UsersExample;
import com.purchase.mapper.UsersMapper;
import com.purchase.sevice.UsersService;
@Service
public class UsersServiceImpl implements UsersService {

	@Autowired
	private UsersMapper userMapper;
	@Override
	public List<Users> getAllUsers() {
		UsersExample example = new UsersExample();
		return userMapper.selectByExample(example);
	}
}
