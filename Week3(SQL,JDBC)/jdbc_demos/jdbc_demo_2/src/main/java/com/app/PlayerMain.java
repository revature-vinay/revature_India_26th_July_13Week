package com.app;

import java.util.List;

import com.app.dao.PlayerDAO;
import com.app.dao.impl.PlayerDAOImpl;
import com.app.exception.BusinessException;
import com.app.model.Player;

public class PlayerMain {

	public static void main(String[] args) {

		PlayerDAO playerDAO = new PlayerDAOImpl();

		try {
			List<Player> playerList=playerDAO.getAllPlayers();
			for(Player player:playerList) {
				System.out.println(player);
			}
		} catch (BusinessException e) {
			System.out.println(e.getMessage());
		}

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

	}

}
