<jsp:include page="Header.jsp"/>
	
	<h3><a href="LoginForm.jsp">Login Here</a></h3>
	
	</div>
	<form action="RegisterServlet" method="post">
		<label>Enter the name :</label>
		<input type="text" name="name" required><br/>
		<label>Enter the Gender :</label>
		<input type="text" name="gender" required><br/>
		<label>Enter the Qualification :</label>
		<input type="text" name="qual" required><br/>
		<label>Enter the contact no. :</label>
		<input type="number" name="con" maxLength=10 required><br/>
		<label>Enter the email :</label>
		<input type="text" name="email" required><br/>
		<label>Enter the role :</label>
		<input type="text" name="role" required><br/>
		<label>Enter the password :</label>
		<input type="text" name="pass" required><br/>
		<input type="submit" value="register">
	</form>

</body>
</html>