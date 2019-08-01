<jsp:include page="Header.jsp"/>
	<h3>Welcome ${userName}</h3>
	<form action="ChangePassword" method="post">
		<label>Enter current password :</label>
		<input type="password" name="pa" required><br/>
		<label>Enter new password :</label>
		<input type="password" name="pas" required><br/>
		<label>Confirm password :</label>
		<input type="password" name="pass" required><br/>
		<input type="submit" value="change">
	</form>

</body>
</html>