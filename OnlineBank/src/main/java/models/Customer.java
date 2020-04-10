package models;

public class Customer {

	public Customer() {
		
	}
	
	public Customer(int customerID, String name, String address, String email, String password, String reenterPassword, String accounts,int accountNo) {
		this.customerID= customerID;
		this.name = name;
		this.address = address;
		this.email = email;
		this.password=password;
		this.reenterPassword = reenterPassword;
		this.accounts = accounts;
		this.accountNo=accountNo;
	}
	
	private int customerID;
	private String name;
	private String address;
	private String email;
	private String password;
	private String reenterPassword;
	private String accounts;
	private int accountNo;
	
	
	
	public int getCustomerID() {
		return customerID;
	}
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
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
	public String getReenterPassword() {
		return reenterPassword;
	}
	public void setReenterPassword(String reenterPassword) {
		this.reenterPassword = reenterPassword;
	}
	
	
}
