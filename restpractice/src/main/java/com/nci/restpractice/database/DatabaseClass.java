package com.nci.restpractice.database;

import java.util.ArrayList;
import java.util.List;

import com.nci.restpractice.models.Candidate;
import com.nci.restpractice.models.Skill;

public class DatabaseClass {
	private static List<Candidate> candidates = new ArrayList<>();
	private static List<Skill> skills = new ArrayList<>();
    public static boolean init = true;

    
   public DatabaseClass () {
     if (init) {
         
       Skill s1 = new Skill(1,"Java");  
       Skill s2 = new Skill(2,"SQL");
       Skill s3 = new Skill(3,"HTML");
       
       skills.add(s1);
       skills.add(s2);
       skills.add(s3);
       
     
       Candidate c1 = new Candidate(1, "Wilmir", "Analyst", "Dublin", skills);
       Candidate c2 = new Candidate(2, "Rhea", "Engineer", "Madrid", skills);
       Candidate c3 = new Candidate(3, "Jhon", "Nurse", "San Francisco", skills);
       Candidate c4 = new Candidate(4, "Tomas", "Banker", "Geneva", skills);
       Candidate c5 = new Candidate(5, "Alice", "Lecturer", "Shanghai", skills);

       
       candidates.add(c1);
       candidates.add(c2);
       candidates.add(c3);
       candidates.add(c4);
       candidates.add(c5);
       
       init = false;
    }
   }
   

	public static List<Candidate> getCandidates(){
		return candidates;
	}
	
	
	public static List<Skill> getSkills(){
		return skills;
	}
	
}

