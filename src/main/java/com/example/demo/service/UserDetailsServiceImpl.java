package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.UserDetailsDao;
import com.example.demo.model.UserDetails;

@Service("userService")
public class UserDetailsServiceImpl implements UserDetailsService {
	
	@Autowired
	private UserDetailsDao userDao;
	
	public void setUserDao(UserDetailsDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public List<UserDetails> getUsers() {
		// TODO Auto-generated method stub
		return userDao.getUserDetails();
	}
	
	@Override
	public UserDetails findUserById(String userId) {
		// TODO Auto-generated method stub
		return userDao.findUserById(userId);
	}

	@Override
	public int delUserById(int userId) {
		// TODO Auto-generated method stub
		return userDao.delUserById(userId);
	}
	
	@Override
	public int insertUser(UserDetails user) {
		// TODO Auto-generated method stub
		return userDao.insertUser(user);
	}
	
	@Override
	public int updateUser(String userName, int userId) {
		// TODO Auto-generated method stub
		return userDao.updateUser(userName, userId);
	}
}
