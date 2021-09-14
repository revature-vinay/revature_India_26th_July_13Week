package com.app.dao;

import java.util.List;

import com.app.model.Player;

public interface PlayerDAO {

	Player addPlayer(Player player);
	Player updatePlayer(Player player);
	Player getPlayerById(int id);
	void deletePlayer(int id);
	List<Player> getAllPlayers();
	List<Player> getPlayersBySportsName(String sportsName);
	List<Player> getPlayersByCity(String city);
	List<Player> getPlayersByAge(int age);
	List<Player> getPlayersByGender(String gender);
}
