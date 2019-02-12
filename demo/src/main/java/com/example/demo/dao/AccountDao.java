package com.example.demo.dao;

import javax.persistence.Id;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Account;

public interface AccountDao extends CrudRepository<Account, Id> {

	Account findByNumber(int number);

}
