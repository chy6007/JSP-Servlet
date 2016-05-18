<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
		
	<h3> 20160519 과제 : JavaBean 적용해보기 </h3>
	<h4> ★ Request ★ </h4><br/>
	<form name=form1 action="ljh/ServletController" method=post>
		<input type="text" name="name" placeholder="name" width="300" size="10">
		<input type="text" name="nickname" placeholder="nickname" width="300" size="10">
		<input type="submit" value="submit" name="button"> 	
	</form>
	
</body>
</html>