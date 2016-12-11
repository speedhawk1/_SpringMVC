<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/12/4
  Time: 13:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="common/inc.jsp"%>
<html>
<head>
    <title>home page</title>
    <script>
        function del() {
            return confirm("REMOVE?");
        }
    </script>
</head>
<body>
<c:if test="${sessionScope.user eq null}">
    <c:redirect url="${ctx}/index.jsp"/>
</c:if>
<h1>home page</h1>
${sessionScope.user.username}
<hr>
<a href="${ctx}/user/logout">LOGOUT</a>
<hr>
<form action="${ctx}/book/create" method="post">
    <input type="text" name="title" placeholder="TITLE"><br>
    <input type="submit" value="ADD">
</form>
<hr>
<table border="1">
    <tr>
        <th>NO</th>
        <th>TITLE</th>
        <th colspan="2">OPERATION</th>
    </tr>
    <c:forEach var="book" items="${sessionScope.books}" varStatus="vs">
        <tr>
            <td>${vs.count}</td>
            <td>${book.title}</td>
            <td><a href="${ctx}/book/search/${book.id}">MODIFY</a></td>
            <td><a href="${ctx}/book/remove/${book.id}" onclick="return del()">REMOVE</a></td>
        </tr>
    </c:forEach>
</table>
<hr>
<ul>
    <c:forEach var="user" items="${sessionScope.users}">
        <li>${user.username}</li>
    </c:forEach>
</ul>
</body>
</html>