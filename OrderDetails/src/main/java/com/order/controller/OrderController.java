package com.order.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.order.module.OrderDetails;
import com.order.repository.OrderDetailsRepository;

@RestController
@RequestMapping("/order")
public class OrderController {
	
	
	
	@Autowired
	private OrderDetailsRepository orderdetailsrepository;
	
	
	@GetMapping("/findallorder")
	public List<OrderDetails>getAllOrder(){
		
		return orderdetailsrepository.findAll();		
		
	}
	
	@PostMapping("/saveorder")
	public String addorder(@RequestBody OrderDetails orderDetails) {
		orderdetailsrepository.save(orderDetails);
		return "Order Places Successfully";
	}
	
	
	@DeleteMapping("/deleteorder/{orderId}")
	public String deleteOrder(@PathVariable ("orderId") String orderId) {
		
		orderdetailsrepository.deleteById(orderId);
		return "Order Deleted Successfully";
		
	}
	
	@GetMapping("/allOrdersbydealer/{dealername}")
	public Optional<OrderDetails> findOrdersByBuyer(@PathVariable("dealername") String dealername){
		return orderdetailsrepository.findBydealername(dealername);
	}
	
	
}
