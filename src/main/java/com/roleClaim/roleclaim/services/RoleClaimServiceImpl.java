package com.roleClaim.roleclaim.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.roleClaim.roleclaim.entities.RoleClaimDetails;



@Service
public class RoleClaimServiceImpl implements RoleClaimServices{

	
	List<RoleClaimDetails> list;
	
	List<RoleClaimDetails> list2;
	
	public RoleClaimServiceImpl()
	{
		list = new ArrayList<>();
		list.add(new RoleClaimDetails(150, 151, "claimvalue1", "claimtype1"));
		list.add(new RoleClaimDetails(152, 153, "claimvalue3", "claimtype3"));
	}
	
	@Override
	public List<RoleClaimDetails> getDetails() {
		// TODO Auto-generated method stub
		return list;
	}

	@Override
	public RoleClaimDetails getById(long id) {
		// TODO Auto-generated method stub
		
		RoleClaimDetails c = null;
		for(RoleClaimDetails detail : list)
		{
			if(detail.getId() == id)
			{
				c = detail;
				break;
			}
		}
		
		return c;
	}

	@Override
	public RoleClaimDetails addDetails(RoleClaimDetails roleclaimdetails) {
		// TODO Auto-generated method stub
		
		list.add(roleclaimdetails);
		return roleclaimdetails;
	}
	
	
	public RoleClaimDetails deleteDetails(long id)
	{
		RoleClaimDetails roledetails = list.stream().filter(e -> e.getId() == id).findFirst().get();
		list.remove(roledetails);
		
		return roledetails;
	}
	
	
	
	

}
