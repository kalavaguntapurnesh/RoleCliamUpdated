package com.roleClaim.roleclaim.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.roleClaim.roleclaim.entities.RoleClaimDetails;
import com.roleClaim.roleclaim.services.RoleClaimServices;

@RestController
public class RoleClaimController {
	
	@Autowired
	private RoleClaimServices roleclaimservice;
	

	
	@GetMapping("/home")
	public String home()
	{
		return "this is home";
	}
	
	//get the roleclaim details
	
	@GetMapping("/details2")
	public List<RoleClaimDetails> getDetails()
	{
		return roleclaimservice.getDetails();
	}
	
	
	@GetMapping("/getById/{id}")
	public RoleClaimDetails getById(@PathVariable String id)
	{
		return this.roleclaimservice.getById(Long.parseLong(id));
	}
	
	@PostMapping("/details2")
	public RoleClaimDetails addDetails(@RequestBody RoleClaimDetails roleclaimdetails)
	{
		return this.roleclaimservice.addDetails(roleclaimdetails);
		
	}
	
	@DeleteMapping("/getById/{id}")
	public RoleClaimDetails deleteDetails(@PathVariable String id)
	{
		 return this.roleclaimservice.deleteDetails(Long.parseLong(id));
	}
	
	
	
	
}
