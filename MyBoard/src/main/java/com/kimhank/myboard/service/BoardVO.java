package com.kimhank.myboard.service;

public class BoardVO {

	public BoardVO() {
		// TODO Auto-generated constructor stub
	}
   
	private int bid;
	private String btitle = "";
	private String bcontent = "";
	private String buser = "";
	private String breg_time = "";
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getBtitle() {
		return btitle;
	}
	public void setBtitle(String btitle) {
		this.btitle = btitle;
	}
	public String getBcontent() {
		return bcontent;
	}
	public void setBcontent(String bcontent) {
		this.bcontent = bcontent;
	}
	public String getBuser() {
		return buser;
	}
	public void setBuser(String buser) {
		this.buser = buser;
	}
	public String getBreg_time() {
		return breg_time;
	}
	public void setBreg_time(String breg_time) {
		this.breg_time = breg_time;
	}
	
	
	
}
