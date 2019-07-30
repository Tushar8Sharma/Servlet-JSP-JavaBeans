package com.portal.update;

import java.io.IOException;

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
 * Servlet implementation class AddAddress
 */
@WebServlet("/AddAddress")
public class AddAddress extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String addr = request.getParameter("a");
		EmployeeDao daoObj=new EmployeeDaoImpl();
		HttpSession session = request.getSession();
		String x = (String) session.getAttribute("userName");
		Employee e = new Employee();
		e.setAddress(x);
		boolean r=daoObj.regAddress(addr,e);
		if(r)
		{	
			session.setAttribute("userAdd",addr);
			RequestDispatcher rd = request.getRequestDispatcher("EmployeeSuccess.jsp");
			rd.forward(request, response);
		}
	}

}
