<jsp:include page="Header.jsp"/>
	<h3>Welcome <%=session.getAttribute("userName") %></h3>
	
	<br/>
	
	<table>
		<tr>
			<td><label>Your id : <%=session.getAttribute("userId") %></label></td>
		</tr>
		<tr>
			<td><label>Your Gender : <%=session.getAttribute("userGender") %></label></td>
		</tr>
		<tr>
			<td><label>Your Qualification : <%=session.getAttribute("userQualification") %></label></td>
		</tr>
		<tr>
			<td><label>Your Contact no. : <%=session.getAttribute("userContact") %></label></td>
		</tr>
		<tr>
			<td><label>Your Email address : <%=session.getAttribute("userAddress") %></label></td>
		</tr>
		<tr>
			<td><label>Your role : <%=session.getAttribute("userRole") %></label></td>
		</tr>
		<tr>
			<td><label>Your Address : <%=session.getAttribute("userAdd") %></label></td>
		</tr>
	</table>

</body>
</html>