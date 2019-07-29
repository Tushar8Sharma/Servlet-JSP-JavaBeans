<jsp:include page="Header.jsp"/>

	<h3>Welcome <%=session.getAttribute("userName") %></h3>
	
	<br/>
	<form action="AddAddress" method = "post">
		<label>Enter your Address :</label>
		<input type="text" name="a"/><br/>
		<input type="submit" value="add it"/>
	</form>
	</div>
</body>
</html>