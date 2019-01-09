package com.purchase.sevice;

import java.util.List;

import com.purchase.entity.Equipment;
public interface EquipmentService {

	public List<Equipment> getAllEquipment();

	Equipment getEquipById(String equipId);

	boolean addEquip(Equipment equipment);
	
	boolean deleteEquipById(String equipId);
	
	boolean updateEquip(Equipment equipment);
	
}
