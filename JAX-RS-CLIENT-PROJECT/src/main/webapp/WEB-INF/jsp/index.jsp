<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<h3>Hello RestClient!</h3>
<a href="${pageContext.request.contextPath}/employee/all">Все Employees</a>

<c:if test="${not empty employees}">
    <table style="width: 600px;">
        <thead style="background: #fc0">
            <tr>
                <th>п/п</th>
                <th>Фамилия</th>
                <th>Имя</th>
                <th>Отчество</th>
            </tr>
        </thead>
        <tbody style="background: #ccc">
            <c:forEach items="${employees}" var="employee" varStatus="status">
                <tr>
                    <td>${status.index + 1}</td>
                    <td>${employee.secondName}</td>
                    <td>${employee.firstName}</td>
                    <td>${employee.middleName}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</c:if>
