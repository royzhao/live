<%@ page language="java" pageEncoding="UTF-8"%>  
<jsp:include page="header.jsp" />  



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
				<form class="form-horizontal" action="/web/index.html" method="post">
					<div class="control-group">
					<label class="control-label" for="inputMail" style="width:343px">昵称</label>
					<div class="controls" style="margin-left: 31px;float:left;">
					  <input type="email" id="inputMail" name="inputMail" placeholder="请输入您的昵称" onblur="">
					</div>
					</div>
					
					<div class="control-group">
					<label  id="first" class="control-label" for="inputPassword1" style="width:343px">性别</label>
					<div class="controls" style="margin-left: 31px;float:left;">
					  <input type="radio" name="sex" value="male" /> Male
                      <input type="radio" name="sex" value="female" /> Female
					</div>
					</div>
					
					<div class="control-group">
					<label class="control-label" for="inputPassword2" style="width:343px">电话</label>
					<div class="controls" style="margin-left: 31px;float:left;">
					  <input type="text" id="tell" name="tell" placeholder="电话号码">
					</div>
					<label class="control-label" id="remind"></label>
					</div>
					
					<div class="control-group">
					<label class="control-label" for="checkNum" style="width:343px">生日</label>
					<div class="controls" style="margin-left: 31px;float:left;">
					  <input type="text" id="date-nothing" name="birthday" placeholder="请输入验证码">
					</div>

					<img class="controls-msg-box" src="http://pin.aliyun.com//get_img?identity=member1.taobao.com&sessionid=f3a9c1bb198a0554e1f87a62215305fe&kjtype=default&t=1386768058798" />

					</div>
					
					<div class="control-group">
					<label class="control-label" for="checkNum" style="width:343px"></label>
					<div class="controls" style="margin-left: 31px;float:left;">
					  <button type="submit" class="btn theme" OnClick="">提交</button>
					  <button type="submit" class="btn theme">以后再填</button>
					</div>
					</div>
				</form>
			</div>
		</div>
	</section>
</div>


<script src="js/seajs/sea.js" id="seajsnode"></script>
<link rel="stylesheet" href="js/calendar/calendar.css" />
<script>

		seajs.use('calendar/calendar', function(Calendar) {
		    new Calendar({trigger: '#date-nothing'});
		});
</script>
<script>
$(document).ready(function(){
	$("#tell").blur(function(){
		sMobile = document.getElementById("tell").value;
		if(!(/^1[3|4|5|8][0-9]\d{4,8}$/.test(sMobile))){ 
	        alert("不是完整的11位手机号或者正确的手机号前七位"); 
	        document.getElementById("tell").focus(); 
	        return false; 
	    } 
	});
});
</script>
<jsp:include page="footer.jsp" />   