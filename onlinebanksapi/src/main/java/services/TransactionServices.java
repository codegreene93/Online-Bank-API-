package services;



import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import database.DatabaseCustomer;
import models.Account;
import models.Customer;
import models.Transaction;

public class TransactionServices {

	private Map <String, Transaction> transaction = DatabaseCustomer.getTransaction();
	
	private Map <Integer, Customer> customers = DatabaseCustomer.getCustomer();
	
	public TransactionServices() {
		
	Transaction tran1 = new Transaction(480, 136, 1, 001, 10.02, "Lidl", "debit", 136);
	Transaction tran2 = new Transaction(481, 136, 2, 002, 11.02, "Tesco", "Credit", 200);
	Transaction tran3 = new Transaction(482, 136, 3, 003, 14.02, "transfer", "saving", 1600);
	
	transaction.put("Lidl", tran1);
	transaction.put("Lidl", tran1);
	transaction.put("Lidl", tran1);
	
	}
	
	public List<Transaction> getTransaction(){
		return new ArrayList<Transaction>(transaction.values());
	} 
	

	//please add a method to remove a transaction
	public Transaction removeTransaction(int transactionCode) {
		return transaction.remove(transactionCode);
	}

	
}
