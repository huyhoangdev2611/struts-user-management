<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>

<html>
<head>
<title>Create User</title>
</head>
<body>
	<h2>Create New User</h2>

	<html:form action="user.do?method=create" method="post">
		<p>
			Name:
			<html:text property="name" />
		</p>
		<p>
			Email:
			<html:text property="email" />
		</p>
		<p>
			<html:submit value="Add User" />
		</p>
	</html:form>

	<br>
	<a href="user.do?method=list">View User List</a>
</body>
</html>
