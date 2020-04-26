package com.nci.restpractice.resources;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.nci.restpractice.models.Skill;
import com.nci.restpractice.services.SkillService;

@Produces(MediaType.APPLICATION_JSON)
public class SkillResource {
	
	private SkillService skillService = new SkillService();
	
	@GET
	public List<Skill> getSkills(@PathParam("candidateId") int candidateId){
		return skillService.getAllSkills();
	}

	@GET
	@Path("/{skillId}")
	public Skill getSkill(@PathParam("candidateId") int candidateId, @PathParam("skillId") int skillId) {
		return skillService.getSkillById(candidateId-1, skillId-1);
	}
	
}
