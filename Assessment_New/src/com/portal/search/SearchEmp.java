package com.portal.search;

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
 * Servlet implementation class SearchEmp
 */
@WebServlet("/SearchEmp")
public class SearchEmp extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int empid=Integer.parseInt(request.getParameter("id"));
		EmployeeDao daoObj=new EmployeeDaoImpl();
		Employee r=daoObj.getEmployeeById(empid);
		PrintWriter out = response.getWriter();
		if(r!=null)
		{
			HttpSession session=request.getSession();
			session.setAttribute("i", r.getEmployeeId());
			session.setAttribute("na", r.getEmployeeName());
			session.setAttribute("ge", r.getGender());
			session.setAttribute("q", r.getQualification());
			session.setAttribute("co", r.getContactNo());
			session.setAttribute("em", r.getEmailAddress());
			session.setAttribute("ro", r.getRole());
			session.setAttribute("ad", r.getAddress());
			RequestDispatcher rd = request.getRequestDispatcher("Show.jsp");
			rd.forward(request, response);
		}
		else 
		{
			out.println("no such employee");
			RequestDispatcher rd = request.getRequestDispatcher("search.jsp");
			rd.include(request, response);
		}
	}

}
