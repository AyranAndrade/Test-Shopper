<html>
    <head>
        <title>Edit Customer ${customer.name}</title>
    </head>
    <body>
        <form action="/customer/edit/${customer.id}" method="post">
            <%@ include file="form.jsp" %>
            <!-- Eu usei o include, pois a página que eu vou incluir é estática.
            Para mais informações, veja 
            http://stackoverflow.com/questions/14580120/whats-the-difference-between-including-files-with-jsp-include-directive-jsp-in#answer-14763794
            -->
            <input type="submit" value="Edit"/>
        </form>
    </body>
</html>