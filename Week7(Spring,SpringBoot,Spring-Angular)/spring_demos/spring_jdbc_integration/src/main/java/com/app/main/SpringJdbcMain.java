package com.app.main;

import java.util.Iterator;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.dao.PlayerDAO;
import com.app.model.Player;

public class SpringJdbcMain {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("spring-jdbc-beans.xml");
		
		PlayerDAO playerDAO=(PlayerDAO) context.getBean("playerDAO");
		
//		playerDAO.addPlayer(new Player(108,"Yuzvender Chahal", 28, "M", "Haryana", "Cricket", 3123312311L, 1));
//		System.out.println("Player added");
		
		Player player=playerDAO.getPlayerById(107);
		System.out.println(player);
		
		
		List<Player> playerList=playerDAO.getAllPlayers();
		System.out.println("There are total "+playerList.size()+" number of players in DB... Details are............");
		for (Player player2 : playerList) {
			System.out.println(player2);
		}
	}

}
