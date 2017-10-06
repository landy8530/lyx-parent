<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<!DOCTYPE HTML>
<html>
<%
request.setAttribute("base", request.getContextPath());
%>

<head>
<base href='<%=request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + request.getContextPath() + "/"%>' />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<link rel="stylesheet" type="text/css" href="${base }/css/common-neptune.css" />
<link rel="stylesheet" type="text/css" href="${base }/extjs/resources/ext-theme-neptune/ext-theme-neptune-all.css" />
<!-- 
<link rel="stylesheet" type="text/css" href="/lyx-sys/css/common.css" />
<link rel="stylesheet" type="text/css" href="/lyx-sys/extjs/resources/ext-theme-classic/ext-theme-classic-all.css" />
-->
<script type="text/javascript" charset="utf-8" src="${base }/extjs/ext-all.gzjs"></script>
<script type="text/javascript" charset="utf-8" src="${base }/extjs/ext-lang-zh_CN.js"></script>
<script type="text/javascript" charset="utf-8">

Ext.onReady(function(){
	
	Ext.MessageBox.alert('提示信息','Welcome to ExtJS World!!${user.name}');
	
});

</script>

</head>
<body>
Hello World! This is lyx-sys Page!
userName:${user.name }
</body>
</html>