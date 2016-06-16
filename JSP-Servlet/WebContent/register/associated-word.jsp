<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <% request.setCharacterEncoding("UTF-8"); %>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Associated Word</title>
</head>
<body>		
	<center><h3>Input Name &amp; Associated Word </h3>	
	<form name="form1" action="<c:url value="/register/studyHard/transactioncontroller"/>" method="post">
		<input type="text" name="name" placeholder="Name" width="10000" size="17"><br />
		<input type="text" name="word1" placeholder="Word1" width="10000" size="17"><br />
		<input type="text" name="word2" placeholder="Word2" width="10000" size="17"><br /><br />
		<input type="submit" value="Submit" >
	</form>
	</center>	
</body>
</html>