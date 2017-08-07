<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
	request.setAttribute("wbaseUrl", request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ request.getContextPath());
%>

<script type="text/javascript">
	var baseUrl = '${wbaseUrl}';
</script>