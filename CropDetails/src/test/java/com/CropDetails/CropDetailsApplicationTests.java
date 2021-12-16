package com.CropDetails;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.CropDetails.Controller.Controller;
import com.CropDetails.repository.CropRepository;


@SpringBootTest
class CropDetailsApplicationTests {
    @Autowired
	private Controller controller;
    
	@MockBean
    private CropRepository cropRepository;
	@Test
	void contextLoads() {
		
	}
	}
//	@Test
//	public void findAllDealerTest() {
//		when(cropRepository.findAll()).thenReturn(Stream.of
//				(new Crop("12","potato","70","100","pune"),
//						new Crop("12","potato","70","100","pune"))
//		.collect(Collectors.toList()));
//		assertEquals(2,controller.getall().size());
//	}
	
//	@Test
//	public void deleteCropTest() {
//		int id = 115;
//		cropdetailscontroller. delete(id);
//		verify(cropdeatilsrepository,times(1)).deleteById(id);
//	}
//	
//	@Test
//	public void getDealerDataTest() {
//		int id = 107;
//		cropdetailscontroller. getCropbyId(id);
//		verify(cropdeatilsrepository,times(1)).findById(id);
//	}






//private String id;
//private String cropname;
//private  String countity;
//private String price;
//private String location;
