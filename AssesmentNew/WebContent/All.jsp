<%@ page import="com.portal.entities.Employee" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="Header.jsp"/>
	 <h3>Welcome ${"userName"}</h3>
		
		<table>
			<th>Id</th>
			<th>Name</th>
			<th>Gender</th>
			<th>Qualification</th>
			<th>ContactNo</th>
			<th>Email</th>
			<th>role</th>
			<c:forEach items="${e}" var="a">
				<tr>
					<td>${a.employeeId}</td>
					<td>${a.employeeName}</td>
					<td>${a.gender}</td>
					<td>${a.contactNo}</td>
					<td>${a.qualification}</td>
					<td>${a.emailAddress}</td>
					<td>${a.role }</td>
				</tr>
			</c:forEach>
		</table>
	</div>
	
</body>
</html>