<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<html>
    <head>
        <title>New Customer</title>
    </head>
    <body>
        <form action="/customer" method="post">
            <%@ include file="form.jsp" %>
            <!-- Eu usei o include, pois a página que eu vou incluir é estática.
            Para mais informações, veja 
            http://stackoverflow.com/questions/14580120/whats-the-difference-between-including-files-with-jsp-include-directive-jsp-in#answer-14763794
            -->
            <input type="submit" value="Create"/>
        </form>
    </body>
</html>