package com.portal.entities;

import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

//POJO
public class Employee implements HttpSessionBindingListener {
	
	private int employeeId;
	private String employeeName;
	private String gender;
	private String qualification;
	private String contactNo;
	private String emailAddress;
	private String password;
	private String role;
	private Address address;
	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public String getContactNo() {
		return contactNo;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address addr) {
		address.setHouseNo(addr.getHouseNo());
		address.setLocality(addr.getLocality());
		address.setCity(addr.getCity());
		address.setState(addr.getState());
		address.setPincode(addr.getPincode());
	}
	@Override
	public void valueBound(HttpSessionBindingEvent event) {
		// TODO Auto-generated method stub
		Employee e = (Employee) event.getValue();
		String s = "+91";
		String x = s.concat(e.contactNo);
		e.contactNo=x;
		
	}
	@Override
	public void valueUnbound(HttpSessionBindingEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	
}
