<%--
  Created by IntelliJ IDEA.
  User: wuqiongke
  Date: 15/11/7
  Time: 上午10:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="zh-CN">
  <head>
    <link rel="stylesheet" href="<c:url value="/css/bootstrap-3.3.5.min.css"/>">
    <title>PrintMarket register page</title>
  </head>
  <body>
    <div class="container">
      <form id="registerForm" action="./registSubmit">
        <div class="form-group">
          <label for="userAccount">账号名</label>
          <input type="text" class="form-control" name="userAccount" id="userAccount" placeholder="accountName">
        </div>
        <div class="form-group">
          <label for="userPassword">密码</label>
          <input type="password" class="form-control" name="userPassword" id="userPassword" placeholder="Password">
        </div>
        <div class="form-group">
          <label for="userPassword2">密码</label>
          <input type="password" class="form-control" name="email" id="userPassword2" placeholder="Password">
        </div>
        <div class="form-group">
          <label for="userEmail">用户邮箱</label>
          <input type="email" class="form-control" id="userEmail" placeholder="Email">
        </div>
        <div class="form-group">
          <label for="userRealName">用户真实姓名</label>
          <input type="text" class="form-control" name="userName" id="userRealName" placeholder="realName">
        </div>
        <div class="radio">
          <label>
            <input type="radio" name="sex" value="female">
              女 female
          </label>
        </div>
        <div class="radio">
          <label>
            <input type="radio" name="sex" value="male">
              男 male
          </label>
        </div>
        <div class="form-group">
          <label for="userCompany">公司名</label>
          <input type="text" class="form-control" name="company" id="userCompany" placeholder="companyName">
        </div>
         <div class="form-group">
          <label for="telephone">手机号</label>
          <input type="text" class="form-control" name="telephone" id="telephone" placeholder="telephone">
        </div>
        <button type="button" class="btn btn-default" id="submitButton">提交</button>
      </form>
    </div>
    <script type="text/javascript" src="<c:url value="/js/jquery-1.11.3.min.js"/>"></script>
    <script type="text/javascript" src="<c:url value="/js/bootstrap.min.js"/>"></script>
    <script type="text/javascript" src="<c:url value="/js/register.js"/>"></script>
  </body>
</html>
