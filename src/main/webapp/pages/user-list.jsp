<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>

<html>
<head>
<title>User List</title>
</head>
<body>
	<h2>List of Users</h2>

	<table border="1">
		<tr>
			<th>ID</th>
			<th>Name</th>
			<th>Email</th>
		</tr>

		<logic:present name="userList">
			<logic:iterate id="user" name="userList">
				<tr>
					<td><bean:write name="user" property="id" /></td>
					<td><bean:write name="user" property="name" /></td>
					<td><bean:write name="user" property="email" /></td>
				</tr>
			</logic:iterate>
		</logic:present>

		<logic:notPresent name="userList">
			<tr>
				<td colspan="3">No users found.</td>
			</tr>
		</logic:notPresent>
	</table>

	<br>
	<a href="user.do?method=create">Create New User</a>
</body>
</html>
