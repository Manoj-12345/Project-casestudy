package com.example.user;

import java.util.List;

import org.springframework.data.annotation.Id;

public class ItemsProfile {
	
	public String getProductName() {
		return ProductName;
	}
	public void setProductName(String productName) {
		ProductName = productName;
	}
	public String getPrice() {
		return Price;
	}
	public void setPrice(String price) {
		Price = price;
	}
	public String getQuantity() {
		return Quantity;
	}
	public void setQuantity(String quantity) {
		Quantity = quantity;
	}
	
	public ItemsProfile(String productName, String price, String quantity) {
		super();
		ProductName = productName;
		Price = price;
		Quantity = quantity;
	}
	@Id
	private String ProductName;
	private String Quantity;
	private String Price;
	public List<ItemsProfile> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
