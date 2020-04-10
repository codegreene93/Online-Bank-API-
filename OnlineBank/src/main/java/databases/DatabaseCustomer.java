package databases;

import java.util.HashMap;

public class DatabaseCustomer {

	private static HashMap <Integer, String> customer = new HashMap<Integer, String>();
	private static HashMap <Integer, String> account = new HashMap<Integer, String>();
	private static HashMap <String, Integer> transaction = new HashMap<String, Integer>();
	
	private static HashMap <Integer, String> getCustomer(){
		
		return customer;
		
	} 
	
	private static HashMap <Integer, String> getAccount(){
		
		return account;
	} 
	
	private static  HashMap <String, Integer> getTransaction(){
		
		return transaction;
		
	}
}
