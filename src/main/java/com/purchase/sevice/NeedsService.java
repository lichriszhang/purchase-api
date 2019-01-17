package com.purchase.sevice;

import java.util.List;

import com.purchase.entity.Needs;
public interface NeedsService {

	public List<Needs> getAllNeeds();
	
	Needs getNeedById(String needId);
	
	boolean addNeed(Needs need);
	
	boolean updateNeed(Needs need);
	
	boolean deleteNeed(String needId);
	
}
