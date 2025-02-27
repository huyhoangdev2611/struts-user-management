<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>

<html>
<head>
    <title>Success</title>
</head>
<body>
    <h2>Success</h2>

    <p><bean:write name="message" ignore="true" /></p>

    <a href="listUsers.do">View User List</a> |
    <a href="pages/user-form.jsp">Create Another User</a>
</body>
</html>
