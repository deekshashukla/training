<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" errorPage="errpage.jsp"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>

<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<body>
<jsp:useBean id="item" class="lti.bean.ProductBean" scope="session"/>
<jsp:setProperty property="*" name="item"/>

<sql:update dataSource="jdbc/myoracle">
insert into products values (${item.code},'${item.name}',${item.price})
</sql:update>


<%-- <jsp:setProperty property="code" name="item"/>

<jsp:setProperty property="name" name="item"/>
<jsp:setProperty property="price" name="item"/>
 --%>
<%-- <jsp:forward page="output.jsp"/> --%>

<% response.sendRedirect("output.jsp"); %>

</body>
</html>