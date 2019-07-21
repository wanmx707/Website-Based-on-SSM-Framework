<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>海贼王分享网</title>
<script type="text/javascript">
	function run(){
		document.getElementById("GoIndex").submit();
		var btn = document.getElementById("go");
		   var time = 2;//定义时间变量。用于倒计时用
		            var timer = null;//定义一个定时器；
		            //alert&#40;"aaaa"&#41;;
		            timer = setInterval(function(){///开启定时器。函数内执行
		                btn.innerText = time;    //点击发生后，按钮的文本内容变成之前定义好的时间值。
		                time--;//时间值自减
		            },1000)
	}
</script>
</head>
<body onload="run()">
	<form id="GoIndex" action="queryindex.action"></form>
	欢迎来到海贼王作品分享网，<span id="go">5</span>秒后进行跳转......
</body>
</html>