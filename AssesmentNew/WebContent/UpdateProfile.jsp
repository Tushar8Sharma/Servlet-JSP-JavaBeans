<jsp:include page="Header.jsp"/>
	<form action="UpdateServlet" method="post">
		<label>Name :</label>
		<input type="text" name="empname" value=${userName}><br/>
		<label>Contact :</label>
		<input type="text" name="contact" value=${userContact}><br/>
		<label>Qualification :</label>
		<input type="text" name="Qualification" value=${userQualification}><br/>
		<input type="submit" value="update">
	</form>

</body>
</html>