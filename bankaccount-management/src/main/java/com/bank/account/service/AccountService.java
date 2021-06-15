package com.bank.account.service;

import com.bank.account.model.Account;

import reactor.core.publisher.Mono;

public interface AccountService {
	
	
	public Mono<Account> createAccount(Account account);

}
