<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <% request.setCharacterEncoding("UTF-8"); %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Servlet & JSP</title>
</head>
<body>
	<h3>20160518 Servlet & JSP 과제</h3>	
	<form name=form1 action="studyHard/controller" method=post>
		<input type="text" name="name" placeholder="name" width="200" size="6" >
		<input type="text" name="nickname" placeholder="nickname" width="200" size="6">
		<input type="submit" value="submit" name="button">
	</form>


</body>
</html>

