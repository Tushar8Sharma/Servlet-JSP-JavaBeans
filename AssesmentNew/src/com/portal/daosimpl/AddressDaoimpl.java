package com.portal.daosimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.portal.daos.AddressDao;
import com.portal.entities.Address;
import com.portal.entities.Employee;
import com.portal.utility.ConnectionProvider;

public class AddressDaoimpl implements AddressDao{

	@Override
	public boolean addAddress(Address a,int i) {
		try (
				Connection conn=ConnectionProvider.getDBConnection();
				){
				PreparedStatement ps=conn.prepareStatement("insert into address values(?,?,?,?,?,?)");
				ps.setInt(1,i);
				ps.setInt(2,a.getHouseNo());
				ps.setString(3,a.getLocality());
				ps.setString(4,a.getCity());
				ps.setString(5,a.getState());
				ps.setString(6,a.getPincode());
				int m=ps.executeUpdate();
				if(m!=0){
					return true;
				}
				
				}
				catch(Exception e){
					e.printStackTrace();
				}
		return false;
	}

	@Override
	public boolean updateAddress(Address a,int i) {
		try (
				Connection conn=ConnectionProvider.getDBConnection();
				){
				PreparedStatement ps=conn.prepareStatement("Update Address set houseno=?,locality=?,city=?,state=?,pincode=? where eid=?");
				ps.setInt(1, a.getHouseNo());
				ps.setString(2, a.getLocality());
				ps.setString(3, a.getCity());
				ps.setString(4, a.getState());
				ps.setString(5, a.getPincode());
				ps.setInt(6, i);
				ps.executeUpdate();
				return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public Address getAddressByEmployee(int eid) {
		try (Connection conn=ConnectionProvider.getDBConnection();){
			PreparedStatement ps=conn.prepareStatement("select eid,houseno,locality,city,state,pincode from address where EId=?");
			ps.setInt(1,eid);
			ResultSet rs=ps.executeQuery();
			if(rs.next()){
				//System.out.println("I m in if : "+rs.getString(2));
				
				//if user is valid
				int hn=rs.getInt(2);
				String lo=rs.getString(3);
				String ci=rs.getString(4);
				String st=rs.getString(5);
				String pi=rs.getString(6);
				
				Address ad=new Address();
				ad.setHouseNo(hn);
				ad.setLocality(lo);
				ad.setCity(ci);
				ad.setState(st);
				ad.setPincode(pi);
				return ad;
				
			}
				
			}
			catch(Exception e){
				e.printStackTrace();
			}
		return null;
	}

}
