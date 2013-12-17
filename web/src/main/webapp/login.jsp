<%@ page language="java" pageEncoding="UTF-8"%>  
<jsp:include page="header.jsp" />  

 <div class="container-menu">
 </div>
<div class="container">

			<!-- Login Section -->
			<section class="login">

				<div class="row standard">
					<header class="span12 prime">
						<h3>用户登录</h3>
					</header>
				</div>

				<div class="wrap">

					<div class="row-fluid">
						<div class="span6">

							<ul class="nav nav-tabs" id="myTab">
							  <li class="active"><a href="#login"><i class="icon-lock"></i> 老用户</a></li>
							  <li><a href="#forgot"><i class="icon-help"></i>忘记密码</a></li>
							</ul>

							<div class="tab-content">

							<!-- Login -->
							  <div class="tab-pane active" id="login">
								<form class="form-horizontal">
									<div class="control-group">
									<label class="control-label" for="inputEmail"> 邮箱</label>
									<div class="controls">
									  <input type="email" id="inputEmail" placeholder="请输入注册时的邮箱">
									</div>
									</div>
									<div class="control-group">
									<label class="control-label" for="inputPassword">密码</label>
									<div class="controls">
									  <input type="password" id="inputPassword" placeholder="请输入密码">
									</div>
									</div>
									<div class="control-group">
									<div class="controls">
									  <button type="submit" class="btn theme">登陆</button>
									</div>
									</div>
								</form>
							  </div>

							<!-- Register -->
							  <div class="tab-pane" id="forgot">
							  	<form class="form-horizontal">
									<div class="control-group">
									<label class="control-label" for="inputEmail"> 邮箱</label>
									<div class="controls">
									  <input type="email" id="inputEmail" placeholder="请输入注册时的邮箱">
									</div>
									</div>

									<div class="control-group">
									<div class="controls">
									  <button type="submit" class="btn theme">获取新密码</button>
									</div>
									</div>
								</form>
							  </div>

							</div>

						</div>

						<div class="span6">
							<p>新用户</p>
							<hr>
							<p><a href="/web/register.jsp" class="theme">点击这里注册 →</a></p>
						</div>
					</div>

				</div>

			</section>
		</div>
		

		
<jsp:include page="footer.jsp" />   