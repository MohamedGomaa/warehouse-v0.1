package com.gomaa.warehouse.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.gomaa.warehouse.model.Items;

public interface ItemService {

	Items getItem(long id);
	List<Items> getAllItems();
	void saveItem(Items item);
	void deleteItem(long id);
	

}