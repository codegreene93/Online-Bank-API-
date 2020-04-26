package com.nci.restpractice.services;

import java.util.List;

import com.nci.restpractice.database.DatabaseClass;
import com.nci.restpractice.models.Candidate;
import com.nci.restpractice.models.Skill;

public class SkillService {
	DatabaseClass db = new DatabaseClass();
	private List<Candidate> candidates = db.getCandidates();
	private List<Skill> skills = db.getSkills();
	
	public SkillService() {
		
	}
	
	public List<Skill> getAllSkills(){
		return skills;
	}
	
	public List<Skill> getSkillsByCandidate(int candidateId){
		return candidates.get(candidateId).getSkills();
	}
	
	public Skill getSkillById(int candidateId, int skillId) {
		return candidates.get(candidateId).getSkills().get(skillId);
	}
	
	
	
}
