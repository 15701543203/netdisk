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
<script type="text/javascript" src="./js/jquery-1.8.2.js"></script>

<script type="text/javascript">
//注册操作  
function registerDo (){
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
<title>regist</title>
</head>
<body>
<form id="formId" name="formId" >
        <input type="hidden" id="url" value="<%=basePath %>user/regist.do"> 
		用户名：<input type="text" name="username"><br>
		密码：<input type="password" name="password"><br>
		确认密码：<br>
		邮箱：<input type="text" name="mail"><br>
		电话：<input type="text" name="number">
        <input type="button" onclick="registerDo();"  value="注册">

</form>
</body>
</html>