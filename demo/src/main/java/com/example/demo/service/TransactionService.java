package com.example.demo.service;

import java.util.List;
import com.example.demo.model.Transaction;

public interface TransactionService {

	List<Transaction> findAll();

	Transaction save(Transaction transaction);

}
