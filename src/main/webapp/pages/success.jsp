<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>

<html>
<head>
<title>Success</title>
</head>
<body>
	<h2>Success</h2>

	<p>
		<bean:write name="message" ignore="true" />
	</p>

	<a href="user.do?method=list">View User List</a> |
	<a href="user.do?method=create">Create Another User</a>
</body>
</html>
