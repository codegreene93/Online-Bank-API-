package models;

public class Account {

	public Account() {
		
	}
	
	public Account(int accountNo, int customerID,int sortNo, String accountType, int balance,int transactions) {
		this.accountNo = accountNo;
		this.customerID= customerID;
		this.sortNo = sortNo;
		this.accountType = accountType;
		this.balance = balance;
		this.transactions=transactions;
	}
	
	private int accountNo;
	private int customerID;
	private int sortNo;
	private String accountType;
	private int balance;
	private int transactions;
	
	public int getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	public int getCustomerID() {
		return customerID;
	}
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	public int getSortNo() {
		return sortNo;
	}
	public void setSortNo(int sortNo) {
		this.sortNo = sortNo;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public int getTransactions() {
		return transactions;
	}
	public void setTransactions(int transactions) {
		this.transactions = transactions;
	}
	
	
	
}
