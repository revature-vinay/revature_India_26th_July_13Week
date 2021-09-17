package com.app.service;

import java.util.List;

import com.app.model.Player;

public interface PlayerCRUDService {

	Player addPlayer(Player player);
	Player updatePlayer(Player player);
	Player getPlayerById(int id);
	void deletePlayer(int id);
	List<Player> getAllPlayers();
}
