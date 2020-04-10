package databases;

import java.util.HashMap;

public class DatabaseCustomer {

	private static HashMap <Integer, String> customer = new HashMap<Integer, String>();
	private static HashMap <Integer, Integer> account = new HashMap<Integer, Integer>();
	private static HashMap <Integer, Integer> transaction = new HashMap<Integer, Integer>();
	
	private static HashMap <Integer, String> getCustomer(){
		
		return customer;
		
	} 
	
	private static HashMap <Integer, Integer> getAccount(){
		
		return account;
	} 
	
	private static HashMap <Integer, Integer> getTransaction(){
		
		return account;
		
	}
}
