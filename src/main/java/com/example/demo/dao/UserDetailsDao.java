package com.example.demo.dao;

import java.util.List;

import com.example.demo.model.UserDetails;

public interface UserDetailsDao {
	List<UserDetails> getUserDetails();
	UserDetails findUserById(String userId);
	int delUserById(int userId);
	int insertUser(UserDetails user);
	int updateUser(String userName, int userId);
}
