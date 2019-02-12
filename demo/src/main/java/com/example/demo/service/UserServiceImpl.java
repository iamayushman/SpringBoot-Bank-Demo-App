package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.UserDao;
import com.example.demo.model.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserDao userDao;

	@Override
	public List<User> findAll() {

		return (List<User>) userDao.findAll();
	}

	@Override
	public User save(User user) {

		return userDao.save(user);
	}

}
