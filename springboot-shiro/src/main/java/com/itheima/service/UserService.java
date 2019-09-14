package com.itheima.service;

import com.itheima.domain.User;

public interface UserService {
	User findByName(String name);
	
	User findById(Integer id);
}
