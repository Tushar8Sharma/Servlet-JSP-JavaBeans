package com.portal.show;

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
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int i=0;
		PrintWriter out = response.getWriter();
		String s = request.getParameter("pa");
		HttpSession session = request.getSession();
		String n = (String)session.getAttribute("UserPassword");
		if(s.equals("1236"))
		{
			EmployeeDao daoObj=new EmployeeDaoImpl();
			ArrayList<Employee> arr = new ArrayList<Employee>(10);
			arr=(ArrayList<Employee>) daoObj.getAllEmployee();
			Employee[] e = new Employee[10];
			Iterator<Employee> it = arr.iterator();
			while(it.hasNext())
			{	
				e[i] = it.next();
				i++;
			}
			//out.println(e[0].getEmployeeId());
			session.setAttribute("e",e);
			RequestDispatcher rd = request.getRequestDispatcher("All.jsp");
			rd.forward(request, response);
		}
		else
		{
			out.println(s);
			out.println(n);
			out.println("Hello");
		}
	}

}
