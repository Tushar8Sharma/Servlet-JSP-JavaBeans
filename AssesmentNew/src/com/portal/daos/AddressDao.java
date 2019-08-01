package com.portal.daos;
import com.portal.entities.Address;
import com.portal.entities.Employee;
public interface AddressDao {
	public boolean addAddress(Address a,int i);
	public boolean updateAddress(Address a,int i);
	public Address getAddressByEmployee(int eid);
}
