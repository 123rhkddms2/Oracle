<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>user6::register</title>
</head>
<body>
<h3>user6 등록</h3>
<a href="/">메인</a>
<a href="/user6/list">목록</a>
<form action="/user6/register" method="post">
    <table border="1">
        <tr style="display: none;">
            <td>순번</td>
            <td><input type="number" name="seq"></td>
        </tr>
        <tr>
            <td>이름</td>
            <td><input type="text" name="name"></td>
        </tr>
        <tr>
            <td>성별</td>
            <td><input type="text" name="gender"></td>
        </tr>
        <tr>
            <td>나이</td>
            <td><input type="number" name="age"></td>
        </tr>
        <tr>
            <td>주소</td>
            <td><input type="text" name="addr"></td>
        </tr>
        <tr>
            <td colspan="2" align="right"><input type="submit" value="등록"></td>
        </tr>
    </table>

</form>
</body>
</html>