package com.app.service;

import java.util.List;

import com.app.model.Player;

public interface PlayerService {

	public Player createPlayer(Player player);
	public Player updatePlayer(Player player);
	public Player getPlayerById(int id);
	public void deletePlayerById(int id);
	public List<Player> getAllPlayers();
	public List<Player> getAllPlayersByTeamName(String teamName);
}
