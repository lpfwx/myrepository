package com.hyxy.service;

import java.util.List;
import java.util.Map;

import com.hyxy.entity.User;

public interface LoginService {
	//用户登录查询
		public List<User> selectLogin(Map<String, String> map);

		//查询所有用户信息
		public List<User> selectALL();

		public void insertUser(Map<String, String> map);
		
		public void deleteUser(Integer id);
		
		public void updateUser(User record);
		
}
