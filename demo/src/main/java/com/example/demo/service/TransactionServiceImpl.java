package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.AccountDao;
import com.example.demo.dao.TransactionDao;
import com.example.demo.exception.InsufficientFundException;
import com.example.demo.model.Account;
import com.example.demo.model.Transaction;

@Service
public class TransactionServiceImpl implements TransactionService {

	@Autowired
	TransactionDao transactionDao;

	@Autowired
	AccountDao accountDao;

	@Override
	public List<Transaction> findAll() {
		return (List<Transaction>) transactionDao.findAll();
	}

	@Override
	public Transaction save(Transaction transaction) {
		Transaction returnTransaction = null;
		Account account = accountDao.findByNumber(transaction.getAccount().getNumber());
		if (transaction.isWithdrawn()) {

			if (account.getBalance() > transaction.getAmount()) {
				returnTransaction = transactionDao.save(transaction);
				account.setBalance(account.getBalance() - transaction.getAmount());
				accountDao.save(account);
			} else {
				throw new InsufficientFundException();
			}
		} else {
			returnTransaction = transactionDao.save(transaction);
			account.setBalance(account.getBalance() + transaction.getAmount());
			accountDao.save(account);
		}
		return returnTransaction;
	}

}
