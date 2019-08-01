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
				<td>${i}</td>
				<td>${na}</td>
				<td>${gen}</td>
				<td>${q}</td>
				<td>${co}</td>
				<td>${em}</td>
				<td>${ro}</td>
			</tr>
			</table>
		</form>
	</div>

</body>
</html>