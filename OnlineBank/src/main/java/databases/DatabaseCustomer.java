package databases;

import java.util.HashMap;

import models.Account;
import models.Customer;
import models.Transaction;

public class DatabaseCustomer {

	private static HashMap <Integer, Customer> customer = new HashMap<Integer, Customer>();
	private static HashMap <Integer, Account> account = new HashMap<Integer, Account>();
	private static HashMap <String, Transaction> transaction = new HashMap<String, Transaction>();
	
	private static HashMap <Integer, Customer> getCustomer(){
		
		return customer;
		
	} 
	
	private static HashMap <Integer, Account> getAccount(){
		
		return account;
	} 
	
	private static  HashMap <String, Transaction> getTransaction(){
		
		return transaction;
		
	}
}
