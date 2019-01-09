package com.purchase.sevice;

import java.util.List;

import com.purchase.entity.Users;
public interface UsersService {

	List<Users> getAllUsers();

	Users getUserById(String username);
	
	boolean insertUser(Users user);
	
}
