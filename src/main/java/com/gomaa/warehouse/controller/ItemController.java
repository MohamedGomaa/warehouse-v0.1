package com.gomaa.warehouse.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.gomaa.warehouse.model.Items;
import com.gomaa.warehouse.service.ItemService;

@Controller
public class ItemController {
	
	@Autowired
	private ItemService itemService;
	
	
	@GetMapping("/items")
	public String showItems(Model model) {
		List<Items> itemsList = itemService.getAllItems();
		model.addAttribute("itemsList", itemsList);
		return "items";
	}
	
	
	@GetMapping("/showNewItemForm")
	public String showNewItemForm(Model model) {
		Items tempItem = new Items();
		model.addAttribute("item", tempItem);
		return "add_item";
	}
	
	@GetMapping("/showUpdateItemForm/{id}")
	public ModelAndView showUpdateItemForm(@PathVariable(name = "id") int id) {
		ModelAndView mav = new ModelAndView("update_item");
		Items item = itemService.getItem(id);
		mav.addObject("item", item);
		
		return mav;
	}
	
	@PostMapping("/saveItems")
	public String saveItem(@ModelAttribute("item") Items item) {
		itemService.saveItem(item);
		return "redirect:/items";
	}
	
	@GetMapping("/deleteItem/{id}")
	public String deleteProduct(@PathVariable(name = "id") int id) {
		itemService.deleteItem(id);
		return "redirect:/items";		
	}
	
}
