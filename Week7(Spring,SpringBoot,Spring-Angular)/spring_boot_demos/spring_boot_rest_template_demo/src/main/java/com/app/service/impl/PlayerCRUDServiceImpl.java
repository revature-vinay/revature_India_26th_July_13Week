package com.app.service.impl;

import java.util.List;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.app.model.Player;
import com.app.service.PlayerCRUDService;

@Service
public class PlayerCRUDServiceImpl implements PlayerCRUDService {
	
	private String url="http://localhost:7000/player";
	private RestTemplate restTemplate=new RestTemplate();


	@Override
	public Player addPlayer(Player player) {
		return restTemplate.postForObject(url, player, Player.class);
	}

	@Override
	public Player updatePlayer(Player player) {
		restTemplate.put(url, player);
		return player;
	}

	@Override
	public Player getPlayerById(int id) {
		ResponseEntity<Player> entity=restTemplate.exchange(url+"/"+id,HttpMethod.GET ,null,Player.class);
		return entity.getBody();
	}

	@Override
	public void deletePlayer(int id) {
		restTemplate.delete(url+"/"+id);
	}

	@Override
	public List<Player> getAllPlayers() {
		ResponseEntity<List<Player>> entity=restTemplate
											.exchange(url+"s",
													HttpMethod.GET ,
													null,
													new ParameterizedTypeReference<List<Player>>() {
										});
		return entity.getBody();
	}

}
