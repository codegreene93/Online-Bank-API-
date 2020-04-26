package resources;


import javax.ws.rs.Produces;

import java.util.LinkedHashSet;
import java.util.Map;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import models.Account;
import services.AccountServices;

@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML, MediaType.TEXT_PLAIN})
@Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML, MediaType.TEXT_PLAIN})

public class AccountResources {
	
	
	AccountServices accServ = new AccountServices();
	Account acc = new Account();

	@GET
	public Response getAccounts(@PathParam("customerId") int customerID) {
		Account accounts = accServ.getCustomer(customerID);
		
		
		return Response.status(Status.OK).entity(accounts).build();	
		}
	
	public Account getAccount(int customerID, int accountNo) {
		Account accounts = accServ.getCustomer(customerID);
		
		Map<String, Account> account = accServ.getAccounts();		
		
		for(Account accs : accServ.getAccount()) {
			if(acc.getAccountNo() == accountNo) {
				return accs;
			}
		}	
		return null;
		
		
	}
}

