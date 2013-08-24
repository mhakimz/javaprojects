<%-- 
    Document   : index
    Created on : Dec 24, 2009, 2:53:12 PM
    Author     : sysadmin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Simple Spring MVC!</title>
    </head>
    <body>
        <h2>Contact Us form</h2>
        <form method="post" action="contact/message">
            Username:
            <input name="userName" type="text"></input> <br>

            Email: <input name="email" type="text"> </input> <br>

            Message: <br><input name="message" type="textarea" maxlength="100" size="100"/> <br>

            <input name="Submit" type="Submit" value="Send">
        </form>
    </body>
</html>
