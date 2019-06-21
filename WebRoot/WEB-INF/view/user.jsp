<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
  <head>
    <title>User</title>
  <body>
    <div >
     <div><span>id:<c:out value="${user.id}" /></span></div>
     <div><span>username:<c:out value="${user.username}" /></span></div>
     <div><span>password:<c:out value="${user.password}" /></span></div>
     <div><span>sex:<c:out value="${user.sex}" /></span></div>
     <div><span>tele:<c:out value="${user.tele}" /></span></div>
     <div><span>qq:<c:out value="${user.qq}" /></span></div>
     <div><span>enabled:<c:out value="${user.enabled}" /></span></div>
     <div><span>authority:<c:out value="${user.authority}" /></span></div>
    </div>
  </body>
</html>