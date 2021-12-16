package com.Admin.Module;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


public class OrderDetails {
	
	
	private String orderId;
	private String id;    
	private String fname;  
	private String dealername;
	//private int id;       // crop id
	
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getName() {
		return fname;
	}
	public void setName(String name) {
		this.fname = name;
	}
	public String getDealername() {
		return dealername;
	}
	public void setDealername(String dealername) {
		this.dealername = dealername;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public OrderDetails(String orderId, String name, String dealername, String id) {
		super();
		this.orderId = orderId;
		this.fname = name;
		this.dealername = dealername;
		this.id = id;
	}
	public OrderDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "OrderDetails [orderId=" + orderId + ", name=" + fname + ", dealername=" + dealername + ", id=" + id
				+ "]";
	}
	
	
	
	
	
	
	

}
