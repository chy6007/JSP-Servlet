<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <% request.setCharacterEncoding("UTF-8"); %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JDBC를 이용한 DB연동</title>
</head>
<body>
	<center><h3>JDBC를 이용한 DB연동</h3>	
	<form name=form2 action="studyHard/controller" method=post>
		<input type="text" name="name" placeholder="Name" width="2000" size="7" ><br />
		<input type="text" name="nickname" placeholder="Nickname" width="2000" size="7"><br /><br />
		<input type="submit" value="Submit" name="button">
	</form>
</center>
</body>
</html>

