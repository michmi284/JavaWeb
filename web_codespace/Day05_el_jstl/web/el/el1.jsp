<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/8/31
  Time: 8:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="top.jsp" %>
>
<html>
<head>
    <title>Title</title>
</head>
<body>
lynb
<br>
${3>4}
<br>
\${3>4}
<br>
<h3>算术运算符</h3>
${3+4}
${3*4}
${3/4}
${3%4}
${3 mod 4}
<h3>比较运算符</h3>
${3==4}
${3 < 4}
<h3>逻辑运算符</h3>
${3>4 && 3<4}
${3>4 and 3<4}
<h3>empty运算符</h3>
<%
    String str = "";
    request.setAttribute("str", str);
    List<Object> list = new ArrayList<>();
    list.add("lynb");
    request.setAttribute("list", list);
%>
<%--${empty}--%>
${empty str}
${empty list}
${not empty str}
${not empty list}

</body>
</html>
