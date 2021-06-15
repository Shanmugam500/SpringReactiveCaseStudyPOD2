package com.bank.account.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.account.model.Account;
import com.bank.account.repo.AccountsRepo;

import reactor.core.publisher.Mono;

@Service
public class AccountServiceImpl implements AccountService{
	
	@Autowired
	AccountsRepo accountsRepo;
	
	
	public Mono<Account> createAccount(Account account){
		
		return	accountsRepo.save(account);
	}

}
