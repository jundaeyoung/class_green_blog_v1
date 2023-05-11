<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../layout/header.jsp"%>
<h1>여기는 회원 가입화면</h1>
<div class="container">
	<form action="#" method="post">
		<div class="form-group">
			<label for="username">userName : </label> <input type="text" name="username" class="form-control" id="username" value="아톰">
		</div>
		<div class="form-group">
			<label for="password">password : </label> <input type="password" name="password" class="form-control" id="password" value="1234">
		</div>
		<div class="form-group">
			<label for="email">email : </label> <input type="text" name="email" class="form-control" id="email" value="a@naver.com">
		</div>
		<button type="button" id="btn--save" class="btn btn-primary">회원가입</button>
	</form>
</div>
<script src="/js/user.js">
	
</script>
<%@ include file="../layout/fotter.jsp"%>