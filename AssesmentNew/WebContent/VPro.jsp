<jsp:include page="Header.jsp"/>
	<h3>Welcome ${userName} </h3>
	
	<br/>
	
	<table>
		<tr>
			<td><label>Your id : ${userId} </label></td>
		</tr>
		<tr>
			<td><label>Your Gender : ${userIduserGender}</label></td>
		</tr>
		<tr>
			<td><label>Your Qualification : ${userQualification}</label></td>
		</tr>
		<tr>
			<td><label>Your Contact no. : ${userObj.getContactNo()}</label></td>
		</tr>
		<tr>
			<td><label>Your Email address : ${userAddress}</label></td>
		</tr>
		<tr>
			<td><label>Your role : ${userRole}</label></td>
		</tr>
	</table>

</body>
</html>