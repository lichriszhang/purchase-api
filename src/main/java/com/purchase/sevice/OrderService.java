package com.purchase.sevice;

import java.util.List;

import com.purchase.entity.Orders;
public interface OrderService {

	List<Orders> getAllOrders();
	
	Orders getOrderById(String orderId);
	
	boolean addOrder(Orders order);
	
	boolean updateOrder(Orders order);
	
	boolean deleteOrder(String orderId);
	
}
