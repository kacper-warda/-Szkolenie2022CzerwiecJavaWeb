<%--
  Created by IntelliJ IDEA.
  User: Kacper
  Date: 08.06.2022
  Time: 18:50
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title></title>
    <meta name="layout" content="main"/>
</head>

<body>
Podaj dane nowego samochodu:

<g:form name="myForm" url="[controller: 'fuelUsage', action: 'saveNewCar']">
    <label>Producent:</label> <g:textField name="producer"/><br/>
    <label>Model:</label> <g:textField name="model"/><br/>
    <label>Rodzaj paliwa:</label> <g:textField name="fuelType"/><br/>
    <label>Pojemność silnika:</label> <g:textField name="engineVolume"/><br/>
    <label>Zużycie paliwa:</label> <g:textField name="fuelConsumption"/><br/>
    <g:submitButton name="Zapisz">Zapisz</g:submitButton>
</g:form>

</body>
</html>