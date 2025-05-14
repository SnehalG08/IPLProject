package com.tka.controller;

import java.util.ArrayList;
import java.util.List;

import com.tka.entity.Player;

public class PlayerController {

	public static void main(String[] args) {
		
		
		List<Player> playerList=new ArrayList<>();
		
		//playerList.add(p1);
		playerList.add(new Player("Dube",4,1500,0));
		playerList.add(new Player("MSD",7,1400,2));
		playerList.add(new Player("Jadeja",14,500,8));
		playerList.add(new Player("Rahane",24,2500,9));
		playerList.add(new Player("Chahar",34,1800,4));
		playerList.add(new Player("RutuRaj",8,2500,0));
		playerList.add(new Player("Ali",4,1500,4));
		playerList.add(new Player("Nishant",12,1900,6));
		playerList.add(new Player("Thakur",11,1500,7));
		playerList.add(new Player("Mitchel",54,400,10));
		playerList.add(new Player("Simerjeet",19,1600,12));
		
		
		for(Player p:playerList) {
			if(p.getRun()>=1500 && p.getWicket()<=5) {
			System.out.println("Player Name :"+p.getPname()+ "  " + "Runs :"+ p.getRun()+ "");
		
			
			
			}
		
		
	}
	}
}
