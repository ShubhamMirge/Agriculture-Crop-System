package com.Admin.Module;

import org.springframework.data.mongodb.core.mapping.Document;

public class FarmerDetail {
	
	private String fid;
	private String fname;
	private String address;
	private String contact;
	private String nationality;
	public FarmerDetail() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getFid() {
		return fid;
	}
	public void setFid(String fid) {
		this.fid = fid;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	@Override
	public String toString() {
		return "FarmerDetail [fid=" + fid + ", fname=" + fname + ", address=" + address + ", contact=" + contact
				+ ", nationality=" + nationality + "]";
	}
	

}
