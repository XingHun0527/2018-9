package com.briup.jsp.dao;

import java.util.List;

import com.briup.jsp.bean.User;

/**
 * 与数据库中的用户表进行交互的操作
 * 增删改查
 * */
public interface IUserDao {
	void saveUser(User user);
	void deleteUser(User user);
	void updateUser(User user);
	// find select get
	User selectUserByName(String name);
	List<User> selectAllUser();
}




