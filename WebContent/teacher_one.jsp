<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ taglib prefix="s" uri="/struts-tags" %>

<html style="height:100%;">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<link rel="icon" href="hitcso.ico" type="image/x-icon"/>
<link rel="stylesheet" href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
<script src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<title>欢迎使用教师信息管理系统</title>
<style type="text/css">
html,body{
    margin:0;
    padding:0;
    list-style:none;
}
#dht{
    padding:0px;
    boder:1px solid#000000; 
    margin:0px;
}
.student-content {
  position: absolute;
  top: 50%;
  left: 0;
  right: 0;
  transform: translateY(-50%);
  display: flex;
  justify-content: space-around;
  align-items: center;
}
.student-content-left {
  width:20%;
  height:180px;
}
.student-content-left, .student-content-right {
  border-radius: 8px;
  padding: 20px 15px 0 15px;
    background-color:rgba(255,245,238,0.7);
}
h4{
    font-family: "华云彩体"; 
    font-size: 18px;
    margin-bottom: 20px;
    margin-top: 0;
}
.student-page-top {
  position: fixed;
  top: 0;
  left:0;
  right: 0;
  z-index: 6;
  height: 85px;
  padding: 0 136px 0 20px;
  background-color:rgba(0,0,0,1);
}
.exit-logo, .hello-word, .exit-word {
  float: right;
  line-height: 85px;
  font-size: 18px;
  color: white;
}
.hello-word {
  margin-right: 20px;
}
.exit-logo {
  margin-top: 27px;
  margin-right: 10px;
}

</style>
</head>
<body class="img-circle" background="hitlibe.jpg"style="background-repeat:no-repeat ;background-size:100% 100%; background-attachment:fixed;">
<div class="student-page-top">
    <img src="Teaphoto.png" width="400" height="60" style="margin-top:12px"/>
    <!--%String character = "world";
    character  =  new  String(request.getParameter("character").getBytes("ISO-8859-1"), "utf-8");
    System.out.println(character);%-->
    <a href="login_inter.jsp" class="exit-word">
    退出
    </a>
    <a href="login_inter.jsp" class="exit-logo">
      <img src="exit.gif" width="30" height="30"/>
    </a>
    <span class="hello-word">
    您好,<s:property value="tecinf.teacherName" />
    </span>
  </div>

<div class="student-content">
<div class="student-content-left">
<p>功能选择：</p>
<p><a href="helload.action?type=1&username=<s:property value="tecinf.teacherId" />">个人信息查看及修改</a></p>
<p><a href="helload.action?type=2&username=<s:property value="tecinf.teacherId" />">个人基金和科研成果查看及修改</a></p>
<p><a href="helload.action?type=3&username=<s:property value="tecinf.teacherId" />">个人行程查看及修改</a></p>
<p><a href="helload.action?type=4&username=<s:property value="tecinf.teacherId" />">预约查看</a></p>
</div>
<div class="table-responsive student-content-right" style="width:40%;">          
       <table class="table table-striped table-bordered">
         <thead>
           
			          <h4>教师基本信息：</h4>
           
         </thead>
         <tbody>
           <tr>
             <td>教师职工号：</td>
           <td><s:property value="tecinf.teacherId" /></td>
           </tr>
           <tr>
             <td>姓名：</td>
             <td><s:property value="tecinf.teacherName" /></td>
           </tr>
           <tr>
             <td>性别：</td>
             <td><s:property value="tecinf.teacherGender" /></td>
           </tr>
           <tr>
             <td>出生年月：</td>
             <td><s:property value="tecinf.teacherBirthday" /></td>
           </tr>
           <%-- <tr>
             <td>年龄：</td>
             <td><s:property value="tecinf.teacherAge" /></td>
           </tr> --%>
           <tr>
             <td>学院：</td>
             <td><s:property value="tecinf.teacherCollege" /></td>
           </tr>
           <tr>
             <td>手机号：</td>
             <td><s:property value="tecinf.teacherPhone" /></td>
           </tr>
           <tr>
             <td>邮箱：</td>
             <td><s:property value="tecinf.teacherEmile" /></td>
           </tr>
           <tr>
             <td>个人简介：</td>
             <td style="WORD-WRAP: break-word;width:78%;min-height:100px;height:auto;"
             ><s:property value="tecinf.teacherResume" /></td>
           </tr>
         </tbody>
       </table>
      </div>
</div>
<hr />
<div id="dht">
<!-- <p style="position:relative;top:0px;left:200px;">Copyright © 2009 all rights reserved.  -->
</p>
</div>
</body>
</html>