package com.example.demo.bean;

public class Goods {

	private int gid;
	private String gname;
	private double price;
	// 百分比
	private double percent;

	

	public Goods() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getGid() {
		return gid;
	}

	public void setGid(int gid) {
		this.gid = gid;
	}

	public String getGname() {
		return gname;
	}

	public void setGname(String gname) {
		this.gname = gname;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getPercent() {
		return percent;
	}

	public void setPercent(double percent) {
		this.percent = percent;
	}

	@Override
	public String toString() {
		return "Goods [gid=" + gid + ", gname=" + gname + ", price=" + price + ", percent=" + percent + "]";
	}
}
