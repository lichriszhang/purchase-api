package com.purchase.sevice.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.purchase.entity.Supplier;
import com.purchase.mapper.SupplierMapper;
import com.purchase.sevice.SupplierService;
@Service
public class SupplierServiceImpl implements SupplierService {

	@Autowired
	private SupplierMapper supplierMapper;
	@Override
	public List<Supplier> getAllSupplier() {
		return supplierMapper.seleteAll();
	}

	@Override
	public Supplier getSupplierById(String supplierId) {
		return supplierMapper.selectByPrimaryKey(supplierId);
	}

	@Override
	public boolean addSupplier(Supplier supplier) {
		try {
			supplierMapper.insert(supplier);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean deleteSupplierById(String supplierId) {
		try {
			supplierMapper.deleteByPrimaryKey(supplierId);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean updateSupplier(Supplier supplier) {
		try {
			supplierMapper.updateByPrimaryKey(supplier);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

}
