package com.purchase.sevice.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.purchase.entity.Equipment;
import com.purchase.mapper.EquipmentMapper;
import com.purchase.sevice.EquipmentService;

@Service
public class EquipmentServiceImpl implements EquipmentService {

	@Autowired
	private EquipmentMapper equipMapper;

	@Override
	public List<Equipment> getAllEquipment() {
		return equipMapper.selectAll();
	}
	@Override
	public Equipment getEquipById(String equipId) {
		return equipMapper.selectByPrimaryKey(equipId);
	}
	
	@Override
	public boolean addEquip(Equipment equipment) {
		try {
			equipMapper.insert(equipment);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	@Override
	public boolean deleteEquipById(String equipId) {
		try {
			equipMapper.deleteByPrimaryKey(equipId);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	@Override
	public boolean updateEquip(Equipment equipment) {
		try {
			equipMapper.updateByPrimaryKey(equipment);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
}
