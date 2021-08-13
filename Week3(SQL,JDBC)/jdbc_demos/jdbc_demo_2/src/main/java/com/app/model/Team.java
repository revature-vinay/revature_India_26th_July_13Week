package com.app.model;

public class Team {

	private int id;
	private String teamName;
	
	public Team() {
		// TODO Auto-generated constructor stub
	}

	public Team(String teamName) {
		super();
		this.teamName = teamName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	@Override
	public String toString() {
		return "Team [id=" + id + ", teamName=" + teamName + "]";
	}
	
}
