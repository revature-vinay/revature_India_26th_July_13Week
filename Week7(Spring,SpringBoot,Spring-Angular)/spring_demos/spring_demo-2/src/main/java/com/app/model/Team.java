package com.app.model;

public class Team {

	private int teamId;
	private String teamName;
	private String coachName;
	
	public Team() {
		// TODO Auto-generated constructor stub
	}

	public int getTeamId() {
		return teamId;
	}

	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public String getCoachName() {
		return coachName;
	}

	public void setCoachName(String coachName) {
		this.coachName = coachName;
	}

	@Override
	public String toString() {
		return "Team [teamId=" + teamId + ", teamName=" + teamName + ", coachName=" + coachName + "]";
	}
	
}
