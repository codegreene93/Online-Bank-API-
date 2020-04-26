package com.nci.restpractice;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/aliens")
public class AlienResource {

	AlienRepository repo = new AlienRepository();
	
	@GET
	@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	public List<Alien> getAliens() {
		System.out.println("Get all aliens called.");
	
		return repo.getAliens();
	}
	
	@GET
	@Path("/alien/{param}")
	@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	public Alien getALien(@PathParam("param") int id) {
		System.out.println("Get a specific alien");
		
		return repo.getAlien(id);
	}
	
	@POST
	@Path("alien")
	@Consumes({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	public Alien createAlien(Alien a1) {
		System.out.println(a1);
		repo.createAlien(a1);
		return a1;
	}
	
	
	@PUT
	@Path("alien")
	@Consumes({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	public Alien updateAlien(Alien a1) {
		System.out.println(a1);

		if(repo.getAlien(a1.getId()).getId() == 0) {
			repo.createAlien(a1);
		}else {
			repo.updateAlien(a1);
		}

		return a1;
	}
	
	
	@DELETE
	@Path("/alien/{param}")
	public Alien killALien(@PathParam("param") int id) {
		Alien a = repo.getAlien(id);
		
		if(a.getId()!=0) {
			repo.delete(id);
		}
		
		return a;
	}

	
	
}
