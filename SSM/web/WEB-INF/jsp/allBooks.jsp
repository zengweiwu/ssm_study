<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/9/26
  Time: 19:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>全部书籍列表</title>
    <%--引入boodstrap--%>
    <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">
    <div class="row">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>全部书籍列表——————————显示所有书籍</small>
                </h1>
            </div>
        </div>
    </div>

    <%--跳转到新增书籍--%>
    <div class="row">
        <div class="col-md-3">
            <a class="btn btn-default" href="${pageContext.request.contextPath}/books/toaddBook" role="button">添加书籍</a>
        </div>
    </div>
    <%--展示书籍--%>
    <div class="row clearfix">
        <table class="table table-hover table-striped table-bordered">
            <thead>
            <tr>
                <th>书籍编号</th>
                <th>书籍名称</th>
                <th>书籍数量</th>
                <th>书籍详情</th>
                <th>操作</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach var="book" items="${books}">
                <tr>
                    <td>${book.bookID}</td>
                    <td>${book.bookName}</td>
                    <td>${book.bookCounts}</td>
                    <td>${book.detail}</td>
                    <td>
                        <a class="btn btn-default"
                           href="${pageContext.request.contextPath}/books/toUpdate?bookId=${book.bookID}" role="button">修改</a>
                        &nbsp; | &nbsp;<a class="btn btn-default"
                                          href="${pageContext.request.contextPath}/books/deleteBook?bookId=${book.bookID}"
                                          role="button">删除</a>
                    </td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
</div>

</body>
</html>
