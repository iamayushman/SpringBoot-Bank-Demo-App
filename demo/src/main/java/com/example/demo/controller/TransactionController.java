package com.example.demo.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Transaction;
import com.example.demo.service.TransactionService;

@RestController
public class TransactionController {

	@Autowired
	TransactionService transactionService;

	@GetMapping("transactions")
	public List<Transaction> getTransactions() {
		return transactionService.findAll();
	}

	@PostMapping("transaction")
	public Transaction createTransaction(@Valid @RequestBody Transaction transaction) {
		return transactionService.save(transaction);
	}
}
