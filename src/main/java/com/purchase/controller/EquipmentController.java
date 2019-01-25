package com.purchase.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.purchase.entity.Equipment;
import com.purchase.sevice.EquipmentService;

@RestController
@RequestMapping(value="/equip", produces = "application/json;charset=UTF-8")
public class EquipmentController {

	@Autowired
	private EquipmentService equipService;

	@GetMapping("/all")
	public List<Equipment> getAllEquip() {
		return equipService.getAllEquipment();
	}

	@GetMapping("/{eid}")
	public Equipment getEquipmentById(@PathVariable(value = "eid") String equipId) {
		return equipService.getEquipById(equipId);
	}

	@PostMapping("/add")
	public boolean addEquipment(Equipment equipment, File file) {
		System.out.println(file.getName());
		return equipService.addEquip(equipment);
	}

	@PostMapping("/delete")
	public boolean deleteEquipment(@RequestParam(name = "eid") String equipId) {
		return equipService.deleteEquipById(equipId);
	}

	@PostMapping("/update")
	public boolean updateEquipment(Equipment equipment) {
		return equipService.updateEquip(equipment);
	}
	@GetMapping("/category/{cid}")
	public List<Equipment> getEquipByCate(@PathVariable(value="cid") String cateId) {
		return equipService.getEquipByCate(cateId);
	}
	@PostMapping("/name")
	public List<Equipment> getEquipByName(@RequestParam(name="equipName") String equipName) {
		return equipService.getEquipByName(equipName);
	}
}
