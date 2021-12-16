package com.dealer.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.dealer.module.Crop;
import com.dealer.module.Crop;
import com.dealer.module.DealerData;
import com.dealer.repository.DealerDataRepository;



@RestController

public class DealerController {
	
	
	@Autowired
	private DealerDataRepository dealerDataRepository;
	
	@Autowired
	RestTemplate restTemplate;
	
	
		@GetMapping("/finddealerdata")
	public List<DealerData> getAllData(){
		
		return dealerDataRepository.findAll();
	}
	
		@PostMapping("/savedealerdata")
	public String SaveDealarData(@RequestBody DealerData dealerData) {
		
		dealerDataRepository.save(dealerData);
		return "Add Dealer Data Successfully";
	}
	
	@DeleteMapping("/deletedealerdata/{dealerid}")
	public String deletDatabyId(@PathVariable ("dealerid") String dealerid) {
		dealerDataRepository.deleteById(dealerid);
		return "Dealer data deleted Successfully";
		
	}
	
	@GetMapping("/findalldealer/{dealerid}")
	public Optional<DealerData> getdealerbyId(@PathVariable ("dealerid") String dealerid){
		return dealerDataRepository.findById(dealerid); 
	}
	
	
	
	@GetMapping("/allcropdata")
	public List<Crop> getCropList(){
		
		Crop[] list = restTemplate.getForObject("http://localhost:9010/CropDetails",Crop[].class);
		return Arrays.asList(list);
	}
	
	
	
	
	
	
}
	

