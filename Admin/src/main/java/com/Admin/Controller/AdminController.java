package com.Admin.Controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

import com.Admin.Module.Crop;
import com.Admin.Module.DealerData;
import com.Admin.Module.FarmerDetail;
import com.Admin.Module.OrderDetails;

public class AdminController {


	private RestTemplate restTemplate;
	
	@GetMapping("/AllCropData")
	public List<Crop> getCropList(){
		Crop[] list = restTemplate.getForObject("http://localhost:9010/CropDetails", Crop[].class);
		return Arrays.asList(list);
	}
	@GetMapping("/getdetails")
	public List<FarmerDetail> getFarmerDetailsList()
	{
		FarmerDetail[] list = restTemplate.getForObject("http://localhost:9011/getdetails",FarmerDetail[].class);
		return Arrays.asList(list);
		
	}
	
	@GetMapping("/finddealerdata")
	public List<DealerData> getDealerDataList(){
		DealerData[] list = restTemplate.getForObject("http://localhost:9012/finddealerdata",DealerData[].class);
		return Arrays.asList(list);
	}
	@GetMapping("/findallorder")
	public List<OrderDetails> getOrderDetailsList(){
		OrderDetails[] list = restTemplate.getForObject("http://localhost:9013/findallorder",OrderDetails[].class);
		return Arrays.asList(list);	
	}
}
