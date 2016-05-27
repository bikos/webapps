<html>
<head>
<title>Welcome to Spring Development with JSP</title>
<style type="text/css">
body {
	background-image: url('http://crunchify.com/bg.png');
}
</style>
</head>
<body>
<form action="/login" method="post" >
Username : <input name="username" type="text" />
Password : <input name="password" type="password" />

<input type="submit" />
<%
  String str1=request.getParameter("username");
  String str2=request.getParameter("password");
 
  if(str1.equalsIgnoreCase("admin") && str2.equals("123"))
  {
    out.println("<h3>Thankyou, you are VALID</h3>"); 
       
  }
  else
  {
    out.println("<h3>Sorry, you are INVALID</h3>");    
  }
%>



</form>
</body>
</html>