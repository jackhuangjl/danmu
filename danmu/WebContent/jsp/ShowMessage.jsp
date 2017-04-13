<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
 <%@ page import="dao.InformationDao"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>ShowMessage</title>
<script type="text/javascript" src="../js/jquery-3.2.1.min.js"></script>
<style>
.container {background: url("../img/2.jpg") center center #ccc;width:600px;height:400px;margin: 50px auto;}
.inputbox {margin:20px  0 0 450px;}
</style>
</head>
<body>
<div id="totalmar" class="container">
<marquee id="mar1" direction="left" align="bottom" height="25" width="100%" onmouseout="this.start()" onmouseover="this.stop()" scrollamount="20" scrolldelay="1" loop=1><span id="scrollTxt" onclick="updatemar()">水平滚动字幕内容</span></marquee>
</div>
<form class="inputbox">
请输入：<input type="text"/>
<input type="submit" value="提交">
</form>
<a href="javascript:;">链接</a>

<script type="text/javascript">
	function updatemar(message){
		document.getElementById("totalmar").innerHTML = "<marquee>" + message + "</marquee>"  + "<marquee loop=1>" + message + "</marquee>";
	}
	updatemar("huangjialin");
</script>
</body>
</html>