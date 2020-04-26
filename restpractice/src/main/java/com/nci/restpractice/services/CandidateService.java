package com.nci.restpractice.services;

import java.util.ArrayList;
import java.util.List;

import com.nci.restpractice.database.DatabaseClass;
import com.nci.restpractice.models.Candidate;

public class CandidateService {
	
	DatabaseClass db = new DatabaseClass();
	
	private List<Candidate> candidates = db.getCandidates();

	public CandidateService() {
		
	}
	
	public List<Candidate> getCandidates(){
		return candidates;
	}
	

	public Candidate getCandidateById(int candidateId) {
		return candidates.get(candidateId);
	}
	
	
	public List<Candidate> getCandidatesByCityAndProfession(String city, String profession){
		List<Candidate> list = new ArrayList<>();
		
		for(Candidate candidate:candidates) {
			if((city == null || candidate.getCity().equalsIgnoreCase(city)) 
					&& (profession == null || candidate.getProfession().equalsIgnoreCase(profession))) {
				list.add(candidate);
			}
		}
		return list;
	}
	
	
	

}
