package com.jun.models;

import java.util.ArrayList;

public class Team {
	public String name;
	ArrayList<Player> players = new ArrayList<>();
	
	public Team(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	public int getPlayerCount() {
		return this.players.size();
	}
	public ArrayList<Player> getPlayers(){
		return this.players;
	}
	public void addPlayer(Player player) {
		this.players.add(player);
	}
}
