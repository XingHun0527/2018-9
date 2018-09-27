package com.briup.jsp.service;

import com.briup.jsp.bean.User;

/**
 * 业务逻辑层	
 * 业务功能  用户功能
 * 			注册
 * 			登陆
 * 			查看
 * 			修改
 * 			注销
 * */
public interface IUserService {
	//ok error
	/**
	 * 注册用户
	 * */
	String registerUser(User user);
	//ok error
	/**
	 * 登陆用户
	 * */
	String loginUser(String username,String password);
	/**
	 * 查看用户信息
	 * */
	User selectUserByName(String username);
	/**
	 * 修改用户信息
	 * */
	void updateUser(User user);
	/**
	 * 注销用户信息 删除
	 * */
	void deleteUser(User user);
	
	
}
