package com.bank.account.model;

import java.io.Serializable;
import java.util.Date;

import org.springframework.data.annotation.Id;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Account implements Serializable{
	

	private static final long serialVersionUID = 1530699992135610397L;

	@Id
	private int accountno;
	private String userid;
	private String accounttype;
	private double balance;
	@JsonIgnore
	private Date accountcreated;
	@JsonIgnore
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
	
	public int getAccountno() {
		return accountno;
	}

	public void setAccountno(int accountno) {
		this.accountno = accountno;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getAccounttype() {
		return accounttype;
	}

	public void setAccounttype(String accounttype) {
		this.accounttype = accounttype;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public Date getAccountcreated() {
		return accountcreated;
	}

	public void setAccountcreated(Date accountcreated) {
		this.accountcreated = accountcreated;
	}

	public Date getAccountupdated() {
		return accountupdated;
	}

	public void setAccountupdated(Date accountupdated) {
		this.accountupdated = accountupdated;
	}

	public String getAccountstatus() {
		return accountstatus;
	}

	public void setAccountstatus(String accountstatus) {
		this.accountstatus = accountstatus;
	}

	public String getAccountbranch() {
		return accountbranch;
	}

	public void setAccountbranch(String accountbranch) {
		this.accountbranch = accountbranch;
	}
	
}
