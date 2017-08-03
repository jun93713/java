<%--
  Created by IntelliJ IDEA.
  User: jun
  Date: 8/3/17
  Time: 12:08 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Checkerboard</title>
    <link rel="stylesheet" type="text/css" href="style.css">
  </head>
  <body>

  <% Integer width = Integer.parseInt(request.getParameter("width")); %>
  <% Integer height = Integer.parseInt(request.getParameter("height")); %>

  <h1>Checkerboard: <%=width%>w X <%=height%>h </h1>

  <div>
  <% for (int i = 0; i < height; i ++){ %>
    <div>
    <% for (int j = 0; j < width; j ++){ %>
      <% if ((i + j) % 2 == 0) {%>
        <div class="pink"></div>
      <% } %>
      <% if ((i + j) % 2 == 1) { %>
        <div class="blue"></div>
      <% } %>
    <% } %>
    </div>
  <% } %>
  </div>
  </body>
</html>
