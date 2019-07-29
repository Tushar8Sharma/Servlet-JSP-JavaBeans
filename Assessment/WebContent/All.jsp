<%@ page import="com.portal.entities.Employee" %>
<jsp:include page="Header.jsp"/>
	 <h3>Welcome <%=session.getAttribute("userName") %></h3>
	
	</div>
	<div align="center"> 
	 <% Employee[] e =  (Employee[])session.getAttribute("e"); %>
	<% int i=0;
		out.println("<div><table><tr><td>id</td><td>name</td><td>Gender</td><td>Qualification</td><td>Contact</td><td>role</td><td>Email</td><td>Address</td></tr>");
		while(e[i]!=null)
		{
			out.println("<tr><td>" + e[i].getEmployeeId() + "</td><td> " + e[i].getEmployeeName() + "</td><td> " + e[i].getGender() + "</td><td> " + e[i].getQualification() + "</td><td> " + e[i].getContactNo() + "</td><td> " + e[i].getRole() + "</td><td> " + e[i].getEmailAddress() + "</td><td>"+ e[i].getAddress() +"</td></tr>");
			i++;		
		}
		out.println("</table></div>");
		//out.println("i");
		%>
		</div>
</body>
</html>