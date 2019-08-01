package com.portal.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.portal.daos.AddressDao;
import com.portal.daos.EmployeeDao;
import com.portal.daosimpl.AddressDaoimpl;
import com.portal.daosimpl.EmployeeDaoImpl;
import com.portal.entities.Address;

/**
 * Servlet implementation class UpdateAddress
 */
@WebServlet("/UpdAddr")
public class UpdateAddress extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session=request.getSession();
		int i=(int) session.getAttribute("userId");
		int hou = Integer.parseInt(request.getParameter("hn"));
		String loc = request.getParameter("lo");
		String cit = request.getParameter("ci");
		String sta = request.getParameter("st");
		String pin = request.getParameter("pi");
		Address ad = new Address();
		ad.setHouseNo(hou);
		ad.setCity(cit);
		ad.setLocality(loc);
		ad.setPincode(pin);
		ad.setState(sta);
		AddressDao daoObj=new AddressDaoimpl();
		boolean r=daoObj.updateAddress(ad,i);
		if(r)
		{
			session.setAttribute("x", ad);
			RequestDispatcher rd=request.getRequestDispatcher("EmployeeSuccess.jsp");
			rd.forward(request, response);
		}
	}

}
