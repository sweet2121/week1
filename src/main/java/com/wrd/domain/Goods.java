package com.wrd.domain;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

public class Goods {
	
	private Integer gid;
	
	private String gname;
	
	private String english;
	
	private Double size;
	
	private Double price;
	
	private Integer num;
	
	private String txt;
	
	private String pic;
	
	private List<Brand> brands;
	
	private MultipartFile myFile;
	
	private Integer[] bids;
	
	private String bbrand;
	
	private String btype;

	public Integer getGid() {
		return gid;
	}

	public void setGid(Integer gid) {
		this.gid = gid;
	}

	public String getGname() {
		return gname;
	}

	public void setGname(String gname) {
		this.gname = gname;
	}

	public String getEnglish() {
		return english;
	}

	public void setEnglish(String english) {
		this.english = english;
	}

	public Double getSize() {
		return size;
	}

	public void setSize(Double size) {
		this.size = size;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getNum() {
		return num;
	}

	public void setNum(Integer num) {
		this.num = num;
	}

	public String getTxt() {
		return txt;
	}

	public void setTxt(String txt) {
		this.txt = txt;
	}

	public String getPic() {
		return pic;
	}

	public void setPic(String pic) {
		this.pic = pic;
	}

	public List<Brand> getBrands() {
		return brands;
	}

	public void setBrands(List<Brand> brands) {
		this.brands = brands;
	}

	public MultipartFile getMyFile() {
		return myFile;
	}

	public void setMyFile(MultipartFile myFile) {
		this.myFile = myFile;
	}

	public Integer[] getBids() {
		return bids;
	}

	public void setBids(Integer[] bids) {
		this.bids = bids;
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
		return "Goods [gid=" + gid + ", gname=" + gname + ", english=" + english + ", size=" + size + ", price=" + price
				+ ", num=" + num + ", txt=" + txt + ", pic=" + pic + ", brands=" + brands + ", myFile=" + myFile
				+ ", bids=" + Arrays.toString(bids) + ", bbrand=" + bbrand + ", btype=" + btype + "]";
	}

	public Goods(Integer gid, String gname, String english, Double size, Double price, Integer num, String txt,
			String pic, List<Brand> brands, MultipartFile myFile, Integer[] bids, String bbrand, String btype) {
		super();
		this.gid = gid;
		this.gname = gname;
		this.english = english;
		this.size = size;
		this.price = price;
		this.num = num;
		this.txt = txt;
		this.pic = pic;
		this.brands = brands;
		this.myFile = myFile;
		this.bids = bids;
		this.bbrand = bbrand;
		this.btype = btype;
	}

	public Goods() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
