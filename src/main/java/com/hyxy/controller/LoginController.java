package com.hyxy.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.hyxy.entity.User;
import com.hyxy.service.LoginService;

@Controller
@RequestMapping("loginController")
public class LoginController {
	@Autowired
	private LoginService LoginService;
	
	@RequestMapping("insertUser")
	public Object insertUser(@RequestParam Map<String, String> map) {
		LoginService.insertUser(map);
		return "login";
	}
	
	@RequestMapping("login")
	public Object login(Map<String, Object> map) {
		List<User> lists =  LoginService.selectALL();
		map.put("user", lists);
		return "login";
	}
	
	@RequestMapping("delete")
	public Object delete(int id,Map<String, Object> map){
		LoginService.deleteUser(id);
		List<User> lists =  LoginService.selectALL();
		map.put("user", lists);
		return "login";
	}
	
	@RequestMapping("update")
	public Object update(User user,Map<String, Object> map){
		LoginService.updateUser(user);
		List<User> lists =  LoginService.selectALL();
		map.put("user", lists);
		return "login";
	}
}
