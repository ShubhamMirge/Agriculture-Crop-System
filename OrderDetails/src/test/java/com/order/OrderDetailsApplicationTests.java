package com.order;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.order.controller.OrderController;
import com.order.module.OrderDetails;
import com.order.repository.OrderDetailsRepository;

@SpringBootTest
class OrderDetailsApplicationTests {

	@Test
	void contextLoads() {
		
	}

	
	@Autowired
	private OrderController orderController;
	
	@MockBean
	private OrderDetailsRepository orderdetailsrepository;
	
	
	
	@Test
	public void findAllOrderTest() {
		when(orderdetailsrepository.findAll()).thenReturn(Stream.of
				(new OrderDetails("101","12","sagar","ajinkya"),
						new OrderDetails("113","12","Sanjay","prasad"))
		.collect(Collectors.toList()));
		assertEquals(2, orderController.getAllOrder().size());
	}
	
	@Test
	public void deleteOrderTest() {
		String  orderId = "115";
		orderController. deleteOrder( orderId);
		verify(orderdetailsrepository,times(1)).deleteById( orderId);
	}
	
//	@Test
//	public void getOrderDataTest() {
//		String orderId = "107";
//		 orderController.getAllOrder(orderId);
//		verify(orderdetailsrepository,times(1)).findById(orderId);
//	}
//	
//	@Test
//	public void getOrderDatabyDealernameTest() {
//		String dealername= "ajinkya";
//		 orderController.findBydealername(dealername);
//		verify(orderdetailsrepository,times(1)).findBydealername(dealername);
//	
//	}

}

