package services;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import databases.DatabaseCustomer;
import models.Account;
import models.Customer;
import models.Transaction;

public class TransactionServices {

	private Map <String, Transaction> transaction = DatabaseCustomer.getTransaction();
	
	public TransactionServices() {
		
	Transaction tran1 = new Transaction(480, 1, 10.02, "Lidl", "debit", 136);
	Transaction tran2 = new Transaction(481, 2, 11.02, "Tesco", "Credit", 200);
	Transaction tran3 = new Transaction(482, 3, 14.02, "transfer", "saving", 1600);
	
	transaction.put("Lidl", tran1);
	transaction.put("Lidl", tran1);
	transaction.put("Lidl", tran1);
	
	}
	
	public List<Transaction> getTransaction(){
		return new ArrayList<Transaction>(transaction.values());
	}
	
	public Transaction getTransaction(int transactionCode) {
		Transaction trans =  trans.get(transactionCode);
		
		if(trans == null) {
			String exception = "Customer ID " + customerID + " not found";
		}
		return trans;
	}
	
	
}
