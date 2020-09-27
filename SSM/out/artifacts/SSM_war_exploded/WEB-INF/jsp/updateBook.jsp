<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/9/27
  Time: 10:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>增加书籍</title>
    <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">
    <div class="row">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>更新书籍</small>
                </h1>
            </div>
        </div>
    </div>
    <%--新增书籍列表--%>
    <form action="${pageContext.request.contextPath}/books/updateBook" >
        <div style="display: none">
            <input name="bookID" value="${Qbook.bookID}">
        </div>
        <div class="form-group">
            <label for="bookName">书籍名称</label>
            <input name="bookName" type="text" class="form-control" id="bookName" value="${Qbook.bookName}" required>
        </div>
        <div class="form-group">
            <label for="bookCount">书籍数量</label>
            <input name="bookCounts" type="text" class="form-control" id="bookCount" value="${Qbook.bookCounts}" required>
        </div>
        <div class="form-group">
            <label for="bookDetail">书籍详情</label>
            <input name="detail" type="text" class="form-control" id="bookDetail" value="${Qbook.detail}" required>
        </div>
        <button type="submit" class="btn btn-default">修改</button>
    </form>
</div>
</body>
</html>
