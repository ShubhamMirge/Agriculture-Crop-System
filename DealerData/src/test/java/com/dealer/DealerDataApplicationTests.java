package com.dealer;

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

import com.dealer.controller.DealerController;
import com.dealer.module.DealerData;
import com.dealer.repository.DealerDataRepository;


@SpringBootTest
class DealerDataApplicationTests {

	@Test
	void contextLoads() {
		
		
	}
	
	@Autowired
	private DealerController controller;
	
	@MockBean
	private DealerDataRepository repository;
	
	@Test
	public void findAllDealerTest() {
		when(repository.findAll()).thenReturn(Stream.of
				(new DealerData("101","Shubham","Aurangabad",50,"89523535"),
						new DealerData("102","amol","solapur",50,"895236545"))
		.collect(Collectors.toList()));
		assertEquals(2,controller.getAllData().size());
	}
	
	@Test
	public void deleteDealerTest() {
		String dealer_id = "201";
		controller. deletDatabyId(dealer_id);
		verify(repository,times(1)).deleteById(dealer_id);
	}
	
	@Test
	public void getDealerDataTest() {
		String dealer_id = "104";
		controller. getdealerbyId(dealer_id);
		verify(repository,times(1)).findById(dealer_id);
	}
	
	
}


