<jsp:include page="Header.jsp"/>
	<form action="UpdateServlet" method="post">
		<label>Name :</label>
		<input type="text" name="empname" value=<%= session.getAttribute("userName")%>><br/>
		<label>Contact :</label>
		<input type="text" name="contact" value=<%= session.getAttribute("userContact") %>><br/>
		<label>Qualification :</label>
		<input type="text" name="Qualification" value=<%= session.getAttribute("userQualification") %>><br/>
		<input type="submit" value="update">
	</form>

</body>
</html>