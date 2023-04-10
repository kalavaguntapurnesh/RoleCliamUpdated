package com.roleClaim.roleclaim.services;

import java.util.List;

import com.roleClaim.roleclaim.entities.RoleClaimDetails;

public interface RoleClaimServices {
	
	public List<RoleClaimDetails> getDetails();
	
	public RoleClaimDetails getById(long id);
	
	public RoleClaimDetails addDetails(RoleClaimDetails roleclaimdetails);
	
	public RoleClaimDetails deleteDetails(long id);
	

}
