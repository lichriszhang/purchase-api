package com.purchase.sevice.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.purchase.entity.Needs;
import com.purchase.mapper.NeedsMapper;
import com.purchase.sevice.NeedsService;
@Service
public class NeedsServiceImpl implements NeedsService {

	@Autowired
	private NeedsMapper needMapper;
	@Override
	public List<Needs> getAllNeeds() {
		return needMapper.selectAll();
	}

	@Override
	public Needs getNeedById(String needId) {
		return needMapper.selectByPrimaryKey(needId);
	}

	@Override
	public boolean addNeed(Needs need) {
		try {
			needMapper.insert(need);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean updateNeed(Needs need) {
		try {
			needMapper.updateByPrimaryKey(need);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean deleteNeed(String needId) {
		try {
			needMapper.deleteByPrimaryKey(needId);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
}
