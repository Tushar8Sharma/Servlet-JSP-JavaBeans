<jsp:include page="Header.jsp"/>
	<h3>Welcome ${userName} </h3>
	
	<br/>
	<form action="UpdAddr" method="post">
		<table>
			<tr>
				<td>house number :</td>
				<td><input type="text" name="hn" value="${x.houseNo}"/><td>
			</tr>
			<tr>
				<td>Locality :</td>
				<td><input type="text" name = "lo" value="${x.locality}"/><td>
			</tr>
			<tr>
				<td>city :</td>
				<td><input type="text" name="ci" value="${x.city}"/><td>
			</tr>
			<tr>
				<td>state :</td>
				<td><input type="text" name="st" value="${x.state}"/><td>
			</tr>
			<tr>
				<td>pincode :</td>
				<td><input type="text" name="pi" value="${x.pincode}"/><td>
			</tr>
			<tr>
				<td><input type="submit" value="go"/><td>
			</tr>
		</table>
	</form>
</body>
</html>