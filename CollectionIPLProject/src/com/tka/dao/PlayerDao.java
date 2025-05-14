package com.tka.dao;

import com.tka.entity.Player;

public class PlayerDao {

	public Player getOnePlayer(String pn,int gn,int r,int w){
		return new Player(pn,gn,r,w);
		
	}
}
