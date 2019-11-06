<html>
<head>
    <title>spring boot</title>
</head>
<body>
<table border="1px">
    <thead>
    <!--tr>th*4-->
    <tr>
        <th>id</th>
        <th>姓名</th>
    </tr>
    </thead>
    <tbody>
            <#list list as stu>
            <tr>
                <td>${stu.id}</td>
                <td>${stu.name}</td>
            </tr>
            </#list>
    </tbody>
</table>
</body>
</html>