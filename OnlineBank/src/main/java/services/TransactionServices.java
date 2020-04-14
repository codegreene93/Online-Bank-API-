package services;

import java.util.Map;

import databases.DatabaseCustomer;
import models.Transaction;

public class TransactionServices {

	private Map <String, Transaction> transactions = DatabaseCustomer.getTransaction();
	
	Transaction tran1 = new Transaction(480, 1, 10.02, "Lidl", "debit", 136);
	Transaction tran2 = new Transaction(481, 2, 11.02, "Tesco", "Credit", 200);
	Transaction tran3 = new Transaction(482, 3, 14.02, "transfer", "saving", 1600);
	
	
}
