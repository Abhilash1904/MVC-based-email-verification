<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
	<title>Employee Validation form - Input Form</title>
</head>

<body>
<!-- 
	<form action="employeeProcessForm" method="GET">
	
		Name<input type="text" name="employeeName"
			placeholder="What's your name?" />
			<br>
		Email<input type="text" name="employeeEmailAdress"
			placeholder="enter email address" />
			<br>
			Re-enter Email<input type="text" name="reenteredAddress"
			placeholder="re-enter email address" />
			<br>
			
		<input type="submit" />
			
	</form>
 -->
 
 employee form
 
 	 	<form:form action="employeeProcessForm" modelAttribute="employee">
	
		Name: <form:input path="name" />
		
		<br><br>
	
		Email: <form:input path="email" />
		
		<br><br>
		
		Re-enter Email: <form:input path="re_email" />
		
		<br><br>
		
		<input type="submit" value="Submit" />
	
	</form:form>

</body>

</html>