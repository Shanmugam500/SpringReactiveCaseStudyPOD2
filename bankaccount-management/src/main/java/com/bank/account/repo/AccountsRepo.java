package com.bank.account.repo;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import com.bank.account.model.Account;

//import com.bank.account.entity.Account;

public interface AccountsRepo extends ReactiveCrudRepository<Account, Integer> {
	
	

}
