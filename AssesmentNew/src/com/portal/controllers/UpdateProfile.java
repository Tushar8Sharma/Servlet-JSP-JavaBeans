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

import com.portal.daos.EmployeeDao;
import com.portal.daosimpl.EmployeeDaoImpl;
import com.portal.entities.Employee;

/**
 * Servlet implementation class UpdateProfile
 */
@WebServlet("/UpdateServlet")
public class UpdateProfile extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session=request.getSession();
		int i=(int) session.getAttribute("userId");
		String name1 = request.getParameter("empname");
		String n = request.getParameter("contact");
		String Quali = request.getParameter("Qualification");
		Employee e = new Employee();
		e.setEmployeeName(name1);
		e.setContactNo(n);
		e.setQualification(Quali);
		EmployeeDao daoObj=new EmployeeDaoImpl();
		boolean r=daoObj.updateEmployee(e,i);
		if(r)
		{
			session.setAttribute("userName",name1);
			session.setAttribute("userContact",n);
			session.setAttribute("userQualification",Quali);
			RequestDispatcher rd=request.getRequestDispatcher("EmployeeSuccess.jsp");
			rd.forward(request, response);
		}
		else
		{
			PrintWriter out = response.getWriter();
			out.print("not possible");
		}
	}

}
