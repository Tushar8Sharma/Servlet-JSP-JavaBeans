package com.portal.controllers;

import java.awt.List;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.portal.daos.EmployeeDao;
import com.portal.daosimpl.EmployeeDaoImpl;
import com.portal.entities.Employee;

/**
 * Servlet implementation class AllEmployee
 */
@WebServlet("/AllEmployee")
public class AllEmployee extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		HttpSession session = request.getSession();
			EmployeeDao daoObj=new EmployeeDaoImpl();
			ArrayList<Employee> arr = new ArrayList<Employee>(10);
			arr=(ArrayList<Employee>) daoObj.getAllEmployee();
			
			session.setAttribute("e",arr);
			RequestDispatcher rd = request.getRequestDispatcher("All.jsp");
			rd.forward(request, response);
	}

}
