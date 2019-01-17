package com.purchase.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.purchase.entity.Needs;
import com.purchase.sevice.NeedsService;

@RestController
@RequestMapping("/needs")
public class NeedsController {
	@Autowired
	private NeedsService needService;
	
	@GetMapping("/all")
	public List<Needs> getAllNeeds() {
		return needService.getAllNeeds();
	}
	@GetMapping("/{nid}")
	public Needs getNeedById(@PathVariable(name="nid") String needId) {
		return needService.getNeedById(needId);
	}
	@PostMapping("/add")
	public boolean addNeed(Needs need) {
		return needService.addNeed(need);
	}
	@PostMapping("/update")
	public boolean updateNeed(Needs need) {
		return needService.updateNeed(need);
	}
	@PostMapping("/delete")
	public boolean deleteNeed(@RequestParam(name="nid") String needId) {
		return needService.deleteNeed(needId);
	}

}
