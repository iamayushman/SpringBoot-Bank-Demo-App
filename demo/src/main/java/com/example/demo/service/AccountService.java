package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Account;

public interface AccountService {

	List<Account> findAll();

	Account save(Account account);

}
