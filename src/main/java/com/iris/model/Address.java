package com.iris.model;

import javax.persistence.Embeddable;

@Embeddable
public class Address {
	private String HouseNo;
	private String locality;
	private String State;
	public String getHouseNo() {
		return HouseNo;
	}
	public void setHouseNo(String houseNo) {
		HouseNo = houseNo;
	}
	public String getLocality() {
		return locality;
	}
	public void setLocality(String locality) {
		this.locality = locality;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	@Override
	public String toString() {
		return "Address [HouseNo=" + HouseNo + ", locality=" + locality + ", State=" + State + "]";
	}
}
