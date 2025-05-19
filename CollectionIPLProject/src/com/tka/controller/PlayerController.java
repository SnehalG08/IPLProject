package com.tka.controller;

import java.util.List;

import com.tka.entity.Player;
import com.tka.service.PlayerService;

public class PlayerController {

	public static void main(String[] args) {

		// System.out.println("controller class");
		PlayerService service = new PlayerService();

//    System.out.println("-----ALL Teams------");
//		List<Player> team=service.getAllTeam();
//		for(Player p:team) {
//			System.out.println(p.getPname()+"----->"+p.getTName());
//		}

//		List<Player> allBatsman = service.getAllBatsman();
//
//		// System.out.println(allBatsman);
//		System.out.println("-----All Batsman------");
//		for (Player p : allBatsman) {
//			System.out.println(p.getPname());
//		}
//
//		List<Player> allBollers = service.getAllBollers();
//
//		// System.out.println(allBollers);
//		System.out.println("-----All Bollers----");
//		for (Player p : allBollers) {
//			System.out.println(p.getPname());
//		}

//		List<Player> allRounders = service.getAllRounders();

//		System.out.println("-----All rounders------");
//		for (Player p : allRounders) {
//			
//		System.out.println(p.getPname());
//		}

//		List<Player> cskTeam = service.getCSKTeam();
//
//		System.out.println("-----CSK Team------");
//		for (Player p : cskTeam) {
//			System.out.println(p.getPname());
//		}

//		List<Player> cskBatsman = service.getCSKBatsman();
//		System.out.println("-----CSK Batsman----");
//		for (Player p : cskBatsman) {
//
//			System.out.println(p.getPname());
//		}

//		List<Player> cskBoller = service.getCSKBollers();
//		System.out.println("----CSK Bollers----");
//		for (Player p : cskBoller) {
//			System.out.println(p.getPname());
//		}

//		List<Player> cskAllRounders = service.getCSKAllRounders();
//		System.out.println("---CSK ALL Rounders-----");
//		
//		for(Player p:cskAllRounders) {
//			System.out.println(p.getPname());
//		}

		// List<Player> miTeam = service.getMITeam();
//
//		System.out.println("----MI-----");
//
//		for (Player p : miTeam) {
//			System.out.println(p.getPname());
//		}
		List<Player> miBatsman = service.getMIBatsman();
		System.out.println("-----MI Batsman----");
		for (Player p : miBatsman) {

			System.out.println(p.getPname());
		}
//		List<Player> miBoller = service.getMIBollers();
//		System.out.println("----MI Bollers----");
//		for (Player p : miBoller) {
//			System.out.println(p.getPname());
//		}
//
//		List<Player> miAllRounders = service.getMIAllRounders();
//		System.out.println("---MI ALL Rounders-----");
//
//		for (Player p : miAllRounders) {
//			// System.out.println(p.getPname());
//			if (p.getPname().startsWith("A")) {
//				System.out.println(p.getPname());
//			}
//		}

//		List<Player> kkrTeam = service.getKKRTeam();
//
//		System.out.println("----KKR-----");
//
//		for (Player p : kkrTeam) {
//			System.out.println(p.getPname());
//		}
//		List<Player> kkrBatsman = service.getKKRBatsman();
//		System.out.println("-----KKR Batsman----");
//		for (Player p : kkrBatsman) {
//
//			System.out.println(p.getPname());
//		}
//		List<Player> kkrBoller = service.getKKRBollers();
//		System.out.println("----KKR Bollers----");
//		for (Player p : kkrBoller) {
//			System.out.println(p.getPname());
//		}
//
//		List<Player> kkrAllRounders = service.getKKRAllRounders();
//		System.out.println("---KKR ALL Rounders-----");
//
//		for (Player p : kkrAllRounders) {
//			System.out.println(p.getPname());
//		}

//		List<Player> dcTeam = service.getDCTeam();
//
//		System.out.println("----DC-----");
//
//		for (Player p : dcTeam) {
//			System.out.println(p.getPname());
//		}

//		List<Player> dcBatsman = service.getDCBatsman();
//		System.out.println("-----DC Batsman----");
//		for (Player p : dcBatsman) {
//
//			System.out.println(p.getPname());
//		}
//		List<Player> dcBoller = service.getDCBollers();
//		System.out.println("----DC Bollers----");
//		for (Player p : dcBoller) {
//			System.out.println(p.getPname());
//		}
//
//		List<Player> dcAllRounders = service.getDCAllRounders();
//		System.out.println("---DC ALL Rounders-----");
//
//		for (Player p : dcAllRounders) {
//			System.out.println(p.getPname());
//		}
//		List<Player> gtTeam = service.getGTTeam();
//
//		System.out.println("----GT-----");
//
//		for (Player p : gtTeam) {
//			System.out.println(p.getPname());
//		}

//		List<Player> gtBatsman = service.getGTBatsman();
//		System.out.println("-----GT Batsman----");
//		for (Player p : gtBatsman) {
//
//			System.out.println(p.getPname());
//		}
//		List<Player> gtBoller = service.getGTBollers();
//		System.out.println("----GT Bollers----");
//		for (Player p : gtBoller) {
//			System.out.println(p.getPname());
//		}
//
//		List<Player> gtAllRounders = service.getGTAllRounders();
//		System.out.println("---GT ALL Rounders-----");
//
//		for (Player p : gtAllRounders) {
//			System.out.println(p.getPname());
//		}
//		List<Player> pkTeam = service.getPKTeam();
//
//		System.out.println("----PK-----");
//
//		for (Player p : pkTeam) {
//			System.out.println(p.getPname());
//		}
//		List<Player> pkBatsman = service.getPKBatsman();
//		System.out.println("-----PK Batsman----");
//		for (Player p : pkBatsman) {
//
//			System.out.println(p.getPname());
//		}
//		List<Player> pkBoller = service.getPKBollers();
//		System.out.println("----PK Bollers----");
//		for (Player p : pkBoller) {
//			System.out.println(p.getPname());
//		}
//
//		List<Player> pkAllRounders = service.getPKAllRounders();
//		System.out.println("---PK ALL Rounders-----");
//
//		for (Player p : pkAllRounders) {
//			System.out.println(p.getPname());
//		}
//		List<Player> rcbTeam = service.getRCBTeam();
//
//		System.out.println("----RCB-----");
//
//		for (Player p : rcbTeam) {
//			System.out.println(p.getPname());
//		}
//		List<Player> rcbBatsman = service.getRCBBatsman();
//		System.out.println("-----RCB Batsman----");
//		for (Player p : rcbBatsman) {
//
//			System.out.println(p.getPname());
//		}
//		List<Player> rcbBoller = service.getRCBBollers();
//		System.out.println("----RCB Bollers----");
//		for (Player p : rcbBoller) {
//			System.out.println(p.getPname());
//		}
//
//		List<Player> rcbAllRounders = service.getRCBAllRounders();
//		System.out.println("---RCB ALL Rounders-----");
//
//		for (Player p : rcbAllRounders) {
//			System.out.println(p.getPname());
//		}

//		List<Player> rrTeam = service.getRRTeam();
//
//		System.out.println("----RR-----");
//
//		for (Player p : rrTeam) {
//			System.out.println(p.getPname());
//		}
//		List<Player> rrBatsman = service.getRRBatsman();
//		System.out.println("-----RR Batsman----");
//		for (Player p : rrBatsman) {
//
//			System.out.println(p.getPname());
//		}
//		List<Player> rrBoller = service.getRRBollers();
//		System.out.println("----RR Bollers----");
//		for (Player p : rrBoller) {
//			System.out.println(p.getPname());
//		}
//
//		List<Player> rrAllRounders = service.getRRAllRounders();
//		System.out.println("---RR ALL Rounders-----");
//
//		for (Player p : rrAllRounders) {
//			System.out.println(p.getPname());
//		}
//		List<Player> shTeam = service.getSHTeam();
//
//		System.out.println("----SH-----");
//
//		for (Player p : shTeam) {
//			System.out.println(p.getPname());
//		}
//		List<Player> shBatsman = service.getSHBatsman();
//		System.out.println("-----SH Batsman----");
//		for (Player p : shBatsman) {
//
//			System.out.println(p.getPname());
//		}
//		List<Player> shBoller = service.getSHBollers();
//		System.out.println("----MI Bollers----");
//		for (Player p : shBoller) {
//			System.out.println(p.getPname());
//		}
//
//		List<Player> shAllRounders = service.getSHAllRounders();
//		System.out.println("---MI ALL Rounders-----");
//
//		for (Player p : shAllRounders) {
//			System.out.println(p.getPname());
//		}

		List<Player> team = service.getTeam("MI");
		// System.out.println(team);

//		for (Player p : team) {
//			System.out.println(p);
//		}
		
		List<Player> batsman=service.getBatsman("MI");
				System.out.println("Batsman ");
				
				for(Player p:batsman) {
					System.out.println(p);
				}
;	}
}
