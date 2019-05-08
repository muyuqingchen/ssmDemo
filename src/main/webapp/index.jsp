<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
</head>
<body>
<div class="warp">
    <div class="systemName">
        <data:DataTag  id="systemName"/>
    </div>
    <div class="centre">
        <form action="user/main.action" method="post">
            <input type="text" name="userName" class="centre_input" placeholder="请输入账号"/>
            <input type="password" id="password" name="password" class="centre_input" placeholder="请输入密码"/>
            <div><button class="lgoin_btn" type="submit">登录</button></div>
            <!-- <a href="#">忘记密码？</a> -->
        </form>
    </div>
</div>
<script type="text/javascript">
</script>
</body>
</html>
