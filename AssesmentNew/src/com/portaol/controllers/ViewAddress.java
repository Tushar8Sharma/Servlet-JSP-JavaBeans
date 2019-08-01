package com.portaol.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.portal.daos.AddressDao;
import com.portal.daosimpl.AddressDaoimpl;
import com.portal.entities.Address;


/**
 * Servlet implementation class ViewAddress
 */
@WebServlet("/ViewAddress")
public class ViewAddress extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session=request.getSession();
		int i = (int) session.getAttribute("userId");
		AddressDao a = new AddressDaoimpl();
		Address q = a.getAddressByEmployee(i);
		if(q!=null)
		{
			session.setAttribute("x", q);
			RequestDispatcher rd = request.getRequestDispatcher("ViewAddr.jsp");
			rd.forward(request, response);
		}
		else 
		{
			RequestDispatcher rd = request.getRequestDispatcher("AddAddr.jsp");
			rd.forward(request, response);
		}
	}

}
