package com.app.service;

import java.util.List;

import com.app.model.Player;

public interface PlayerSearchService {

	List<Player> getAllPlayers();
	List<Player> getPlayersByName(String name);
	List<Player> getPlayersByAge(int age);
	List<Player> getPlayersByTeamName(String teamName);
	List<Player> getPlayersByCity(String city);
}
