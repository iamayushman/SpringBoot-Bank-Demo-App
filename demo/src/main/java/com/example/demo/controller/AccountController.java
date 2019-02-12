package com.example.demo.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Account;
import com.example.demo.service.AccountService;

@RestController
public class AccountController {

	@Autowired
	AccountService accountService;

	@GetMapping("accounts")
	public List<Account> getAccounts() {
		return accountService.findAll();
	}

	@PostMapping("account")
	public Account createAccount(@Valid @RequestBody Account account) {
		return accountService.save(account);
	}
}
