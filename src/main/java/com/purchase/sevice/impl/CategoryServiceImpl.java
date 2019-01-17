package com.purchase.sevice.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.purchase.entity.Category;
import com.purchase.mapper.CategoryMapper;
import com.purchase.sevice.CategoryService;
@Service
public class CategoryServiceImpl implements CategoryService {
	
	@Autowired
	private CategoryMapper categoryMapper;

	@Override
	public List<Category> getAll() {
		return categoryMapper.selectAll();
	}

}
