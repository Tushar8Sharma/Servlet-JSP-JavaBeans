<jsp:include page="Header.jsp"/>
	
	<h3><a href="LoginForm.jsp">Login Here</a></h3>
		<form>
			<table>
			<tr>
				<th>ID</th>
				<th>Name</th>
				<th>Gender</th>
				<th>Qualification</th>
				<th>Contact</th>
				<th>Email Address</th>
				<th>Role</th>
			</tr>
			<tr>
				<td><%=session.getAttribute("i") %></td>
				<td><%=session.getAttribute("na") %></td>
				<td><%=session.getAttribute("ge") %></td>
				<td><%=session.getAttribute("q") %></td>
				<td><%=session.getAttribute("co") %></td>
				<td><%=session.getAttribute("em") %></td>
				<td><%=session.getAttribute("ro") %></td>
				<td><%=session.getAttribute("ad") %></td>
			</tr>
			</table>
		</form>
	</div>

</body>
</html>