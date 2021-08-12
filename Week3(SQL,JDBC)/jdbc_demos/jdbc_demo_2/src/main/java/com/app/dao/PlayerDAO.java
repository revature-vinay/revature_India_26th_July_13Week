package com.app.dao;

import java.util.List;

import com.app.exception.BusinessException;
import com.app.model.Player;

public interface PlayerDAO {

	//DAO - Data Access Object - Its a design pattern utilized to specify the persistant/DB/storage logic
	public List<Player> getAllPlayers() throws BusinessException;
	public int createPlayer(Player player) throws BusinessException;
	
	public int updatePlayer(int id,long contact) throws BusinessException;
	public int deletePlayer(int id)throws BusinessException;
}
