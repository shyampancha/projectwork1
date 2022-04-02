package com.farmsystem.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import com.farmsystem.backend.entity.Farmer;
import com.farmsystem.backend.repository.FarmerRepo;


@RestController
//@RequestMapping("/arlines-PRN")
public class HomeController 
{
	@Autowired
	FarmerRepo farmerRepo;
		
	@PostMapping("/login")
	public String loginUser(@RequestBody Farmer farmer) {
	        List<Farmer> objfarmer = farmerRepo.findAll();       
	    
	
	        for(Farmer obj : objfarmer)
	        {
	        	
		        if((obj.getUsername() == farmer.getUsername()) && (obj.getPassword() == farmer.getPassword() ) )
		        {
		        	return "pass";
		        	
		        } 
		       
		        
	        }
	        return "fail";
			
	        
	}
	
}
