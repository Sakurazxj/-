<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html style="height:100%;">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<link rel="icon" href="hitcso.ico" type="image/x-icon"/>
<link rel="stylesheet" href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css">

<link rel="stylesheet" href="http://homepage.hit.edu.cn/web/css/bootstrap.css">
<link rel="stylesheet" href="http://homepage.hit.edu.cn/web/css/shouyestyle.css">
<link rel="stylesheet" href="http://homepage.hit.edu.cn/web/css/font-style.css">
<link rel="stylesheet" href="http://homepage.hit.edu.cn/web/css/flexslider.css" type="text/css">

<link href="web/css/bootstrap.min.css" rel="stylesheet" type="text/css">
<link href="web/css/css.css" rel="stylesheet" type="text/css">
<link href="web/css/shouye-style.css" rel="stylesheet" type="text/css">

<script type="text/javascript" src="web/js/jquery-1.9.1.min.js"></script>
<script type="text/javascript" src="web/js/bootstrap.min.js"></script>
<script type="text/javascript" src="web/js/jquery.scrollTo-1.4.2-min.js"></script> 
<script type="text/javascript" src="web/js/waypoints.min.js"></script>

<script src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
<script src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<title>欢迎使用教师信息管理系统</title>
<style type="text/css">
html,body{
    margin:0;
    padding:0;
    list-style:none;
}
a {
	color: #000;
	text-decoration:none;
}
a:hover {
	text-decoration:none;
	color: #fff;
}
.yh {
  display: flex;
  flex-wrap: wrap;
  /* justify-content: space-around; */
}

.yh a {
  display: inline-block;
  width: 10%;
  font-size: 20px;
  text-align: center;
}
button {
	margin: 0;
	padding: 0;
	outline: none;  
	width: 50px;
	height: 30px;
	line-height: 30px;
	border-radius: 8px;
	font-size: 14px;
	color: #4C4C4C;
}
.search-result-top {
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
input {
	background:none;  
	outline:none;  
	border:0px;
}
ul {
	list-style: none;
}
.top-container {
	width: 80%;
	position: absolute;
	top: 100px;
	left: 50%;
	transform: translateX(-50%);
	z-index:2;
}
.a-style {
  display: inline-block;
  margin-right: 20px;
  font-size: 20px;
}
.search-box {
  display: flex;
  justify-content: flex-end;
  padding-right: 40px;
  box-sizing: border-box;
  height: 85px;
  line-height: 85px;
  display: flex;
  background-color: #ccc;
}
.word-box {
	height: 60px;
	display: flex;
	justify-content: flex-start;
	align-items: center;
	background-color: #fff;
}
.word-box li a {
	display: block;
	width: 30px;
	height: 30px;
	line-height: 30px;
	text-align: center;
}
.word-box li:hover a{
	background-color: #ccc;
	border-radius: 10px;
}
.input-box {
	width: 190px;
	height: 35px;
	padding-left: 10px;
	background: rgba(241,241,241,1);
	opacity: 0.7;
	border-radius: 8px;
}
.search-btn {
	margin-left: 20px;
	width: 50px;
	height: 35px;
	line-height: 35px;
	background: rgba(0,0,0,0.6);
	color: #fff;
	border-radius: 10px;
}
.search-container {
	display: flex;
	justify-content: flex-start;
	align-items: center;
}
.tearch-card {
	min-height: 160px;
	display: flex;
	padding: 18px;
	background-color: #fff;
}
.tearch-card:nth-of-type(4n) {
	margin-right: 0
}
.tearch-card img{
	width: 84px;
	height: 84px;
	border-radius: 50%;
	background-color: red;
}
.tearch-card div {
	margin-left: 20px;
}
.tearch-card div .name {
	font-size: 18px;
}
.search-result-box {
  width: 80%;
  margin: 160px auto 0 auto;
  padding: 160px 0 50px 0;
}
.tearchs {
	overflow: hidden;
}
.card-box{
	box-sizing: border-box;
	width: 25%;
	float: left;
	padding: 0 13px;
	margin-bottom: 20px;
}
#dht{
    height: 50px;
    line-height: 50px;
    text-align: center;
    background-color:black;
}

.clear{clear:both;}
</style>
</link>
</head>
<body>

<div style="postion:relative;background-color:#ccc;">
	<div class="search-result-top">
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
		您好,<s:property value="username" />
		</span>
	</div>
	<img style="width:100%; height: 300px; background-color:#fff;"   />

	<div style="width:100%;min-height:700px;height:auto;margin:0px;padding:0px;">
		<div class="top-container">
			<div class="search-box">		
		          <span>查找教师： </span>
		          <form action="SearchTec.action?username=<s:property value="username" />" name="form1" method="get" class="search-container">
			          <input id="search" name="search" type="text" class="input-box"></input>
			          <input type="hidden" name="username" id=username value=<s:property value="username"/>></input>
			          <input type=submit value="搜  索" class="search-btn"></input>
		        </form>
	    	</div>
		
			
          	<ul class="word-box">
          		<li style="width:80px;">姓氏字母： </li>
	           	<li><a href="lettersearch.action?letter=a&username=<s:property value="username" />">A</a></li>
	            <li><a href="lettersearch.action?letter=b&username=<s:property value="username" />">B</a></li>
	            <li><a href="lettersearch.action?letter=c&username=<s:property value="username" />">C</a></li>
	            <li><a href="lettersearch.action?letter=d&username=<s:property value="username" />">D</a></li>
	            <li><a href="lettersearch.action?letter=e&username=<s:property value="username" />">E</a></li>
	            <li><a href="lettersearch.action?letter=f&username=<s:property value="username" />">F</a></li>
	            <li><a href="lettersearch.action?letter=g&username=<s:property value="username" />">G</a></li>
	            <li><a href="lettersearch.action?letter=h&username=<s:property value="username" />">H</a></li>
	            <li><a href="lettersearch.action?letter=i&username=<s:property value="username" />">I</a></li>
	            <li><a href="lettersearch.action?letter=j&username=<s:property value="username" />">J</a></li>
	            <li><a href="lettersearch.action?letter=k&username=<s:property value="username" />">K</a></li>
	            <li><a href="lettersearch.action?letter=l&username=<s:property value="username" />">L</a></li>
	            <li><a href="lettersearch.action?letter=m&username=<s:property value="username" />">M</a></li>
	            <li><a href="lettersearch.action?letter=n&username=<s:property value="username" />">N</a></li>
	            <li><a href="lettersearch.action?letter=o&username=<s:property value="username" />">O</a></li>
	            <li><a href="lettersearch.action?letter=p&username=<s:property value="username" />">P</a></li>
	            <li><a href="lettersearch.action?letter=q&username=<s:property value="username" />">Q</a></li>
	            <li><a href="lettersearch.action?letter=r&username=<s:property value="username" />">R</a></li>
	            <li><a href="lettersearch.action?letter=s&username=<s:property value="username" />">S</a></li>
	            <li><a href="lettersearch.action?letter=t&username=<s:property value="username" />">T</a></li>
	            <li><a href="lettersearch.action?letter=u&username=<s:property value="username" />">U</a></li>
	            <li><a href="lettersearch.action?letter=v&username=<s:property value="username" />">V</a></li>
	            <li><a href="lettersearch.action?letter=w&username=<s:property value="username" />">W</a></li>
	            <li><a href="lettersearch.action?letter=x&username=<s:property value="username" />">X</a></li>
	            <li><a href="lettersearch.action?letter=y&username=<s:property value="username" />">Y</a></li>
	            <li><a href="lettersearch.action?letter=z&username=<s:property value="username" />">Z</a></li>
          	</ul>
          	<!--  
          	<div class="tearch-card">
				<img />
				<div>
					<p class="name">老师姓名</p>
					<p >老师信息</p>
				</div>
          	</div>
          	-->
     <!-- 	
	<center><hr style="margin:0px;padding:0px;width:98%;height:3px;border:none;border-top:3px double black;positive:absolute;top:600px;"/></center>
   	<center><hr style="margin:0px;padding:0px;width:100%;height:3px;border:none;border-top:3px double black;positive:absolute;top:600px;"/></center>
	-->   
		
	</div>
	<div class="search-result-box" style="position:relative;">
      <fieldset>
        <p><span style="font-size:30px">搜索结果</span> / SEARCH RESULT</p>
        <div class="col-lg-12 col-xs-12 yh">
          <c:forEach var="item" items="${teacherlist}" varStatus="status">
        
                <!--span style="word-wrap:break-word;padding-left:50px;padding-right:50px;vertical-align:top;"><a href="findbook.action?title=${item}">${item}</a></span-->
                <!-- <div class="panel" style="word-wrap:break-word;width:100px;min-height:60px;height:auto;vertical-align:top;float:left;padding-right:20px;"> -->
                <a class = "a-style" href="SearchTec.action?search=${item}&username=<s:property value="username" />">${item}</a>
                
                
               <!-- <div class="card-box">
              <div class="tearch-card">
                <img />
                <div>
                  <p class="name">老师姓名</p>
                  <p >老师信息</p>
                </div>
                    </div>
                  </div> -->
                </c:forEach>
              </div>
        
      </fieldset>
    </div>
</div>

	<div id="dht">
		<%-- <span style="color:white;">Copyright © 2009 all rights reserved. Power by 上海众臻信息科技有限公司
		Please contact Us : market@sportoa.com
		Tel : 021-54933212
		</span> --%>
	</div>
</div>

</body>
</html>

