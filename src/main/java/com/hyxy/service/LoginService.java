package com.hyxy.service;

import java.util.List;
import java.util.Map;

import com.hyxy.entity.User;

public interface LoginService {
	//�û���¼��ѯ
		public List<User> selectLogin(Map<String, String> map);

		//��ѯ�����û���Ϣ
		public List<User> selectALL();

		public void insertUser(Map<String, String> map);
		
		public void deleteUser(Integer id);
		
		public void updateUser(User record);
		
}
