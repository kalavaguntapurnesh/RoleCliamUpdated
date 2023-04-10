package com.roleClaim.roleclaim.entities;

public class RoleClaimDetails {
	private long id;
	private long RoleId;
	private String ClaimType;
	private String ClaimValue;
	public RoleClaimDetails(long id, long roleId, String claimType, String claimValue) {
		super();
		this.id = id;
		RoleId = roleId;
		ClaimType = claimType;
		ClaimValue = claimValue;
	}
	public RoleClaimDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getRoleId() {
		return RoleId;
	}
	public void setRoleId(long roleId) {
		RoleId = roleId;
	}
	public String getClaimType() {
		return ClaimType;
	}
	public void setClaimType(String claimType) {
		ClaimType = claimType;
	}
	public String getClaimValue() {
		return ClaimValue;
	}
	public void setClaimValue(String claimValue) {
		ClaimValue = claimValue;
	}
	@Override
	public String toString() {
		return "RoleClaimDetails [id=" + id + ", RoleId=" + RoleId + ", ClaimType=" + ClaimType + ", ClaimValue="
				+ ClaimValue + "]";
	}
	
	

}
