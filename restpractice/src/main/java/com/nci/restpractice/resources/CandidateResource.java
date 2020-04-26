package com.nci.restpractice.resources;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.nci.restpractice.models.Candidate;
import com.nci.restpractice.services.CandidateService;

@Path("/candidates")
@Produces(MediaType.APPLICATION_JSON)
public class CandidateResource {

	CandidateService candidateService = new CandidateService();
	
	@GET
	public List<Candidate> getCandidates(@QueryParam("city") String city, @QueryParam("profession") String profession) {
		 if ((city != null) || (profession != null)) {
             return candidateService.getCandidatesByCityAndProfession(city, profession);
		 }
		 return candidateService.getCandidates();
	}
	
	
	@GET
	@Path("/{candidateId}")
	public Candidate getCandidate(@PathParam("candidateId") int candidateId) {
		return candidateService.getCandidateById(candidateId-1);
	}
	
	
	@Path("/{candidateId}/skills")
	public SkillResource getSkillsResource() {
		return new SkillResource();
	}
	
}
