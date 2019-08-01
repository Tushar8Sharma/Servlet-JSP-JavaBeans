<jsp:include page="Header.jsp"/>

	<h3>Welcome ${userName}</h3>
	
	<br/>
	
	<table>
		<tr>
			<td><a href="VPro.jsp">1. View Profile</a></td>
		</tr>
		<tr>
			<td><a href="UpdateProfile.jsp">2. Update Profile</a></td>
		</tr>
		<tr>
			<td><a href="Password.jsp">3. Change Password</a></td>
		</tr>
		<tr>
			<td><a href="ViewAddress">4. View address</a></td>
		</tr>
		
	</table>
	<form action="LogOut" method="post">
		<input type="submit" value="Log Out"/>
	</form>
</body>
</html>