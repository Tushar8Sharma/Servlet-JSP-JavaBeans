package com.iris.dao;

import java.util.List;

import com.iris.model.Customers;

public interface CustomerDao {
	public boolean addCustomer(Customers c);
	public List<Customers> getAllCustomers();
}
