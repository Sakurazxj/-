<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ taglib prefix="s" uri="/struts-tags" %>

<html style="height:100%;">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<link rel="icon" href="hitcso.ico" type="image/x-icon"/>
<link rel="stylesheet" href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css">

<link rel="stylesheet" href="http://homepage.hit.edu.cn/web/css/bootstrap.css">
<link rel="stylesheet" href="http://homepage.hit.edu.cn/web/css/shouyestyle.css">
<link rel="stylesheet" href="http://homepage.hit.edu.cn/web/css/font-style.css">
<link rel="stylesheet" href="http://homepage.hit.edu.cn/web/css/flexslider.css" type="text/css">

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
    height:50px;
    padding:0px; 
    margin:0px;
    background-color:black;
}
.clear{clear:both;}
</style>
</link>
</head>
<body>

<div style="width:100%;min-height:700px;height:auto;margin:0px;padding:0px;background-color:rgba(255,245,238,0.5);">

<div style="width:100%;height:85px;margin:0px;padding:0px;background-color:rgba(0,0,0,1);">
<h1 style="margin:0px;padding:0px;">
<img src="Teaphoto.png" width="400" height="60" style="position:relative;top:8px;left:10px;"/>
<!--%String character = "world";
character  =  new  String(request.getParameter("character").getBytes("ISO-8859-1"), "utf-8");
System.out.println(character);%-->
<span style="position:relative;top:10px;left:700px;font-size:18pt;color:white;">
您好,<s:property value="username" />
</span>
<a href="login_inter.jsp">
<img src="exit.gif" width="30" height="30" style="position:relative;top:10px;left:700px;"/>
</a>
<a href="login_inter.jsp" style="position:relative;top:10px;left:700px;font-size:18pt;font-color:black;">
退出
</a>
</h1>
</div>

<div class="container">
	<div class="row clearfix">
		<div class="col-md-12 column">
			<div class="carousel slide" id="carousel-692502">
				<ol class="carousel-indicators">
					<li class="active" data-slide-to="0" data-target="#carousel-692502">
					</li>
					<li data-slide-to="1" data-target="#carousel-692502">
					</li>
					<li data-slide-to="2" data-target="#carousel-692502">
					</li>
				</ol>
				<div class="carousel-inner">
					<div class="item active">
						<img alt="" src="pictone.jpg" />
					</div>
					<div class="item">
						<img alt="" src="picttwo.jpg" />
					</div>
					<div class="item">
						<img alt="" src="picthree.jpg" />
					</div>
				</div> <a class="left carousel-control" href="#carousel-692502" data-slide="prev"><span class="glyphicon glyphicon-chevron-left"></span></a> <a class="right carousel-control" href="#carousel-692502" data-slide="next"><span class="glyphicon glyphicon-chevron-right"></span></a>
			</div>
		</div>
	</div>
</div>

<div style="width=100%;height:300px;margin:0px;padding:0px;background-color:rgba(240,255,255,1);">

      <div style="margin:0px;padding:0px;width:100%;height:165px;">
        <div class="neirong2_box2_box" style="width:70%;position:relative;top:30px;">
          <span>查找教师： </span>
	        <form action="SearchTec.action?username=<s:property value="username" />" name="form1" method="get">
	          <input id="search" name="search" type="text" class="wenbenkuang" style="width:260px;position:relative;left:400px;"></input>
	          <input type="hidden" name="username" id=username value=<s:property value="username" />>
	          <input type=submit value="搜  索" class="sousuoanniu" style="width:50px;height:auto;font-size:inherit;position:relative;top:-5px;"></input>
	        </form>
        </div>
        <div class="neirong2_box2_box" style="width:70%;position:relative;top:35px;">
          <span>姓氏字母： </span>
          <ul>
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
        </div>
        </div>
        <center><hr style="margin:0px;padding:0px;width:83%;height:3px;border:none;border-top:3px double red;positive:absolute;top:600px;"/></center>

</div>

<hr style="margin:0px;padding:0px;">
<%-- <div id="dht" class="dht-bottom">
<span style="position:relative;top:15px;left:200px;color:white;">Copyright © 2009 all rights reserved.
</span>
</div> --%>

</div>
</body>
</html>