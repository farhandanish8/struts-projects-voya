<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

welcome <br>
<s:property value="student.name"></s:property><br>
<s:property value="student.city"></s:property><br>
<s:property value="student.email"></s:property><br>
<s:property value="student.age"></s:property><br>
<s:property value="student.stipend"></s:property><br>
<s:property value="student.course"></s:property><br>
<s:property value="student.hobby"></s:property><br>
<s:property value="student.gender"></s:property><br>
</body>
</html>