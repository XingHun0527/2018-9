package com.briup.jsp.service.impl;

import com.briup.jsp.bean.User;
import com.briup.jsp.dao.impl.UserDaoImpl;
import com.briup.jsp.service.IUserService;

public class UserServiceImpl implements IUserService{

	//ok  error
	@Override
	public String registerUser(User user) {
		//如何实现注册  数据 user
		//借助与dao层代码
		//1.判断用户名是否被占用
		UserDaoImpl userDaoImpl=new UserDaoImpl();
		User user2=userDaoImpl.selectUserByName(user.getName());
		if(user2==null) {
			//2.没有注册，执行注册操作，返回ok
			userDaoImpl.saveUser(user);
			return "ok";
		}else {
			//3.注册，返回error
			return "error";
		}
	}

	@Override
	public String loginUser(String username, String password) {
		return null;
	}

	@Override
	public User selectUserByName(String username) {
		return null;
	}

	@Override
	public void updateUser(User user) {
		
	}

	@Override
	public void deleteUser(User user) {
		
	}

}
