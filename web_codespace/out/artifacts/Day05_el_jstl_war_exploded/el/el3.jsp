<%@ page import="com.michmi.el.User" %>
<%@ page import="java.util.Date" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.HashMap" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/8/31
  Time: 9:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    User user = new User();
    user.setName("LY");
    user.setAge(23);
    user.setBirthday(new Date());
    request.setAttribute("u", user);
    List<Object> list = new ArrayList<>();
    list.add("aaa");
    list.add("bbb");
    list.add(user);
    request.setAttribute("list", list);

    HashMap<String, Object> map = new HashMap<>();
    map.put("name", "LY");
    map.put("gender", "男");
    map.put("user", user);
    request.setAttribute("map", map);
%>
<h1>el获取对象中的值</h1>
${requestScope.u}<br>
<%--
对象 属性 获取
setter 或者 getter 方法 去掉 set 和 get
将 剩余部分 首字母 变为 小写
getName() --> Name --> name
--%>
${requestScope.u.name}<br>
${u.age}<br>
${u.birthday}<br>
<h3>获取list值</h3>
${requestScope.list}
${list[0]}
${list[1]}
${list[2].name}
<h5>list[10]</h5>
${list[10]}
<h3>获取map值</h3>
${requestScope.map}
${map.gender}
${map["gender"]}
${map.user}
${map.user.name}

</body>
</html>
