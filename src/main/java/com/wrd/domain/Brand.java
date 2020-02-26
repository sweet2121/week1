package com.wrd.domain;

public class Brand {

	private Integer bid;
	
	private String bbrand;
	
	private String btype;

	public Integer getBid() {
		return bid;
	}

	public void setBid(Integer bid) {
		this.bid = bid;
	}

	public String getBbrand() {
		return bbrand;
	}

	public void setBbrand(String bbrand) {
		this.bbrand = bbrand;
	}

	public String getBtype() {
		return btype;
	}

	public void setBtype(String btype) {
		this.btype = btype;
	}

	@Override
	public String toString() {
		return "Brand [bid=" + bid + ", bbrand=" + bbrand + ", btype=" + btype + "]";
	}

	public Brand(Integer bid, String bbrand, String btype) {
		super();
		this.bid = bid;
		this.bbrand = bbrand;
		this.btype = btype;
	}

	public Brand() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}
