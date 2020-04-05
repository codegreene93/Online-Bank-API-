package com.amy.OnlineBank;

public class OnlineBankModel {
	
	
	public OnlineBankModel() {
		
	}
	
	/* Customer */
	private int customerId;
	private String name;
	private String address;
	private String email;
	private String password;
	private String accounts;
	
	/* Accounts */
	private int accountNo;
	private int sortCode;
	private double balance;
	private String transactions;
	/*Transactions */
	private int transactionCode;
	private int date;
	private String description;
	
	/*Setters and Getters */
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAccounts() {
		return accounts;
	}
	public void setAccounts(String accounts) {
		this.accounts = accounts;
	}
	public int getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	public int getSortCode() {
		return sortCode;
	}
	public void setSortCode(int sortCode) {
		this.sortCode = sortCode;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getTransactions() {
		return transactions;
	}
	public void setTransactions(String transactions) {
		this.transactions = transactions;
	}
	public int getTransactionCode() {
		return transactionCode;
	}
	public void setTransactionCode(int transactionCode) {
		this.transactionCode = transactionCode;
	}
	public int getDate() {
		return date;
	}
	public void setDate(int date) {
		this.date = date;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}



	
	

}
