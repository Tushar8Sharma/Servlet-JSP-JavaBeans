<jsp:include page="Header.jsp"/>

	<h3>Welcome ${userName}</h3>
	
	<br/>
	<form action="AddAddresss" method="post">
		<table>
			<tr>
				<td>House no. :</td>
				<td><input type="text" name="h" required></td>
			</tr>
			<tr>
				<td>Locality :</td>
				<td><input type="text" name="l" required></td>
			</tr>
			<tr>
				<td>city :</td>
				<td><input type="text" name="c" required></td>
			</tr>
			<tr>
				<td>state :</td>
				<td><input type="text" name="s" required></td>
			</tr>
			<tr>
				<td>pincode :</td>
				<td><input type="text" name="p" required></td>
			</tr>
			<tr>
				<td><input type="submit" value="add"></td>
			</tr>
		</table>
	</form>

</body>
</html>