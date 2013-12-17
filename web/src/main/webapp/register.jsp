<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<jsp:include page="header.jsp" />  
<script type="text/css">
.control-label-register {width:343px}
.controls-register {margin-left: 31px;float:left;}
</script>



<div class="container-menu">
 </div>
<div class="container">
	<section class="register">
		<div class="row standard">
			<header class="span12 prime">
				<h3>用户注册</h3>
			</header>
		</div>
		<div class="wrap">
			<div class="row">
				<form class="form-horizontal" action="/web/register.html" method="post">
					<div class="control-group">
					<label class="control-label" for="inputMail" style="width:343px">邮箱</label>
					<div class="controls" style="margin-left: 31px;float:left;">
					  <input type="email" id="inputMail" name="inputMail" placeholder="请输入您的邮箱" onblur="">
					</div>
					</div>
					
					<div class="control-group">
					<label  id="first" class="control-label" for="inputPassword1" style="width:343px">密码</label>
					<div class="controls" style="margin-left: 31px;float:left;">
					  <input type="password" id="inputPassword1" name="inputPassword1" placeholder="请输入密码">
					</div>
					</div>
					
					<div class="control-group">
					<label class="control-label" for="inputPassword2" style="width:343px">确认密码</label>
					<div class="controls" style="margin-left: 31px;float:left;">
					  <input type="password" id="inputPassword2" placeholder="请输入密码">
					</div>
					<label class="control-label" id="remind"></label>
					</div>
					
					<div class="control-group">
					<label class="control-label" for="checkNum" style="width:343px">验证码</label>
					<div class="controls" style="margin-left: 31px;float:left;">
					  <input type="password" id="checkNum" placeholder="请输入验证码">
					</div>

					<img class="controls-msg-box" src="http://pin.aliyun.com//get_img?identity=member1.taobao.com&sessionid=f3a9c1bb198a0554e1f87a62215305fe&kjtype=default&t=1386768058798" />

					</div>
					
					<div class="control-group">
					<label class="control-label" for="checkNum" style="width:343px"></label>
					<div class="controls" style="margin-left: 31px;float:left;">
					  <button type="submit" class="btn theme">注册</button>
					</div>
					</div>
				</form>
			</div>
		</div>
	</section>
</div>


<script>
var data = ["@163.com", "@126.com", "@gmail.com", "@yahoo.com", "@yahoo.com.cn", "@sina.cn", "@qq.com", "@hotmail.com","@sohu.com","@189.cn"];  

$(document).ready(function(){
	$("#inputMail").blur(function(){
		var temp = document.getElementById("inputMail");
		 //对电子邮件的验证
		 var myreg = /^([a-zA-Z0-9]+[_|\_|\.]?)*[a-zA-Z0-9]+@([a-zA-Z0-9]+[_|\_|\.]?)*[a-zA-Z0-9]+\.[a-zA-Z]{2,3}$/;
		 if(!myreg.test(temp.value))
		 {
		     alert('提示\n\n请输入有效的E_mail！');
		     temp.focus();
		     return false;
		}
	});
	$("#inputPassword2").blur(function(){
		var first = document.getElementById("inputPassword1").value;
		if(first == null){
			alert("提示\n\n请不要把密码为空!");
			$("#inputPassword1").focus();
		}
		var second = document.getElementById("inputPassword2").value;
		if(first != second){
			alert("提示\n\n两次密码不一致!");
			$("#inputPassword1").focus();
		}
	});
});
</script>

<jsp:include page="footer.jsp" />   