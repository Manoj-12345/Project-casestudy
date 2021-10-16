package com.example.dao;

import org.springframework.data.annotation.Id;

import com.example.user.CartProfile;

public class ProductProfile {
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Id
	private String id;
	private String type;
    private String name;
    private String category;
    private String price;
    private String description;

    public CartProfile getAll(ProductProfile pdp) {
    	CartProfile cp = new CartProfile();
    	cp.setId(pdp.getId());
    return cp;
    	
    }
}
