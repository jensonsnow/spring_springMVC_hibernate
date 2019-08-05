package com.mvn.service.Impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mvn.dao.UserDao;
import com.mvn.entity.User;
import com.mvn.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	private UserDao userDao;
	
	
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}


	@Override
	@Transactional  
	public void save(User user) {
		// TODO Auto-generated method stub
		userDao.save(user);
	}

}
