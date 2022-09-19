<%--
    Document   : MiPrimer.jsp
    Created on : 19/08/2022, 08:24:58 PM
    Author     : ricardopresilla@gmail.com
    Version    : 1.0
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<%@taglib prefix="x" uri="http://java.sun.com/jstl/xml" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
<%@taglib prefix="sql" uri="http://java.sun.com/jstl/sql" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>Mi JSP de ejemplo</title>
    </head>
    <body>
        <h1>Ejemplos de JSP.</h1>
        out.println("<div class=\"col-sx-10 col-sm-10 col-lg-10 col-xg-10\">");
            out.println("<div class=\"container-fluid\">");
            out.println("<div class=\"col-sx-12 col-sm-12 col-lg-12 col-xg-12\">");
            out.println("<a href="/ServletEjemplo/ejemplo">Ir al ejemplo</a>");
            out.println("</div>");
            out.println("</div>");
        out.println("</div>");
        ${ "<p>Esto es una expresión del lenguaje.</p>" }
        <c:out value="Utilizando JSTL" /><br>

        <div>
            <h2>Expresiones</h2>
            <%= request.getContextPath() %>
        </div>
    </body>
</html>