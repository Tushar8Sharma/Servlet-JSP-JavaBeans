package com.portal.controllers;

import java.io.IOException;
import java.io.PrintWriter;

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
import com.portal.entities.Employee;

/**
 * Servlet implementation class AddAddresss
 */
@WebServlet("/AddAddresss")
public class AddAddresss extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Address a = new Address();
		HttpSession session = request.getSession();
		int i = (int)session.getAttribute("userId");
		PrintWriter out = response.getWriter();
		int ho = Integer.parseInt(request.getParameter("h"));
		a.setHouseNo(ho);
		String loc = request.getParameter("l");
		a.setLocality(loc);
		String ci = request.getParameter("c");
		a.setCity(ci);
		String st = request.getParameter("s");
		a.setState(st);
		String pi = request.getParameter("p");
		a.setPincode(pi);
		AddressDao daoObj=new AddressDaoimpl();
		boolean r=daoObj.addAddress(a,i);
		if(r)
		{
			session.setAttribute("x", a);
			RequestDispatcher rd = request.getRequestDispatcher("EmployeeSuccess.jsp");
			rd.forward(request, response);
		}
	}

}
