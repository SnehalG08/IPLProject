package com.tka.service;

import java.util.ArrayList;
import java.util.List;

import com.tka.dao.PlayerDao;
import com.tka.entity.Player;

public class PlayerService {

	public List<Player> getAllTeam() {

		// System.out.println("service class");
		PlayerDao dao = new PlayerDao();
		List<Player> list = dao.getAllTeam();

		return list;
	}

	public List<Player> getAllBatsman() {

		List<Player> allBatsman = new ArrayList<>();
		List<Player> team = this.getAllTeam();
		for (Player p : team) {
			if (p.getRun() > 1000) {
				allBatsman.add(p);
			}
		}
		return allBatsman;
	}

	public List<Player> getAllBollers() {

		List<Player> bollers = new ArrayList<>();
		List<Player> team = this.getAllTeam();
		for (Player p : team) {
			if (p.getWicket() > 10) {
				bollers.add(p);
			}
		}
		return bollers;

	}

	public List<Player> getAllRounders() {

		List<Player> allRounders = new ArrayList<>();
		List<Player> team = this.getAllTeam();
		for (Player p : team) {
			if (p.getRun() > 1000 && p.getWicket() > 10) {
				allRounders.add(p);
			}
		}
		return allRounders;

	}

	public List<Player> getCSKTeam() {

		List<Player> cskteam = new ArrayList<>();
		List<Player> allTeam = this.getAllTeam();

		for (Player p : allTeam) {
			if (p.getTName().equalsIgnoreCase("CSK")) {
				cskteam.add(p);
			}
		}

		return cskteam;

	}

	public List<Player> getCSKBatsman() {

		List<Player> cskBatsman = new ArrayList<>();
		List<Player> cskTeam = this.getCSKTeam();

		for (Player p : cskTeam) {
			if (p.getRun() > 1000) {
				cskBatsman.add(p);
			}
		}
		return cskBatsman;
	}

	public List<Player> getCSKBollers() {

		List<Player> cskBollers = new ArrayList<>();
		List<Player> cskTeam = this.getCSKTeam();
		for (Player p : cskTeam) {
			if (p.getWicket() > 5)
				cskBollers.add(p);
		}

		return cskBollers;
	}

	public List<Player> getCSKAllRounders() {

		List<Player> cskAllRounders = new ArrayList<>();
		List<Player> cskTeam = this.getCSKTeam();

		for (Player p : cskTeam) {
			if (p.getRun() > 1000 && p.getWicket() > 5)
				cskAllRounders.add(p);
		}
		return cskAllRounders;
	}

	public List<Player> getMITeam() {

		List<Player> miTeam = new ArrayList<>();
		List<Player> allTeam = this.getAllTeam();

		for (Player p : allTeam) {
			if (p.getTName().equalsIgnoreCase("MI")) {
				miTeam.add(p);
			}
		}
		return miTeam;

	}

	public List<Player> getMIBatsman() {

		List<Player> miBatsman = new ArrayList<>();
		List<Player> miTeam = this.getMITeam();

		for (Player p : miTeam) {
			if (p.getRun() > 1000) {
				miBatsman.add(p);
			}
		}
		return miBatsman;
	}

	public List<Player> getMIBollers() {

		List<Player> miBollers = new ArrayList<>();
		List<Player> miTeam = this.getMITeam();
		for (Player p : miTeam) {
			if (p.getWicket() > 5)
				miBollers.add(p);
		}

		return miBollers;
	}

	public List<Player> getMIAllRounders() {

		List<Player> miAllRounders = new ArrayList<>();
		List<Player> miTeam = this.getMITeam();

		for (Player p : miTeam) {
			if (p.getRun() > 1000 && p.getWicket() > 5)
				miAllRounders.add(p);
		}
		return miAllRounders;
	}

	public List<Player> getKKRTeam() {

		List<Player> kkrTeam = new ArrayList<>();
		List<Player> allTeam = this.getAllTeam();

		for (Player p : allTeam) {
			if (p.getTName().equalsIgnoreCase("KKR")) {
				kkrTeam.add(p);
			}
		}
		return kkrTeam;

	}

	public List<Player> getKKRBatsman() {

		List<Player> kkrBatsman = new ArrayList<>();
		List<Player> kkrTeam = this.getKKRTeam();

		for (Player p : kkrTeam) {
			if (p.getRun() > 1000) {
				kkrBatsman.add(p);
			}
		}
		return kkrBatsman;
	}

	public List<Player> getKKRBollers() {

		List<Player> kkrBollers = new ArrayList<>();
		List<Player> kkrTeam = this.getKKRTeam();
		for (Player p : kkrTeam) {
			if (p.getWicket() > 5)
				kkrBollers.add(p);
		}

		return kkrBollers;
	}

	public List<Player> getKKRAllRounders() {

		List<Player> kkrAllRounders = new ArrayList<>();
		List<Player> kkrTeam = this.getKKRTeam();

		for (Player p : kkrTeam) {
			if (p.getRun() > 1000 && p.getWicket() > 5)
				kkrAllRounders.add(p);
		}
		return kkrAllRounders;
	}

	public List<Player> getDCTeam() {

		List<Player> dcTeam = new ArrayList<>();
		List<Player> allTeam = this.getAllTeam();

		for (Player p : allTeam) {
			if (p.getTName().equalsIgnoreCase("DC")) {
				dcTeam.add(p);
			}
		}
		return dcTeam;

	}

	public List<Player> getDCBatsman() {

		List<Player> dcBatsman = new ArrayList<>();
		List<Player> dcTeam = this.getDCTeam();

		for (Player p : dcTeam) {
			if (p.getRun() > 1000) {
				dcBatsman.add(p);
			}
		}
		return dcBatsman;
	}

	public List<Player> getDCBollers() {

		List<Player> dcBollers = new ArrayList<>();
		List<Player> dcTeam = this.getDCTeam();
		for (Player p : dcTeam) {
			if (p.getWicket() > 5)
				dcBollers.add(p);
		}

		return dcBollers;
	}

	public List<Player> getDCAllRounders() {

		List<Player> dcAllRounders = new ArrayList<>();
		List<Player> dcTeam = this.getDCTeam();

		for (Player p : dcTeam) {
			if (p.getRun() > 1000 && p.getWicket() > 5)
				dcAllRounders.add(p);
		}
		return dcAllRounders;
	}

	public List<Player> getGTTeam() {

		List<Player> gtTeam = new ArrayList<>();
		List<Player> allTeam = this.getAllTeam();

		for (Player p : allTeam) {
			if (p.getTName().equalsIgnoreCase("GT")) {
				gtTeam.add(p);
			}
		}
		return gtTeam;

	}

	public List<Player> getGTBatsman() {

		List<Player> gtBatsman = new ArrayList<>();
		List<Player> gtTeam = this.getGTTeam();

		for (Player p : gtTeam) {
			if (p.getRun() > 1000) {
				gtBatsman.add(p);
			}
		}
		return gtBatsman;
	}

	public List<Player> getGTBollers() {

		List<Player> gtBollers = new ArrayList<>();
		List<Player> gtTeam = this.getGTTeam();
		for (Player p : gtTeam) {
			if (p.getWicket() > 5)
				gtBollers.add(p);
		}

		return gtBollers;
	}

	public List<Player> getGTAllRounders() {

		List<Player> gtAllRounders = new ArrayList<>();
		List<Player> gtTeam = this.getGTTeam();

		for (Player p : gtTeam) {
			if (p.getRun() > 1000 && p.getWicket() > 5)
				gtAllRounders.add(p);
		}
		return gtAllRounders;
	}

	public List<Player> getPKTeam() {

		List<Player> pkTeam = new ArrayList<>();
		List<Player> allTeam = this.getAllTeam();

		for (Player p : allTeam) {
			if (p.getTName().equalsIgnoreCase("PK")) {
				pkTeam.add(p);
			}
		}
		return pkTeam;

	}

	public List<Player> getPKBatsman() {

		List<Player> pkBatsman = new ArrayList<>();
		List<Player> pkTeam = this.getPKTeam();

		for (Player p : pkTeam) {
			if (p.getRun() > 1000) {
				pkBatsman.add(p);
			}
		}
		return pkBatsman;
	}

	public List<Player> getPKBollers() {

		List<Player> pkBollers = new ArrayList<>();
		List<Player> pkTeam = this.getPKTeam();
		for (Player p : pkTeam) {
			if (p.getWicket() > 5)
				pkBollers.add(p);
		}

		return pkBollers;
	}

	public List<Player> getPKAllRounders() {

		List<Player> pkAllRounders = new ArrayList<>();
		List<Player> pkTeam = this.getPKTeam();

		for (Player p : pkTeam) {
			if (p.getRun() > 1000 && p.getWicket() > 5)
				pkAllRounders.add(p);
		}
		return pkAllRounders;
	}

	public List<Player> getLCGTeam() {

		List<Player> lcgTeam = new ArrayList<>();
		List<Player> allTeam = this.getAllTeam();

		for (Player p : allTeam) {
			if (p.getTName().equalsIgnoreCase("LCG")) {
				lcgTeam.add(p);
			}
		}
		return lcgTeam;

	}

	public List<Player> getLCGBatsman() {

		List<Player> lcgBatsman = new ArrayList<>();
		List<Player> lcgTeam = this.getLCGTeam();

		for (Player p : lcgTeam) {
			if (p.getRun() > 1000) {
				lcgBatsman.add(p);
			}
		}
		return lcgBatsman;
	}

	public List<Player> getLCGBollers() {

		List<Player> lcgBollers = new ArrayList<>();
		List<Player> lcgTeam = this.getLCGTeam();
		for (Player p : lcgTeam) {
			if (p.getWicket() > 5)
				lcgBollers.add(p);
		}

		return lcgBollers;
	}

	public List<Player> getLCGAllRounders() {

		List<Player> lcgAllRounders = new ArrayList<>();
		List<Player> lcgTeam = this.getLCGTeam();

		for (Player p : lcgTeam) {
			if (p.getRun() > 1000 && p.getWicket() > 5)
				lcgAllRounders.add(p);
		}
		return lcgAllRounders;
	}

	public List<Player> getRCBTeam() {

		List<Player> rcbTeam = new ArrayList<>();
		List<Player> allTeam = this.getAllTeam();

		for (Player p : allTeam) {
			if (p.getTName().equalsIgnoreCase("RCB")) {
				rcbTeam.add(p);
			}
		}
		return rcbTeam;

	}

	public List<Player> getRCBBatsman() {

		List<Player> rcbBatsman = new ArrayList<>();
		List<Player> rcbTeam = this.getRCBTeam();

		for (Player p : rcbTeam) {
			if (p.getRun() > 1000) {
				rcbBatsman.add(p);
			}
		}
		return rcbBatsman;
	}

	public List<Player> getRCBBollers() {

		List<Player> rcbBollers = new ArrayList<>();
		List<Player> rcbTeam = this.getRCBTeam();
		for (Player p : rcbTeam) {
			if (p.getWicket() > 5)
				rcbBollers.add(p);
		}

		return rcbBollers;
	}

	public List<Player> getRCBAllRounders() {

		List<Player> rcbAllRounders = new ArrayList<>();
		List<Player> rcbTeam = this.getRCBTeam();

		for (Player p : rcbTeam) {
			if (p.getRun() > 1000 && p.getWicket() > 5)
				rcbAllRounders.add(p);
		}
		return rcbAllRounders;
	}

	public List<Player> getRRTeam() {

		List<Player> rrTeam = new ArrayList<>();
		List<Player> allTeam = this.getAllTeam();

		for (Player p : allTeam) {
			if (p.getTName().equalsIgnoreCase("RR")) {
				rrTeam.add(p);
			}
		}
		return rrTeam;

	}

	public List<Player> getRRBatsman() {

		List<Player> rrBatsman = new ArrayList<>();
		List<Player> rrTeam = this.getRRTeam();

		for (Player p : rrTeam) {
			if (p.getRun() > 1000) {
				rrBatsman.add(p);
			}
		}
		return rrBatsman;
	}

	public List<Player> getRRBollers() {

		List<Player> rrBollers = new ArrayList<>();
		List<Player> rrTeam = this.getRRTeam();
		for (Player p : rrTeam) {
			if (p.getWicket() > 5)
				rrBollers.add(p);
		}

		return rrBollers;
	}

	public List<Player> getRRAllRounders() {

		List<Player> rrAllRounders = new ArrayList<>();
		List<Player> rrTeam = this.getRRTeam();

		for (Player p : rrTeam) {
			if (p.getRun() > 1000 && p.getWicket() > 5)
				rrAllRounders.add(p);
		}
		return rrAllRounders;
	}

	public List<Player> getSHTeam() {

		List<Player> shTeam = new ArrayList<>();
		List<Player> allTeam = this.getAllTeam();

		for (Player p : allTeam) {
			if (p.getTName().equalsIgnoreCase("SH")) {
				shTeam.add(p);
			}
		}
		return shTeam;

	}

	public List<Player> getSHBatsman() {

		List<Player> shBatsman = new ArrayList<>();
		List<Player> shTeam = this.getSHTeam();

		for (Player p : shTeam) {
			if (p.getRun() > 1000) {
				shBatsman.add(p);
			}
		}
		return shBatsman;
	}

	public List<Player> getSHBollers() {

		List<Player> shBollers = new ArrayList<>();
		List<Player> shTeam = this.getSHTeam();
		for (Player p : shTeam) {
			if (p.getWicket() > 5)
				shBollers.add(p);
		}

		return shBollers;
	}

	
	
	public List<Player> getTeam(String tn){
		
		List<Player> team=new ArrayList<>();
		List<Player> allteams=this.getAllTeam();
		
		for(Player p:allteams) {
			if(p.getTName().equals(tn)) {
				team.add(p);
			}
		}
		return team;
	}
	public List<Player> getBatsman(String tn) {

		List<Player> batsman = new ArrayList<>();
		List<Player> team = this.getAllTeam();

		for (Player p : team) {
			if (p.getRun() > 1000 && p.getTName().equals(tn)) {
				batsman.add(p);
			}
		}
		return batsman;
	}

	public List<Player> getBollers(String tn) {

		List<Player> bollers = new ArrayList<>();
		List<Player> team = this.getAllTeam();

		for (Player p : team) {
			if (p.getWicket() > 5 && p.getTName().equals(tn)) {
				bollers.add(p);
			}
		}
		return bollers;
	}
	
	public List<Player> getAllRounders(String tn) {

		List<Player> allRounders = new ArrayList<>();
		List<Player> team = this.getAllTeam();

		for (Player p : team) {
			if (p.getWicket()>5 && p.getRun() > 1000 && p.getTName().equals(tn)) {
				allRounders.add(p);
			}
		}
		return allRounders;
	}
}