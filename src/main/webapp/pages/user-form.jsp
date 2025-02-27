<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>

<html>
<head><title>Create User</title></head>
<body>
    <h2>Create New User</h2>

    <html:form action="createUser.do">
        <p>Name: <html:text property="name" /></p>
        <p>Email: <html:text property="email" /></p>
        <p><html:submit value="Add User"/></p>
    </html:form>
</body>
</html>
