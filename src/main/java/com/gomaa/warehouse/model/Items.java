package com.gomaa.warehouse.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class Items {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="item_id")
	private long itemId;
	
	@Column(name="item_code")
	private String itemCode;
	
	@Column(name="item_name")
	private String itemName;
	
	@Column(name="item_category")
	private String itemCategory;
	
	@Column(name="item_price")
	private float itemPrice;
	
	
	public Items() {
		
	}


	public Items(String itemCode, String itemName, String itemCategory, float itemPrice) {
		this.itemCode = itemCode;
		this.itemName = itemName;
		this.itemCategory = itemCategory;
		this.itemPrice = itemPrice;
	}


	public long getItemId() {
		return itemId;
	}


	public void setItemId(long itemId) {
		this.itemId = itemId;
	}


	public String getItemCode() {
		return itemCode;
	}


	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}


	public String getItemName() {
		return itemName;
	}


	public void setItemName(String itemName) {
		this.itemName = itemName;
	}


	public String getItemCategory() {
		return itemCategory;
	}


	public void setItemCategory(String itemCategory) {
		this.itemCategory = itemCategory;
	}


	public float getItemPrice() {
		return itemPrice;
	}


	public void setItemPrice(float itemPrice) {
		this.itemPrice = itemPrice;
	}
	
	
}
