<jsp:include page="Header.jsp"/>
	<h3>Welcome ${userName} </h3>
	
	<br/>
	<form>
		<table>
			<tr>
				<td>house no.</td>
				<td>${x.houseNo} </td>
			</tr>
			<tr>
				<td>locality</td>
				<td>${x.locality} </td>
			</tr>
			<tr>
				<td>city</td>
				<td>${x.city} </td>
			</tr>
			<tr>
				<td>state</td>
				<td>${x.state} </td>
			</tr>
			<tr>
				<td>Pincode</td>
				<td>${x.pincode} </td>
			</tr>
			<tr><td><a href="UpdateAddr.jsp">Update</a></td></tr>
		</table>
	</form>
</body>
</html>