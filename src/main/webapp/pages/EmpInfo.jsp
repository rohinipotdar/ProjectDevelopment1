<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Registration</title>
</head>
<body>
	<h2>Employee Information</h2>

	<form action="saveEmployee" method="post">
		<table>

			<tr>
				<td>Employee Name :</td>
				<td><input type="text" name="ename"></td>
			</tr>

			<tr>
				<td>Employee Address :</td>
				<td><input type="text" name="eadd"></td>
			</tr>

			<tr>
				<td>Employee Designation :</td>
				<td><input type="text" name="edesig"></td>
			</tr>

			<tr>
				<td>Employee salary :</td>
				<td><input type="number" name="salary"></td>
			</tr>

			<tr>
				<td>Employee Email :</td>
				<td><input type="text" name="email"></td>
			</tr>

			<tr>
				<td><input type="submit" name="Submit"></td>
			</tr>
		</table>
	</form>

</body>
</html>