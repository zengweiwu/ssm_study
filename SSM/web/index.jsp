<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/9/26
  Time: 13:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>首页</title>
    <style>
        a {
            text-decoration: none;
        }

        div {
            height: 45px;
            width: 250px;
            margin: 200px auto;
            text-align: center;
            background: cadetblue;
            border-radius: 5px;
        }

    </style>
</head>
<body>
<div>
    <h1><a href="${pageContext.request.contextPath}/books/queryAll">查询全部书籍</a></h1>
</div>
</body>
</html>
