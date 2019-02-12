package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.AccountDao;
import com.example.demo.model.Account;
import com.example.demo.model.User;

@Service
public class AccountServiceImpl implements AccountService {

	@Autowired
	AccountDao accountDao;

	@Override
	public List<Account> findAll() {
		return (List<Account>) accountDao.findAll();
	}

	@Override
	public Account save(Account account) {
		return accountDao.save(account);
	}

}
