package com.portal.update;

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
 * Servlet implementation class ChangePassword
 */
@WebServlet("/ChangePassword")
public class ChangePassword extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String pa = request.getParameter("pa");
		String pas = request.getParameter("pas");
		String pass = request.getParameter("pass");
		HttpSession session=request.getSession();
		String p=(String)session.getAttribute("userPassword");
		PrintWriter out = response.getWriter();
		System.out.println(p);
		if(pa.equals(p)==false)
		{
			out.println("current password is incorrect");
			RequestDispatcher rd = request.getRequestDispatcher("Password.jsp");
			rd.include(request, response);
		}
		else if(pas.equals(pass))
		{
			EmployeeDao daoObj=new EmployeeDaoImpl();
			boolean r=daoObj.changePass(pass,pa);
			if((session.getAttribute("userRole")).equals("Admin"))
			{
				RequestDispatcher rd = request.getRequestDispatcher("AdminSuccess.jsp");
				rd.forward(request, response);
			}
			else
			{
				RequestDispatcher rd = request.getRequestDispatcher("EmployeeSuccess.jsp");
				rd.forward(request, response);
			}
		}
		else
		{
			out.println("new password and confirm password are not matching");
			RequestDispatcher rd = request.getRequestDispatcher("Password.jsp");
			rd.include(request, response);
		}
	}

}
