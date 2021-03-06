package services;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import database.DatabaseCustomer;
import models.Account;
import models.Customer;

public class CustomerServices {

	Map <Integer, Customer> customers = DatabaseCustomer.getCustomer();
	
	
	public CustomerServices() {
	
	Customer cust1 = new Customer(001, "Anna", "Eyre Square, Galway,", "test@test.com", "FunkyMonk3y!","FunkyMonk3y!", 25);
	Customer cust2 = new Customer(002, "Julian", "Drumcondra, Dublin", "Julian@test.com", "hAppyda$h","hAppyda$h", 26);
	Customer cust3 = new Customer(003, "Rachel", "Kevin Street Lower, Dublin", "Rachel@test.com", "Password1", "Password1", 27);
	
	customers.put(001, new Customer(1, "Reggie", "Eyre Square, Galway,", "test@test.com", "FunkyMonk3y!","FunkyMonk3y!", 25));
	customers.put(002, new Customer(2,"Julian", "Drumcondra, Dublin", "Julian@test.com", "hAppyda$h","hAppyda$h", 26 ));
	customers.put(003, new Customer(3,"Rachel", "Kevin Street Lower, Dublin", "Rachel@test.com", "Password1", "Password1", 27));
	
	Map<Integer, Account> customer1 = customers.get(001).getAccounts();
	}
	
	public Map <Integer, Customer> getCustomers1(){
		
		return customers;
	}
	
	public List<Customer> getCustomers(){
		return new ArrayList<Customer>(customers.values());
	}
	
	public Customer getCustomer(int customerID) {
		Customer cust =  customers.get(customerID);
		
		if(cust == null) {
			String exception = "Customer ID " + customerID + " not found";
		}
		return cust;
	}
	
	public Customer deleteCustomer(int customerID) {
		Customer customer = getCustomer(customerID);
		customers.remove(customer);
		return customer;
	}
	
	public Customer createCustomer(Customer customer) {
		customer.setCustomerID(customers.size() + 1);
		customers.put(customer.getCustomerID(),customer);
		return customer;
	}
	
	public Customer getLogin(String email, String password) {
		Customer customer = new Customer();
		
		String customerEmail =  customer.getEmail();
		String customerPassword = customer.getPassword();
		
		if(customerEmail.equalsIgnoreCase(email) && customerPassword.equals(password)){
			return customer;
		
	}
		return customer;
	
	}
}
