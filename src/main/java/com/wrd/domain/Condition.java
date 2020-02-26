package com.wrd.domain;

public class Condition {

	private Integer pageNum;
	
	private String btype;
	
	private String bbrand;
	
	private Double p1;
	
	private Double p2;
	
	private String gname;

	public Integer getPageNum() {
		return pageNum;
	}

	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
	}

	public String getBtype() {
		return btype;
	}

	public void setBtype(String btype) {
		this.btype = btype;
	}

	public String getBbrand() {
		return bbrand;
	}

	public void setBbrand(String bbrand) {
		this.bbrand = bbrand;
	}

	public Double getP1() {
		return p1;
	}

	public void setP1(Double p1) {
		this.p1 = p1;
	}

	public Double getP2() {
		return p2;
	}

	public void setP2(Double p2) {
		this.p2 = p2;
	}

	public String getGname() {
		return gname;
	}

	public void setGname(String gname) {
		this.gname = gname;
	}

	@Override
	public String toString() {
		return "Condition [pageNum=" + pageNum + ", btype=" + btype + ", bbrand=" + bbrand + ", p1=" + p1 + ", p2=" + p2
				+ ", gname=" + gname + "]";
	}

	public Condition(Integer pageNum, String btype, String bbrand, Double p1, Double p2, String gname) {
		super();
		this.pageNum = pageNum;
		this.btype = btype;
		this.bbrand = bbrand;
		this.p1 = p1;
		this.p2 = p2;
		this.gname = gname;
	}

	public Condition() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
}
