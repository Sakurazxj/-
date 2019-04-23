<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ taglib prefix="s" uri="/struts-tags" %>

<html style="height:100%;">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<link rel="icon" href="hitcso.ico" type="image/x-icon"/>
<title>欢迎使用教师信息管理系统</title>
<style type="text/css">
html,body{
    margin: 0;
    padding: 0;
    list-style: none;
    position: relative;
    width: 100vw;
    height: 100vh;
}
h4{
    font-family: "华云彩体"; 
    font-size: 18px;
    margin-bottom: 0;
    margin-top: 0;
}
input {
	background:none;  
	outline:none;  
	border:0px;
}
.top-banner {
	position: absolute;
	top: 10px;
	left: 50px;
}
.dht-bottom {
	width: 100%;
	position: fixed;
	left: 0;
	bottom: 20px;
    text-align: center;
    color: #4C4C4C;
}
.login-content {
	position: absolute;
	top: 50%;
	left: 50%;
	transform: translate(-50%, -50%);
	display: flex;
	justify-content: center;
}
	
.login-content-left, .login-content-right{
	border-radius: 8px;
	padding: 20px 15px 0 15px;
   	background-color:rgba(255,245,238,0.5);
}
.login-content-left {
	margin-right: 20px; 
}
.login-content-left ol li {
	margin-bottom: 20px;
}
.input {
	width: 190px;
	height: 25px;
	padding-left: 10px;
	background: rgba(241,241,241,1);
	opacity: 0.7;
	border-radius: 8px;
}
.select {
	margin-left: -4px;
	width: 80px;
	height: 25px;
	padding: 0 10px;
	text-aligh: center;
    border: 0;
    appearance: none;
    -moz-appearance: none;
    -webkit-appearance: none;
    outline: none;
    background: rgba(241,241,241,0.8);
}
.submit-btn input{
	float: right;
	width: 50px;
	height: 30px;
	line-height: 30px;
	border-radius: 8px;
	font-size: 14px;
	background-color:rgba(255,245,238,0.8);
	margin-bottom:10px;
}
/* .submit-btn input:last-child {
	margin-right: 10px;
} */
</style>
<script src="https://apps.bdimg.com/libs/jquery/2.1.4/jquery.min.js"></script>
<script type="text/javascript">
function jump()
{
	document.form1.action = "login_inter.jsp";
	}
function check()
{
	fr = document.form1;
	var city = document.getElementById("color");
	var sun = fr.username.value;
	if(fr.username.value=="")
		{
		alert("用户名不能为空！");
		fr.username.focus();
		return false;
		}
	if(fr.password.value=="")
		{
		alert("密码不能为空！")
		fr.password.focus();
		return false;
		}
	if(color.options[color.selectedIndex].text=="请选择")
		{
		alert("请选择您的角色！");
		fr.color.focus();
		return false;
		}
	/*$.ajax({
        type: "get",//数据发送的方式（post 或者 get）
        url: "http://localhost:8080/Teacher_management__system/hello.action",//要发送的后台地址
        data: {"sun":"1"},//要发送的数据（参数）格式为{'val1':"1","val2":"2"}
        dataType: "json",//后台处理后返回的数据格式
        success: function (data) {//ajax请求成功后触发的方法
           alert('请求成功');
        },
        error: function (msg) {//ajax请求失败后触发的方法
            alert('错误');//弹出错误信息
        }
    });
	//fr.submit();*/
	}
</script>
</head>
<body class="img-circle" background="hitlibe.jpg"style="background-repeat:no-repeat ;background-size:100% 100%; background-attachment:fixed;">
<!--canvas id="myCanvas" width="1350" height="1000"
style="border:1px solid black">
your browser does not support the canvas element.
</canvas-->
<div class="top-banner">
	<img src="headphoto.png" width="400" height="70"/>
</div>
<!-- 
<hr />
-->
<div class="login-content">
	<div id="htl" class="login-content-left">
		<h4>注意事项：</h4>
		<ol>
			<li>账号即为学号/职工号。</li>
			<!-- <li>若还未注册，请先进行注册。</li> -->
			<li>记住自己的密码。</li>
		</ol>
	</div>
	<div id="htr" class="login-content-right">
		<h4>用户登录</h3>
		<form action="hello.action" name="form1" method="get">
			<p>用户名：<input class="input" type="text" name="username" id=name/></p>
			<p style="margin-left:12px">密 码：<input class="input" type="password" name="password" id=password /></p>
			<p style="margin-left:12px">角 色：
			<select name="color" class="select">
				<option value="">请选择</option>
				<option value="教师">教师</option>
				<option value="学生">学生</option>
			</select>
			</p>
			<!-- <p class="submit-btn"><input name = "regis" type=submit value="注册" onClick="jump()"></input> -->
			<p class="submit-btn"><!-- <input name = "regis" type=submit value="注册"></input>  -->
			<input type=submit name = "regis" value="登录" onClick="return check()"></input></p>
		</form>
	</div>
</div>
<!-- <div class="dht-bottom">
	<p>Copyright © 2019 all rights reserved. </p>
</div> -->
<script>
var validator = "${attr.validator}";
//cum = document.getElementById('pwd');;
//alert(validator);
if(validator=="ERROR")
	{
	alert("用户名或密码错误！");
	}
</script>
</body>
</html>