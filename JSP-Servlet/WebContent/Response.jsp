<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>

<jsp:useBean id = "PersonBean" class = "studyHard.PersonBean" scope="session"/>
<jsp:setProperty name = "PersonBean" property = "*"/>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Result</title>
</head>
<body>
	<center><h3>Result!</h3></center>
<!--		
	<%  String name = request.getParameter("name");
		String nickname = request.getParameter("nickname");
		int age = 0;
		
		if(request.getParameter("name").equalsIgnoreCase("James Gosling")) age = 49; 
		else if(request.getParameter("name").equalsIgnoreCase("Grady Booch")) age = 50;		
	%>	
	
	<%=name%> (<%=nickname%>)은 <%=age%>세 입니다.	
	</center>
-->

 	<div style="margin-left:860px;">NAME : <jsp:getProperty name = "PersonBean" property = "name"/><br></div>
 	<div style="margin-left:860px;">NICKNAME : <jsp:getProperty name = "PersonBean" property = "nickname"/><br></div>
 	<div style="margin-left:860px;">AGE : <jsp:getProperty name = "PersonBean" property = "age"/><br></div>

</body>
</html>