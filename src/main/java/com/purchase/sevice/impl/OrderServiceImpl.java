package com.purchase.sevice.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.purchase.entity.Orders;
import com.purchase.mapper.OrdersMapper;
import com.purchase.sevice.OrderService;
@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	private OrdersMapper orderMapper;
	@Override
	public List<Orders> getAllOrders() {
		return orderMapper.selectAll();
	}

	@Override
	public Orders getOrderById(String orderId) {
		return orderMapper.selectByPrimaryKey(orderId);
	}

	@Override
	public boolean addOrder(Orders order) {
		try {
			orderMapper.insert(order);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean updateOrder(Orders order) {
		try {
			orderMapper.updateByPrimaryKey(order);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean deleteOrder(String orderId) {
		try {
			orderMapper.deleteByPrimaryKey(orderId);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

}
