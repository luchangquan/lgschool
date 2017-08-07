<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=Edge,chrome=1" />
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
<script type="text/javascript"
	src="resources/jquery/jquery-1.9.1.min.js"></script>

<style type="text/css">
h3 {
	display: inline
}

div.logo div {
	display: inline-block; /*注意此处采用行内元素的方式*/
}

.logo img {
	width: 550px
}

.imgbox img {
	width: 1300px
}

body {
	text-align: center
}
</style>
</head>
<body>

	<div id="alertbox">

		<div class="alertbk logo">
			<div class="logo">
				<img alt="" src="resources/img/1.jpg">
			</div>

			<div>
				<br>
				<br>
				<h3>
					<a href="#1" class="clickone">首页</a>
				</h3>
				&nbsp&nbsp&nbsp&nbsp
				<h3>
					<a href="#2" class="clickone">智慧校园</a>
				</h3>
				&nbsp&nbsp&nbsp&nbsp
				<h3>
					<a href="#3" class="clickone">灵狗商城</a>
				</h3>
				&nbsp&nbsp&nbsp&nbsp
				<h3>
					<a href="#4" class="clickone">计划任务</a>
				</h3>
				&nbsp&nbsp&nbsp&nbsp
				<h3>
					<a href="#5" class="clickone">加盟合作</a>
				</h3>
				&nbsp&nbsp&nbsp&nbsp
				<h3>
					<a href="#" class="clickone1">帮助中心</a>
				</h3>
				&nbsp&nbsp&nbsp&nbsp
				<h3>
					<a href="#6" class="clickone">特别鸣谢</a>
				</h3>
			</div>
		</div>


		<div class="alertbk">
			<div id="1" class="imgbox">
				<img alt="" src="resources/img/3.jpg">
			</div>
			<div id="2" class="imgbox">
				<img alt="" src="resources/img/4.jpg">
			</div>
			<div id="3" class="imgbox">
				<img alt="" src="resources/img/5.jpg">
			</div>
			<div id="4" class="imgbox">
				<img alt="" src="resources/img/6.jpg">
			</div>
			<div id="5" class="imgbox">
				<img alt="" src="resources/img/7.jpg">
			</div>
			<div id="6" class="imgbox">
				<img alt="" src="resources/img/9.jpg">
			</div>
			<div id="7" class="imgbox">
				<img alt="" src="resources/img/10.jpg">
			</div>

		</div>
	</div>
	<script type="text/javascript">
		$(document).ready(function() {
		});
	</script>
</body>
</html>