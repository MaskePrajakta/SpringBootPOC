<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Success</title>
</head>
<script type="text/javascript">
	function edit() {
		document.success.action = "ed";
		document.success.submit();
	}
	function dele() {
		
		document.success.action = "dl"
		document.success.submit();
	}
	function add() {
		document.success.action ="register";
		document.success.submit();
	}
</script>

<body bgcolor="pink">
	<div align="center">
	<h3>SUCCESS PAGE</h3>
	<h3 style="color: blue">${msg}</h3>
		<form name="success">
			<table border="1">
				<tr>
					<td>Select</td>
					<td>id</td>
					<td>name</td>
					<td>surname</td>
					<td>addr</td>
					<td>pincode</td>
					<td>un</td>
					<td>pw</td>
					<td>dob</td>
					<td>joiningDate</td>
				</tr>
				<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
				<c:forEach items="${data}" var="u">
					<tr>
						<td><input type="radio" name="id" value="${u.id}"></td>
						<td><c:out value="${u.id}" /></td>
						<td><c:out value="${u.name}" /></td>
						<td><c:out value="${u.surname}" /></td>
						<td><c:out value="${u.addr}" /></td>
						<td><c:out value="${u.pincode}" /></td>
						<td><c:out value="${u.un}" /></td>
						<td><c:out value="${u.pw}" /></td>
						<td><c:out value="${u.dob}" /></td>
						<td><c:out value="${u.joiningDate}" /></td>
					</tr>
				</c:forEach>
			</table>
			<br> 
			<input type="button" value="edit" onclick="edit()">
			<input type="button" value="delete" onclick="dele()"> 
			<input type="button" value="add" onclick="add()">
		</form>
	</div>
</body>

</html>