<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
 <script src="http://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>
 <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
 <script src="main.js"></script>
 <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
<title>My board</title>
</head>
<body>
	<div>
    <form id="boardForm" name="boardForm" method="post">
        <table>
            <thead>
                <tr>
                    <th>Number</th>
                    <th>Title</th>
                    <th>Writer</th>
                    <th>Date</th>
                    <th>Hit</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="result" items="${list }" varStatus="status">
                    <tr>
                        <td><c:out value="${result.code }"/></td>
                        <td><a href='#' onClick='fn_view(${result.code})'><c:out value="${result.title }"/></a></td>
                        <td><c:out value="${result.writer }"/></td>
                        <td><c:out value="${result.reg_datetime }"/></td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
        
        <div>            
            <a href='#' onClick='fn_write()'>글쓰기</a>            
        </div>
    </form>
    </div>
</body>
</html>