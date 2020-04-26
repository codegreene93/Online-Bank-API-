package services;



import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import database.DatabaseCustomer;
import models.Account;
import models.Customer;
import models.Transaction;

public class AccountServices {
	
	Customer cust = new Customer();

	private Map <String, Account> accounts = DatabaseCustomer.getAccount();
	Map <Integer, Customer> customers = DatabaseCustomer.getCustomer();
	
	public AccountServices() {
		Account acc1 = new Account(1, 001,"Chris", 456, "Debit Acc", 156);
		Account acc2 = new Account(2, 002, "Debbie", 564, "Credit Acc", 234);
		Account acc3 = new Account(3, 003, "Blake", 654, "Savings Acc", 1560);
		
		accounts.put("Debit Acc", acc1);
		accounts.put("Credit Acc", acc2);
		accounts.put("Saving Acc", acc3);
	}
	
	public List<Account> getAccount(){
		return new ArrayList<Account>(accounts.values());
	}
	
public Map<String, Account> getAccounts(){
		
		return accounts;
	}
	
	public Account getCustomer(int customerID) {
		Customer cust =  customers.get(customerID);
		
		if(cust == null) {
			String exception = "Customer ID " + customerID + " not found";
		}
		return null;
	}
	
	public Account getAccount(int accountNo) {
		Account acc = accounts.get(accountNo);
		
		if(acc == null) {
			String exception = "Account No " + accountNo + " not found";
		}
		return acc;
	}
	
	public Account newAccount(Account account) {
		account.setAccountNo(accounts.size() + 1);
		accounts.put(account.getAccountType(),account);
		return account;
	}
	
	//Add a method to get an account by customer name
	public Account getAccountByName(String customerName) {
		Account cust = accounts.get(customerName);
		
		if(cust == null) {
			String exception = "Customer  " + customerName + " not found";
		}
		return cust;
	}
	

	
	//Add a method to remove an account by customer name
	public Account removeAccount(String customerName) {
		return accounts.remove(customerName);
	}
}
