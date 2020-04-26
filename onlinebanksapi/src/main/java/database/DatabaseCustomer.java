package database;

import java.util.Map;
import java.util.TreeMap;

import models.Account;
import models.Customer;
import models.Transaction;

public class DatabaseCustomer {

	private static Map <Integer, Customer> customers = new TreeMap<Integer, Customer>();
	private static Map <String, Account> accounts = new TreeMap<String, Account>();
	private static Map <String, Transaction> transactions = new TreeMap<String, Transaction>();
	
	public static Map <Integer, Customer> getCustomer(){
		
		return customers;
		
	} 
	
	public static Map <String, Account> getAccount(){
		
		return accounts;
	} 
	
	public static  Map <String, Transaction> getTransaction(){
		
		return transactions;
		
	}
}
