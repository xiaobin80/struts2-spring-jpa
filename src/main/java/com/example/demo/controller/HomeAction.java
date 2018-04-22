package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.model.UserDetails;
import com.example.demo.service.UserDetailsService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class HomeAction extends ActionSupport {
	@Autowired
	private UserDetailsService userService;
	
	public String index() {
		return SUCCESS;
	}
	
	public String userList() {
		List<UserDetails> users = userService.getUsers();
		
		for(UserDetails user : users) {
			System.out.println(user.getEmail() + " " + user.getName());
		}
		
		ActionContext ctx = ActionContext.getContext();
        ctx.put("users", users);
		
		return SUCCESS;
	}

}
