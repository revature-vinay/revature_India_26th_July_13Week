package com.app.dao.impl;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.app.dao.PlayerDAO;
import com.app.dao.mapper.PlayerRowMapper;
import com.app.model.Player;

public class PlayerDAOImpl implements PlayerDAO {

	private JdbcTemplate template;
	private DataSource dataSource;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.template=new JdbcTemplate(dataSource);
	}
	
	@Override
	public Player addPlayer(Player player) {
		String sql="insert into player(id,name,age,city,gender,sportsName,contact,teamId) values(?,?,?,?,?,?,?,?)";
		
		template.update(sql,player.getId(),player.getName(),player.getAge(),player.getCity(),player.getGender(),player.getSportsName(),player.getContact(),player.getTeamId());
		return player;
	}

	@Override
	public Player updatePlayer(Player player) {
	
		return null;
	}

	@Override
	public Player getPlayerById(int id) {
		String sql="select id,name,age,city,gender,sportsName,contact,teamId from player where id=?";
		Player player=template.queryForObject(sql, new Object[] {id},new PlayerRowMapper());
		return player;
	}

	@Override
	public void deletePlayer(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Player> getAllPlayers() {
		String sql="select id,name,age,city,gender,sportsName,contact,teamId from player";
		List<Player> playerList=template.query(sql, new PlayerRowMapper());
		return playerList;
	}

	@Override
	public List<Player> getPlayersBySportsName(String sportsName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Player> getPlayersByCity(String city) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Player> getPlayersByAge(int age) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Player> getPlayersByGender(String gender) {
		// TODO Auto-generated method stub
		return null;
	}

	


}
