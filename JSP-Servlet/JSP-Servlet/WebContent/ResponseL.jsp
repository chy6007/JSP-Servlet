<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>

<%@ page import = "ljh.PersonBean" %>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<h3> 20160519 과제 : JavaBean 적용해보기 </h3>
	<h4> ★ Response ★ </h4><br/>
	
	<% PersonBean p = (PersonBean)request.getAttribute("person"); %>
	<%= p.getName() %>( <%= p.getNickname() %> )은 <%= p.getAge() %>세입니다.
	
	
	<%--
	
	<h3>20160518 Servlet & JSP 과제 결과물</h3>
	
	<% 
		String name = request.getParameter("name");
		String nickname = request.getParameter("nickname");
		int age = 0;
		
		if(request.getParameter("name").equalsIgnoreCase("James Gosling")){
			age = 49;
		} 
		else if(request.getParameter("name").equalsIgnoreCase("Grady Booch")){
			age = 50;
		}
	%> 
	 
	<%=name%> ( <%=nickname%> ) 은 <%=age%> 세 입니다.
	
	--%>
	
</body>
</html>