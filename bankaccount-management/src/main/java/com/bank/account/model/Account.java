package com.bank.account.model;

import java.io.Serializable;
import java.util.Date;

import org.springframework.data.annotation.Id;

import lombok.Data;

@Data
public class Account implements Serializable{
	
	private static final long serialVersionUID = 1530699992135610397L;

	@Id
	private int accountno;
	private String userid;
	private String accounttype;
	private double balance;
	private Date accountcreated;
	private Date accountupdated;
	private String accountstatus;
	private String accountbranch;

	public Account() {

	}

	public Account(int accountno, String userid, String accounttype, double balance, Date accountcreated,
			Date accountupdated, String accountstatus, String accountbranch) {
		super();
		this.accountno = accountno;
		this.userid = userid;
		this.accounttype = accounttype;
		this.balance = balance;
		this.accountcreated = accountcreated;
		this.accountupdated = accountupdated;
		this.accountstatus = accountstatus;
		this.accountbranch = accountbranch;
	}
}
