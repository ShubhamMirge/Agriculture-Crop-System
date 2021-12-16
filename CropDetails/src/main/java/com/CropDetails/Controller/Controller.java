package com.CropDetails.Controller;

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

import com.CropDetails.Crop;
import com.CropDetails.CropDetailsApplication;
import com.CropDetails.repository.CropRepository;

@RestController
@RequestMapping("/crop")
public class Controller {
	  @Autowired
	private CropRepository cRepo;
	 
	  @GetMapping("/CropDetails")
	  public List<Crop> getall(){
		  return cRepo.findAll();
		  
		  
		  
		  
	  }
	  @PostMapping("/Save")
	  
	  public String add(@RequestBody Crop crop)
	  {
		  cRepo.save(crop);
		  
		  
		  return "add";
		  
		  
	  }
	  
	  @GetMapping("/details/{id}")
	  public Optional<Crop> getCropbyId(@PathVariable ("id") String id)
	  {
		return  cRepo.findById(id);
		  
	  }
	  @DeleteMapping("/delete/{id}")
 	public String delete(@PathVariable ("id") String id)
 	{
		  cRepo.deleteById(id);
		  return "Crop deleted Successfully";
	}
	  

}
