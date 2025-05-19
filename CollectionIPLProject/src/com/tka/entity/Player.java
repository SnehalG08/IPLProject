package com.tka.entity;

public class Player {

	private int g_no;
	private String pname;
	private int run;
	private int wicket;
	private String tname;

	public Player() {
		super();
	}

	public Player(int g_no, String pname, int run, int wicket, String tname) {
		super();

		this.g_no = g_no;
		this.pname = pname;
		this.run = run;
		this.wicket = wicket;
		this.tname = tname;
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

	public String getTName() {
		return tname;
	}

	public void setTName(String tname) {
		this.tname = tname;
	}

	@Override
	public String toString() {
		return "Player [pname=" + pname + ", tname=" + tname + "]";
	}

	

}
