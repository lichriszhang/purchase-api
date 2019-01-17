package com.purchase.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.purchase.entity.Supplier;
import com.purchase.sevice.SupplierService;

@RestController
@RequestMapping("/supplier")
public class SupplierController {
	
	@Autowired
	private SupplierService supplierService;
	
	@GetMapping("/all")
	public List<Supplier> getAllSupplier() {
		return supplierService.getAllSupplier();
	}
	@GetMapping(value = "/{sid}")
	public Supplier getSupplierById(@PathVariable("sid") String supplierId) {
		return supplierService.getSupplierById(supplierId);
	}
	@PostMapping("/add")
	public boolean addSupplier(Supplier supplier) {
		return supplierService.addSupplier(supplier);
	}
	@PostMapping("/update")
	public boolean updateSupplier(Supplier supplier) {
		return supplierService.updateSupplier(supplier);
	}
	@PostMapping("/delete")
	public boolean deleteSupplier(@RequestParam(name="sid") String supplierId) {
		return supplierService.deleteSupplierById(supplierId);
	}
}
