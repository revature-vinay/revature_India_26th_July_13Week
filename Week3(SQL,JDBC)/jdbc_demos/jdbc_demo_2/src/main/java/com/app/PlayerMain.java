package com.app;

import java.util.List;

import com.app.dao.PlayerDAO;
import com.app.dao.TeamDAO;
import com.app.dao.impl.PlayerDAOImpl;
import com.app.dao.impl.TeamDAOImpl;
import com.app.exception.BusinessException;
import com.app.model.Player;
import com.app.model.Team;

public class PlayerMain {

	public static void main(String[] args) {

		PlayerDAO playerDAO = new PlayerDAOImpl();

//		try {
//			List<Player> playerList=playerDAO.getAllPlayers();
//			for(Player player:playerList) {
//				System.out.println(player);
//			}
//		} catch (BusinessException e) {
//			System.out.println(e.getMessage());
//		}

//		Player player = new Player(101, "Ms Dhoni", 35, "Ranchi", "M", "Cricket", 6666666666L);
//
//		try {
//			if (playerDAO.createPlayer(player) == 1) {
//				System.out.println("Player created with below details successfully");
//				System.out.println(player);
//			}
//		} catch (BusinessException e) {
//			System.out.println(e.getMessage());
//		}

		TeamDAO teamDAO = new TeamDAOImpl();
		Team t1 = new Team("KKR");
		
		try {
			t1=teamDAO.createTeam(t1);
			if(t1.getId()!=0) {
				System.out.println("Team Created successfully with below details");
				System.out.println(t1);
			}
		} catch (BusinessException e) {
			System.out.println(e);
		}
		
		try {
			List<Team> teamList=teamDAO.getAllTeams();
			if(teamList!=null && teamList.size()>0) {
				System.out.println("\n\nTotal we have "+teamList.size()+" no of teams in Team table... Below are the details");
				for(Team t:teamList) {
					System.out.println(t);
				}
			}
		} catch (BusinessException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
