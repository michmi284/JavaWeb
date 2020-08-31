<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/8/31
  Time: 11:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>if标签</title>
</head>
<body>
<%--c:if
1.属性 test 必须属性，接受的是boolean表达式
一般 test 配合 el 表达式一起使用
 2、 没有 else 部分， 想要的话需要再定义一个 c:if
--%>
<c:if test="false">
    <h1>LYNB</h1>
</c:if>
<%
    ArrayList<Object> list = new ArrayList<>();
    list.add("aaaaa");
    request.setAttribute("list", list);
    request.setAttribute("number", 5);
%>
<c:if test="${not empty requestScope.list}">
    <h2>遍历集合</h2>
</c:if>
<br>
<c:if test="${number % 2 != 0}">
    <h2>${number}为奇数</h2>
</c:if><c:if test="${number % 2 == 0}">
    <h2>${number}为偶数</h2>
</c:if>
</body>
</html>
