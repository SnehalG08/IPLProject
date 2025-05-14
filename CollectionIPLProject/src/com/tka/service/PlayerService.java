package com.tka.service;

import com.tka.dao.PlayerDao;
import com.tka.entity.Player;

public class PlayerService {

	public Player getOnePlayer(String pn, int gn, int r, int w) {

		PlayerDao dao = new PlayerDao();
		return dao.getOnePlayer(pn, gn, r, w);
	}
}
