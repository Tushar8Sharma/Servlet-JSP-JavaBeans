<jsp:include page="Header.jsp"/>
	<h3>Welcome <%=session.getAttribute("userName") %></h3>
	<form action="ChangePassword" method="post">
		<label>Enter current password :</label>
		<input type="password" name="pa"><br/>
		<label>Enter new password :</label>
		<input type="password" name="pas"><br/>
		<label>Confirm password :</label>
		<input type="password" name="pass"><br/>
		<input type="submit" value="change">
	</form>

</body>
</html>