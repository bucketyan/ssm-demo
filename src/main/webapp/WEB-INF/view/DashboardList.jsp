<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%--<%@ taglib uri="/WEB-INF/tld/fuck.tld" prefix="fuck"%>--%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
	String httpPath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ "/";
%>
<html>
<head>
<title>fuck</title>
<script type="text/javascript">
           var basePath = "<%=basePath%>";
</script>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<!--当前页面用chrome内核来渲染。-->
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1">
<!--在iPhone的浏览器中页面将以原始大小显示，并不允许缩放-->
<meta name="keywords" content="fuck">
<meta name="description" content="fuck">
<%--
<link href="${pageContext.request.contextPath}/css/base.css"
	rel="stylesheet" type="text/css" />--%>
<style type="text/css">
.marquee {
	overflow: hidden;
	border: none;
	background: transparent;
}
</style>
<%--
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/jquery-1.9.1.min.js"></script>--%>

<script type="text/javascript">

	$(document).ready();

</script>
</head>
<body >
	<div class="header">
		<div class="header_logo"></div>

		<div class="header_quit" onClick="goOut();">退出登录
		
		</div>
		<div class="hearder_menber">欢迎：${sessionScope.currentUser.userName}</div>
		<div id="loginuser_id" style="display: none">${sessionScope.currentUser.userName}</div>
	</div>

</body>
</html>