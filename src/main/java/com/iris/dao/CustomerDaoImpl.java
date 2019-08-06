package com.iris.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.hybernate.Controller.SessionFactoryProvider;
import com.iris.model.Customers;

public class CustomerDaoImpl implements CustomerDao {

	public boolean addCustomer(Customers c) {
		try {
		Session session = SessionFactoryProvider.getsf().openSession();
		Transaction tx = session.beginTransaction();
		session.save(c);
		tx.commit();
		session.close();
		return true;}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return false;
	}

	public List<Customers> getAllCustomers() {
		try {
			Session session = SessionFactoryProvider.getsf().openSession();
			Query<Customers> query=session.createQuery("from Customers");
			List<Customers> customers=query.getResultList();
			return customers;
		}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			return null;
	}

}
