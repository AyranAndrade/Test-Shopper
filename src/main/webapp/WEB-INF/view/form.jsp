<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<table>
    <tbody>
        <tr>
            <td>
                <label for="name">Name:</label>
            </td>
            <td>
                <input type="text" name="name" id="name" 
                       value="${customer.name}" 
                       maxlength="60" required="true"/>
            </td>
            <td>
                <form:errors path="customer.name" cssStyle="color:red"/>
            </td>
        </tr>
        <tr>
            <td>
                <label for="age">Age:</label>
            </td>
            <td>
                <input type="number" max="100" min="12" name="age" 
                       id="age" value="${customer.age}"
                       required="true"/>
            </td>
            <td>
                <form:errors path="customer.age" cssStyle="color:red"/>
            </td>
        </tr>
        <tr>
            <td>
                <label for="rg">RG:</label>
            </td>
            <td>
                <input type="text" name="rg" id="rg" required="true"
                       value="${customer.rg}" maxlength="14"/>
            </td>
            <td>
                <form:errors path="customer.rg" cssStyle="color:red"/>
            </td>
        </tr>
        <tr>
            <td>
                <label for="address">Address:</label>
            </td>
            <td>
                <input type="text" name="address" id="address" 
                       value="${customer.address}"
                       maxlength="100" required="true"/>
            </td>
            <td>
                <form:errors path="customer.address" cssStyle="color:red"/>
            </td>
        </tr>
        <tr>
            <td>
                <label for="cep">CEP:</label>
            </td>
            <td>
                <input type="text" name="cep" id="cep"
                       value="${customer.cep}"
                       maxlength="10" required="true"/>
            </td>
            <td>
                <form:errors path="customer.cep" cssStyle="color:red"/>
            </td>
        </tr>
    </tbody>
</table>