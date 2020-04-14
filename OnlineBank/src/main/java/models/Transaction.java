package models;

import java.util.Map;
import java.util.TreeMap;

public class Transaction {
	private int transactionCode;
	private int accountNo;
	private double date;
	private String description;
	private String transactionType;
	private int newBalance;
	private static Map <String, Account> accounts = new TreeMap<String, Account>();
	
	public Transaction() {
		
	}
	
	public Transaction(int transactionCode, int accountNo, double date, String description, String transactionType, int newBalance) {
		this.transactionCode=transactionCode;
		this.accountNo=accountNo;
		this.date = date;
		this.description = description;
		this.transactionType=transactionType;
		this.newBalance= newBalance;
	}
	
	public int getTransactionCode() {
		return transactionCode;
	}
	public void setTransactionCode(int transactionCode) {
		this.transactionCode = transactionCode;
	}
	public int getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	public double getDate() {
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
	public String getTransactionType() {
		return transactionType;
	}
	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}
	public int getNewBalance() {
		return newBalance;
	}
	public void setNewBalance(int newBalance) {
		this.newBalance = newBalance;
	}	
}
