package com.CropDetails.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.CropDetails.Crop;

public interface CropRepository extends MongoRepository<Crop, String> {
	
	
	

}
