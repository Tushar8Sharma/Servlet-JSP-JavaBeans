package com.portal.update;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.portal.daos.EmployeeDao;
import com.portal.daosimpl.EmployeeDaoImpl;
import com.portal.entities.Employee;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Employee e = new Employee();
		PrintWriter out = response.getWriter();
		String names = request.getParameter("name");
		e.setEmployeeName(names);
		String contact = request.getParameter("con");
		e.setContactNo(contact);
		String quali = request.getParameter("qual");
		e.setQualification(quali);
		String gen = request.getParameter("gender");
		e.setGender(gen);
		String em = request.getParameter("email");
		e.setEmailAddress(em);
		String pa = request.getParameter("pass");
		e.setPassword(pa);
		String rol = request.getParameter("role");
		e.setRole(rol);
		String Addre = request.getParameter("Addr");
		e.setRole(Addre);
		EmployeeDao daoObj=new EmployeeDaoImpl();
		boolean r=daoObj.register(e);
		if(r)
		{
			out.println("Registered successfully");
			RequestDispatcher rd = request.getRequestDispatcher("AdminSuccess.jsp");
			rd.forward(request, response);
		}
		else 
		{
			out.println("Registered unsuccessfully");
			RequestDispatcher rd = request.getRequestDispatcher("AdminSuccess.jsp");
			rd.forward(request, response);
		}
	}

}
