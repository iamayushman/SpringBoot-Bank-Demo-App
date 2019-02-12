package com.example.demo.dao;

import javax.persistence.Id;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Transaction;

public interface TransactionDao extends CrudRepository<Transaction, Id> {

}
