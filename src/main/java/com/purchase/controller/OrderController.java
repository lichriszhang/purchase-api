package com.purchase.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.purchase.entity.Orders;
import com.purchase.sevice.OrderService;

@RestController
@RequestMapping("/order")
public class OrderController {

	@Autowired
	private OrderService orderService;
	
	@GetMapping("/all")
	public List<Orders> getAllOrders() {
		return orderService.getAllOrders();
	}
	@GetMapping("/{oid}")
	public Orders getOrderById(@PathVariable(name="oid") String orderId) {
		return orderService.getOrderById(orderId);
	}
	@PostMapping("/add")
	public boolean addOrder(Orders order) {
		return orderService.addOrder(order);
	}
	@PostMapping("/update")
	public boolean updateOrder(Orders order) {
		return orderService.updateOrder(order);
	}
	@PostMapping("/delete")
	public boolean deleteOrder(@RequestParam(value="oid") String orderId) {
		return orderService.deleteOrder(orderId);
	}
}
