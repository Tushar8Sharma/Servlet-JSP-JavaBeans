<jsp:include page="Header.jsp"/>
	
	<h3>Welcome ${"userName"}</h3>
		<form action="AllEmployee" method="post">
			<label>Enter your password for verification :</label>
			<input type="password" name="pa"><br/>
			<input type="submit" value="verify">
		</form>
	</div>
</body>
</html>