<jsp:include page="Header.jsp"/>

	<h3>Welcome ${userName}</h3>
	
	<br/>
	
	<table>
		<tr>
			<td><a href="Register.jsp"> 1. Register a New Employee</a></td>
		</tr>
		<tr>
			<td><a href="AllEmployee">2. View All Employees</a></td>
		</tr>
		<tr>
			<td><a href="search.jsp">3. Search Employee By Id</a></td>
		</tr>
		<tr>
			<td><a href="Password.jsp">4. Change your Password</a></td>
		</tr>
	</table>
	<form action="LogOut" method="post">
		<input type="submit" value="Log Out"/>
	</form>
</body>
</html>
