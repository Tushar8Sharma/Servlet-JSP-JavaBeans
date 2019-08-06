package com.iris.test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.iris.dao.CustomerDao;
import com.iris.dao.CustomerDaoImpl;
import com.iris.model.Address;
import com.iris.model.Customers;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customers c =new Customers();
		c.setEmail("r@1.com");
		c.setContact("9748373199");
		c.setName("Rohit");
		Address a = new Address();
		a.setHouseNo("1");
		a.setLocality("sector-52");
		a.setState("UP");
		Set<Address> Ad = new HashSet<Address>();
		Ad.add(a);
		Address a1 = new Address();
		a1.setHouseNo("1");
		a1.setLocality("sector-52");
		a1.setState("Wb");
		Ad.add(a1);
		c.setAddresses(Ad);
		CustomerDao o = new CustomerDaoImpl();
		boolean r = o.addCustomer(c);
		if(r)
		{
			System.out.println("added");
		}
		else
		{
			System.out.println("not added");
		}
		List<Customers> x = o.getAllCustomers();
		for(Customers c1 : x)
		{
			System.out.println(x.toString());
		}
	}

}
