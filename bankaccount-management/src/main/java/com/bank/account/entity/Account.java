package com.bank.account.entity;

import java.util.Date;

import org.springframework.data.relational.core.mapping.Table;



public class Account {
	
	//@Column()
	private long accountNo;
	private String userId;
	private String accountType;
	private double balance;
	private Date accountCreated;
	private Date accountUpdated;
	private String accountStatus;
	private String accountBranch;	

}
