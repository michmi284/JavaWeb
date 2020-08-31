<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/8/31
  Time: 11:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="d" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>forEach标签</title>
</head>
<body>
<%--
begin 开始
end 结束
var 临时变量
step 步长
varStatus : 容器中元素的索引
index : 容器中元素的索引
count : 循环次数
items : 容器对象
--%>
<d:forEach begin="0" end="10" var="i" step="1" varStatus="s">
    ${i}
    <h3>${s.index}</h3>
    <h4>${s.count}</h4>
</d:forEach>
<hr>
<%
    ArrayList<String> list = new ArrayList<>();
    list.add("LY");
    list.add("KDY");
    request.setAttribute("list", list);
//    for (String str :
//            list)
//    {
//
//    }
%>
<d:forEach items="${list}" var="str" varStatus="s">
    ${s.index} ---- ${s.count} ${str}
    <br>
</d:forEach>

</body>
</html>
