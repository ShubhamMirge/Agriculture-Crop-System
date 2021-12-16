package com.CropDetails;

public class Crop {
	
	
	public String getId() {
		return id;
	}
	@Override
	public String toString() {
		return "Crop [id=" + id + ", cropname=" + cropname + ", countity=" + countity + ", price=" + price
				+ ", location=" + location + "]";
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCropname() {
		return cropname;
	}
	public void setCropname(String cropname) {
		this.cropname = cropname;
	}
	public String getCountity() {
		return countity;
	}
	public void setCountity(String countity) {
		this.countity = countity;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	private String id;
	private String cropname;
	private  String countity;
	private String price;
	private String location;
	public Crop() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
