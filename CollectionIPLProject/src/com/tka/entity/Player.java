package com.tka.entity;

public class Player {

	private String pname;
	private int g_no;
	private int run;
	private int wicket;
	
	private static String tname = "csk";
	

	public Player() {
		super();
	}

	public Player(String pname, int g_no, int run, int wicket) {
		super();
		this.pname = pname;
		this.g_no = g_no;
		this.run = run;
		this.wicket = wicket;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public int getG_no() {
		return g_no;
	}

	public void setG_no(int g_no) {
		this.g_no = g_no;
	}

	public int getRun() {
		return run;
	}

	public void setRun(int run) {
		this.run = run;
	}

	public int getWicket() {
		return wicket;
	}

	public void setWicket(int wicket) {
		this.wicket = wicket;
	}

	@Override
	public String toString() {
		return "Player [pname=" + pname + ", g_no=" + g_no + ", run=" + run + ", wicket=" + wicket + ", tname=" + tname
				+ "]";
	}

}
