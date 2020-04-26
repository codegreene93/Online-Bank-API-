package com.nci.restpractice.models;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Skill {
	private int id;
	private String skill;
	
	public Skill() {
		
	}
	
	public Skill(int id, String skill) {
		this.id = id;
		this.skill = skill;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}
	
	
	
	
	
	
	
}
