<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String base = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort();
	String basePath = base + request.getContextPath() + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" ></script>
<script type="text/javascript" src="./js/jquery-1.8.2.js"></script>

<title>Insert title here</title>
<script type="text/javascript">
 function loginDo (){
	$.ajax({
        cache: true,
        type: "POST",
        url:$("#url").val(),
        data:$('#formId').serialize(),// formid
        async: false,
        error: function(request) {
            alert("网络错误！");
        },
        success: function(data) {
            alert(data)
        }
    });
} 

</script>
</head>
<body>
<form id="formId" name="formId" action="" method="post">
<input type="hidden" id="url" value="<%=basePath %>user/login.do">
登录名：<input type="text" name="username" id="username" ><br>
密码：<input type="text" name="password" id="password" ><br>
<input type="button" onclick="loginDo();"  value="登录">
</form>
</body>
</html>