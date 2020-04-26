package org.wilmir.java.rest;

import java.util.Calendar;
import java.util.Date;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("test")
public class MyResource {
	
	@GET
	@Produces({MediaType.TEXT_PLAIN,"text/shortdate"})
	public Date testMethod() {
		return Calendar.getInstance().getTime();
	}

	
/*
@Path("{pathParam}/test")
public class MyResource {
	
	@PathParam("pathParam") private String pathParamExample;
	@QueryParam("query") private String queryParamExample;
	
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String testMethod() {
		return "It works! Path param used is " + pathParamExample + " and Query Param used is " + queryParamExample;
	}
*/

/*
@Singleton
public class MyResource {
	
	private int count;

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String testMethod() {
		count++;
		return "It works! This method was caled " + count + " times";
	}
*/	
	
	
	
}
