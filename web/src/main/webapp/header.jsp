<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page  isELIgnored="false"%>  
<html lang="ch">
	<head>
		<meta charset="utf-8">
		<title>依公圈</title>
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		
		<!-- Metatag -->
		<meta property="og:title" content="依公圈" />
		<meta property="og:type" content="website" />

		<link rel="stylesheet" href="css/bootstrap.min.css" />
		<link rel="stylesheet" href="css/font.css" />
		<link rel="stylesheet" href="css/style.css" />
		
		
		<!-- Favicon -->
		<link rel="icon" href="img/hsfavicon.png">
		
		<!-- =========== -->
		<!-- Google Font -->
		<!-- =========== -->
				
		<script type="text/javascript">
		
			// Add Google Font name here
			
			WebFontConfig = { google: { families: [ 'Bangers', 'Lato' ] } };
			(function() {
			var wf = document.createElement('script');
			wf.src = ('https:' == document.location.protocol ? 'https' : 'http') +
			'://ajax.googleapis.com/ajax/libs/webfont/1/webfont.js';
			wf.type = 'text/javascript';
			wf.async = 'true';
			var s = document.getElementsByTagName('script')[0];
			s.parentNode.insertBefore(wf, s);
			})();
			
		</script>
		
		<style type="text/css">
		
			/* Add Google Font name here */

			.wf-active {font-family: 'Lato',serif; font-size: 14px;}
			.wf-active .logo {font-family: 'Bangers', serif;}
			
		</style>
		
		<!--[if lt IE 9]>
			<script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
		<![endif]-->
		<!--[if IE 7]>
			<link rel="stylesheet" href="css/ie7.css" />
		<![endif]-->


    
  
	<script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.8.2/jquery.min.js"></script>

	<script type="text/javascript" src="js/jquery.tweet.js"></script>
	<script type="text/javascript" src="js/bootstrap.min.js"></script>
	<script type="text/javascript" src="js/shop.js"></script>
	<script type="text/javascript" src="js/script.js"></script>
	</head>
	<body class="wf-active">	
	
	<!-- =========== -->
	<!-- Top section -->
	<!-- =========== -->
	
	<div class="header-container">
	<div class="container welcome">
		<div class="row-fluid">
			<div class="pull-left greet">
				Welcome shopper, <a href="login.html">login here</a>
			</div>
			<div class="pull-right cart tright">
				
				<!-- Cart Updates -->
				<div class="counter">
					<a href="javascript:void(0);"><i class="icon-basket"></i> Your cart </a> : <span class="theme">$139</span>
				</div>
				
				<!-- Bubble Cart Item -->
				<div class="cartbubble">
			
					<div class="arrow-box">
						
						<!-- Item 1 -->
						<div class="clearfix">
							<a href="#">Sample Tshirt Stripes...</a> <span class="theme pull-right">$55</span>
						</div>
						
						<!-- Item 2 -->
						<div class="clearfix">
							<a href="#">Sample Dress in cart</a> <span class="theme pull-right">$73</span>
						</div>
						
						<!-- Item 3 -->
						<div class="clearfix">
							<a href="#">Sample Socks in cart</a> <span class="theme pull-right">$11</span>
						</div>
						<hr />
						<!-- Total -->
						<div class="clearfix">
							TOTAL <span class="theme pull-right">$139</span>
						</div>
						<hr />
						<div class="clearfix">
							<a href="javascript:void(0)" id="closeit">Close</a>
							<a href="checkout.html" class="btn theme btn-mini pull-right">Checkout</a>
						</div>
					</div>
					
				</div>
			</div>
		</div>	
	</div>

	<!-- ================ -->
	<!-- Branding section -->
	<!-- ================ -->
	
	<div class="container head">
		<div class="row">
			<div class="span12 clearfix">
				<div class="top row">
					
					<div class="span8 logo text" style="display:none"><a href="index.html">TenderShop</a></div>
					<div class="span8 logo image"><a href="index.html"><img src="img/highreslogo.png" alt="" /></a></div>
					
					<div class="cart span4">
						<form action="#" class="topsearch">
							<input type="search" class="top-search" placeholder="Search"/>
							<button type="submit"><i class="icon-search"></i></button>
						</form>
					</div>
					
				</div>	
			</div>
		</div>
	</div>
	

	</div>