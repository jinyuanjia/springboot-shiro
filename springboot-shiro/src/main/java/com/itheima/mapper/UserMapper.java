package com.itheima.mapper;

import com.itheima.domain.User;
public interface UserMapper {
	User findByName(String name);
	
	User findById(Integer id);
}
