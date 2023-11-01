<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>LaptopBrand</title>
</head>
<body>
Brand name is 
${brand}<br> Number of caracters is 
<%= ((String)request.getAttribute("brand")).length() %>

<% 
    int brandLength = ((String)request.getAttribute("brand")).length();
    String parity = (brandLength % 2 == 0) ? "even" : "odd";
    %><br>
     <%= parity %>.
    
</body>
</html>