package com.gomaa.warehouse.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.gomaa.warehouse.model.Items;
import com.gomaa.warehouse.repository.ItemRepository;

@Service
@Transactional
public class ItemServiceImpl implements ItemService {
	
	@Autowired
	private ItemRepository repo;
	
	@Override
	public Items getItem(long id) {

		Optional<Items> optionalItem = repo.findById(id);
		Items item = null;
		if(optionalItem.isPresent()){
			item = optionalItem.get();
		}else{
			throw new RuntimeException("Item not found");
		}
		return item;
	}
	
	@Override
	public List<Items> getAllItems() {
		return repo.findAll();
	}
	
	@Override
	public void saveItem(Items item) {
		repo.save(item);
	}
	
	@Override
	public void deleteItem(long id) {
		repo.deleteById(id);
	}

	
}
