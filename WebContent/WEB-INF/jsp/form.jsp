<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
String elder = request.getParameter("age1");
String younger = request.getParameter("age2");
boolean first = false;
int totalage = 0;
String message = "";
if (elder == null) {
        first = true;
        message = "Your results will appear here";
} else {
        try {
                int fred = Integer.parseInt(elder);
                int doris = Integer.parseInt(younger);
                totalage = fred + doris;
        } catch (Exception e) {
                message = "You must enter two Integers";
                first = true;
        }
}
// -------------------------------------------------------
%>
<html>
<head><title>Example for first JSP Practical</title></head>
<body><h1>JSP is like a Jumbo Jet Driver</h1>
Because the smallest of operators can do a mighty lot<hr>
<% if (! first) { %>
Inputs were <%= elder %> and <%= younger %><br>
The total age of the kids is <%= totalage %>
<% } else { %>
<%= message %>
<% } %>
<hr>
<form>Please enter age 1 <input name=age1> and
age 2 <input name=age2> and <input type=submit></form>
Copyright ....
</body>
</html>