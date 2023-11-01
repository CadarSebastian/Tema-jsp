<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>LaptopBrand</title>
</head>
<body>
<form action="" method="post">
 <input type="text" name="brand"/>
<input type="submit" value="Display"/>
</form>
Laptop: ${brand}   
<br>
Length:
<br>
<%= ((String)request.getAttribute("brand")).length() %>

<% 
    int brandLength = ((String)request.getAttribute("brand")).length();
    String parity = (brandLength % 2 == 0) ? "even" : "odd";
    %><br>
     <%= parity %>.

</body>
</html>