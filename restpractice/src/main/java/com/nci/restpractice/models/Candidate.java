package com.nci.restpractice.models;

import java.util.ArrayList;
import java.util.List;

import javax.json.bind.annotation.JsonbTransient;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@XmlRootElement
public class Candidate {
	private int id;
	private String name;
	private String profession;
	private String city;
	private List<Skill> skills = new ArrayList<>();
	
	public Candidate() {
		
	}
	
	public Candidate(int id, String name, String profession, String city, List<Skill> skills) {
		this.id = id;
		this.name = name;
		this.profession = profession;
		this.city = city;
		this.skills = skills;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public List<Skill> getSkills() {
		return skills;
	}

	public void setSkills(List<Skill> skills) {
		this.skills = skills;
	}
	
}
