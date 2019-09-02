package com.hyxy.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.hyxy.dao.UserMapper;
import com.hyxy.entity.User;

@Service
public class LoginServiceImp implements LoginService {
	@Resource
	private UserMapper UserMapper;

	@Override
	public List<User> selectLogin(Map<String, String> map) {
		return null;
	}

	@Override
	public List<User> selectALL() {
		List<User> list = UserMapper.selectAll();
		return list;
	}

	@Override
	public void insertUser(Map<String, String> map) {
		UserMapper.insertMap(map);
		
	}

	@Override
	public void deleteUser(Integer id) {
		UserMapper.deleteByPrimaryKey(id);
		
	}

	@Override
	public void updateUser(User record) {
		UserMapper.updateByPrimaryKey(record);
		
	}
	
}
