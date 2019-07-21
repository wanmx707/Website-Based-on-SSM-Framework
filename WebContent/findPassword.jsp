<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>找回密码</title>

<link rel="stylesheet" type="text/css"
	href="static/css/style_14_common.css" />
<link rel="stylesheet" type="text/css"
	href="static/css/style_14_member_register.css" />

<script src="static/js/common.js" type="text/javascript"></script>
<link rel="stylesheet" id="css_widthauto" type="text/css"
	href='static/css/style_14_widthauto.css' />
<link rel="stylesheet" type="text/css" href="static/css/style.css" />
<link rel="stylesheet" href="static/css/oculus.css" />
<link rel="stylesheet" href="static/css/nc.css" />
<script type="text/javascript" src="js/jquery-1.4.2.min.js"></script>
<link rel="stylesheet" href="css/base.css" type="text/css" />
<script type="text/javascript">
	HTMLNODE.className += ' widthauto'
</script>
<script type="text/javascript">
        function validatePassword() {
            var passElement=document.getElementById("pass");
            var msgElement=document.getElementById("passMsg");
            if(passElement.value==""){
               passElement.className="wrong";//获取元素对象的class属性
                msgElement.innerHTML="<span style='color:red'>密码不能为空!</span>";
                return false;
            }
            if(/^\w{6,20}$/.test(passElement.value)){
                passElement.className="right";//获取元素对象的class属性
                msgElement.innerHTML="<span style='color:green'>密码输入格式正确!</span>";
                return true;
            }
            else{
                passElement.className="wrong";//获取元素对象的class属性
                msgElement.innerHTML="<span style='color:red'>密码长度应该在6-20之间!</span>";
                return false;
            }
        }
        function validateRePassword() {
            var passElement=document.getElementById("pass");
            var repassElement=document.getElementById("repass");
            var msgElement=document.getElementById("repassMsg");
            if(repassElement.value==""){
                passElement.className="wrong";//获取元素对象的class属性
                msgElement.innerHTML="<span style='color:red'>密码不能为空!</span>";
                return false;
            }
            if(!(/^\w{6,20}$/.test(repassElement.value))){
                repassElement.className="wrong";//获取元素对象的class属性
                msgElement.innerHTML="<span style='color:red'>密码长度应该在6-20之间!</span>";
                return false;
            }
            if(passElement.value==repassElement.value){
                repassElement.className="right";//获取元素对象的class属性
                msgElement.innerHTML="<span style='color:green'>两次密码一致!</span>";
                return true;
            }
            else{
                repassElement.className="wrong";//获取元素对象的class属性
                msgElement.innerHTML="<span style='color:red'>两次密码不一致!</span>";
                return false;
            }
        }
        function validateEmpty(elementName) {
            var objElement=document.getElementById(elementName);
            var msgElement=document.getElementById(elementName+"Msg");
            if (objElement.value!="") {   //不为空
                objElement.className="right";
                msgElement.innerHTML="<span style='color:green'>输入内容正确!</span>";
                return true;
            }else{
                objElement.className="wrong";
                msgElement.innerHTML="<span style='color:red'>输入内容错误!</span>";
                return false;
            }
        }
        function validateRepeat(srcName,desName) {    //确定密码与确认密码是否一致
            var srcElement=document.getElementById(srcName);
            var desElement=document.getElementById(desName);
            var msgElement=document.getElementById(desName+"Msg");
            if (srcElement.value==desElement.value){
                desElement.className="right";
                msgElement.innerHTML="<span style='color:green'>输入内容相同!</span>";
                return true;
            }else{
                desElement.className="wrong";
                msgElement.innerHTML="<span style='color:red'>输入内容不相同!</span>";
                return false;
            }
        }
        function validatePass() {   //验证密码是否为空
            return validateEmpty("pass");
        }
        function validateRepass() {  //验证两次密码是否相同
            if(validateEmpty("repass")) {  //确认密码不为空
                return validateRepeat("pass", "repass"); //验证密码是否一致
            }
            return false;//确认密码为空，直接返回false
        }
        
        function validateEmail() {
            var emailElement=document.getElementById("email");
            var msgElement=document.getElementById("emailMsg");
            if(emailElement.value==""){
                emailElement.className="wrong";//获取元素对象的class属性
                msgElement.innerHTML="<span style='color:red'>邮箱不能为空!</span>";
                return false;
            }
            if(/^\w+@\w+\.\w+$/.test(emailElement.value)){
                emailElement.className="right";//获取元素对象的class属性
                msgElement.innerHTML="<span style='color:green'>邮箱输入正确!</span>";
                return true;
            }else{
                emailElement.className="wrong";//获取元素对象的class属性
                msgElement.innerHTML="<span style='color:red'>邮箱输入格式错误!</span>";
                return false;
            }
        }
function validateCode() {
	            var codeElement=document.getElementById("code");
	            var msgElement=document.getElementById("codeMsg");
	            if(codeElement.value==""){
	               codeElement.className="wrong";//获取元素对象的class属性
	                msgElement.innerHTML="<span style='color:red'>验证码不能为空!</span>";
	                return false;
	            }
	        }
        function validate() {
            return validateEmail()&&validateCode()&&validatePassword()&&validateRePassword();
        }
		function onsubmit(event) {
			  checksubmit();
			  return false;
			}
		function checksubmit() {
			var p_chks = $('registerform').getElementsByTagName('kbd');
			for(i = 0;i < p_chks.length;i++){
				if(p_chks[i].className == 'p_chk'){
					p_chks[i].innerHTML = '';
				}
			}
			ajaxpost('registerform', 'returnmessage4', 'returnmessage4', 'onerror');
			return;
		}

		function checkusername(id) {
			errormessage(id);
			var username = trim($(id).value);
			if($('tip_' + id).parentNode.className.match(/ p_right/) && (username == '' || username == lastusername)) {
				return;
			} else {
				lastusername = username;
			}
			if(username.match(/<|"/ig)) {
				errormessage(id, '用户名包含敏感字符');
				return;
			}
			var unlen = username.replace(/[^\x00-\xff]/g, "**").length;
			if(unlen < 3 || unlen > 15) {
				errormessage(id, unlen < 3 ? '用户名不得小于 3 个字符' : '用户名不得超过 15 个字符');
				return;
			}
			var x = new Ajax();
			$('tip_' + id).parentNode.className = $('tip_' + id).parentNode.className.replace(/ p_right/, '');
			x.get('forum.php?mod=ajax&inajax=yes&infloat=register&handlekey=register&ajaxmenu=1&action=checkusername&username=' + (BROWSER.ie && document.charset == 'utf-8' ? encodeURIComponent(username) : username.replace(/%/g, '%25').replace(/#/g, '%23')), function(s) {
				errormessage(id, s);
			});
		}

		function checkpassword(id1, id2) {
			if(!$(id1).value && !$(id2).value) {
				return;
			}
			if(pwlength > 0) {
				if($(id1).value.length < pwlength) {
					errormessage(id1, '密码太短，不得少于 '+pwlength+' 个字符');
					return;
				}
			}
			if(strongpw) {
				var strongpw_error = false, j = 0;
				var strongpw_str = new Array();
				for(var i in strongpw) {
					if(strongpw[i] === 1 && !$(id1).value.match(/\d+/g)) {
						strongpw_error = true;
						strongpw_str[j] = '数字';
						j++;
					}
					if(strongpw[i] === 2 && !$(id1).value.match(/[a-z]+/g)) {
						strongpw_error = true;
						strongpw_str[j] = '小写字母';
						j++;
					}
					if(strongpw[i] === 3 && !$(id1).value.match(/[A-Z]+/g)) {
						strongpw_error = true;
						strongpw_str[j] = '大写字母';
						j++;
					}
					if(strongpw[i] === 4 && !$(id1).value.match(/[^A-Za-z0-9]+/g)) {
						strongpw_error = true;
						strongpw_str[j] = '特殊符号';
						j++;
					}
				}
				if(strongpw_error) {
					errormessage(id1, '密码太弱，密码中必须包含 '+strongpw_str.join('，'));
					return;
				}
			}
			errormessage(id2);
			if($(id1).value != $(id2).value) {
				errormessage(id2, '两次输入的密码不一致');
			} else {
				errormessage(id2, !modifypwd ? 'succeed' : '');
			}
		}

		function checkemail(id) {
			errormessage(id);
			var email = trim($(id).value);
			if($(id).parentNode.className.match(/ p_right/) && (email == '' || email == lastemail)) {
				return;
			} else {
				lastemail = email;
			}
			if(email.match(/<|"/ig)) {
				errormessage(id, 'Email 包含敏感字符');
				return;
			}
			var x = new Ajax();
			$('tip_' + id).parentNode.className = $('tip_' + id).parentNode.className.replace(/ p_right/, '');
			x.get('forum.php?mod=ajax&inajax=yes&infloat=register&handlekey=register&ajaxmenu=1&action=checkemail&email=' + email, function(s) {
				errormessage(id, s);
			});
		}
		
		function run() {
			var meil=$('#email').val();
			if(meil==""){
				alert("请输入邮箱");
			}else if(/^\w+@\w+\.\w+$/.test(meil)==false){
				alert("邮箱格式错误！！");
			}else{
				alert(meil);
				var pdata={"email":$('#email').val()};
				$.ajax({
					type:"post",
					url:"${pageContext.request.contextPath }/getRePasswordCode.action",
					contentType:"application/json;charset=utf-8",
					data:JSON.stringify(pdata),  
					//数据格式是json串,商品信息
					success:function(data){//返回json结果
						alert(data.answer);
					}
				});  
				   var btn = document.getElementsByTagName('button')[0];
				   btn.disabled = true;
				   var time = 60;//定义时间变量。用于倒计时用
				            var timer = null;//定义一个定时器；
				            //alert&#40;"aaaa"&#41;;
				            timer = setInterval(function(){///开启定时器。函数内执行
				                btn.innerText = time+"秒后重新发送";    //点击发生后，按钮的文本内容变成之前定义好的时间值。
				                time--;//时间值自减
				                if(time ==0){     //判断,当时间值小于等于0的时候
				                    btn.innerText='重新发送验证码'; //其文本内容变成……点击重新发送……
				                    btn.disabled = false;
				                    clearInterval(timer); //清除定时器
				                }
				            },1000)
			}
			
			 
			  }
    </script>
</head>

<body id="nv_member" class="pg_register"
	onkeydown="if(event.keyCode==27) return false;">

	<%@include file="top.jsp"%>
	<!--网站通用结束-->
	<div class="warp" style="position: relative; z-index: 11">
		<a href="#" target="_blank" id="bg_link"></a>
		<div class="warpbox"
			style="position: relative; z-index: 22; width: 980px; margin: 0 auto">
			<div id="header">
				<div class="￥headbox">
					<div style="display: none">
						<a style="color: #f00" target="_blank" href="queryindex.action">海贼王分享网</a>
					</div>
					<div class="top_nav"></div>
				</div>
				<div>
					<img src="images/head2.jpg" />
				</div>
				<div>
					<img src="images/head3.jpg" />
				</div>
			</div>
			<!-- 头部結束 -->


			<script src="static/js/nc.js"></script>
			<script src="static/js/oculus_nc.js"></script>

			<div id="wp" class="wp">
				<div id="ct" class="ptm wp cl">
					<div class="mn">

						<div class="bm" id="main_message">

							<div class="bm_h bbs" id="main_hnav">
								<span class="y"> <a href="login.jsp" class="xi2">我有帐号，现在登录</a>
								</span>
								<h3 id="layer_reginfo_t" class="xs2">找回密码</h3>
							</div>

							<p id="returnmessage4"></p>
							<div align="center">
								<c:if test="${allErrors!=null }">
									<c:forEach items="${allErrors }" var="error">
								${error.defaultMessage }<br />
									</c:forEach>
								</c:if>
							</div>
							<span style="color: red">${result }</span>
							<form method="post" autocomplete="off" name="register"
								id="registerform" enctype="multipart/form-data"
								onsubmit="return validate();" action="changePassword.action">
								<div id="layer_reg" class="bm_c">
									<div class="mtw">
										<div id="reginfo_a">
											<div class="rfm">
												<table>
													<tr>
														<th><span class="rq">*</span><label
															for="email786a0b4a39efab23">Email:</label></th>
														<td><input type="text" name="useremail" id="email"
															value="${user.useremail }" class="init"
															onblur="validateEmail();" /></td>
														<td><span id="emailMsg"></span></td>
													</tr>
												</table>
											</div>
											<div class="rfm">
												<table>
													<tr>
														<th><span class="rq">*</span><label
															for="email786a0b4a39efab23">验证码:</label></th>
														<td><input type="text" name="code" id="code"
															class="init" onblur="validateCode();" /></td>
														<td><button class="sendVerifyCode" type="button"
																id="getcode" onclick="run()">获取验证码</button> <span
															id="codeMsg" style="color: red">${worng }</span></td>
													</tr>
												</table>
											</div>
											<div class="rfm">
												<table>
													<tr>
														<th><span class="rq">*</span><label
															for="password5aa765d61d8327de">新密码:</label></th>
														<td><input type="password" name="userpassword"
															id="pass" onblur="validatePassword();" class="init"
															value="${user.userpassword }" /></td>
														<td><span id="passMsg"></span></td>
													</tr>
												</table>
											</div>

											<div class="rfm">
												<table>
													<tr>
														<th><span class="rq">*</span><label
															for="password25aa765d61d8327de">确认密码:</label></th>
														<td><input type="password" name="repass" id="repass"
															onblur="validateRePassword();" class="init"
															value="${user.userpassword }" /></td>
														<td><span id="repassMsg"></span></td>
													</tr>
												</table>
											</div>
											<span id="seccode_cSqFU9y0"></span>
										</div>
									</div>
								</div>

								<div id="layer_reginfo_b">
									<div class="rfm mbw bw0">
										<table width="100%">
											<tr>
												<th>&nbsp;</th>
												<td><span id="reginfo_a_btn"> <em>&nbsp;</em>
														<button class="pn pnc" id="registerformsubmit"
															type="submit" name="regsubmit" value="true" tabindex="1">
															<strong>提交</strong>
														</button>
														<button class="pn pnc" id="registerformsubmit"
															type="reset" name="regsubmit" value="true" tabindex="1">
															<strong>重置</strong>
														</button>
												</span></td>
												<td></td>
											</tr>
										</table>
									</div>

								</div>
							</form>


						</div>
						<div id="layer_regmessage" class="f_c blr nfl"
							style="display: none">
							<script type="text/javascript">
								var ignoreEmail = false;
								addFormEvent('registerform', 0);
								function showBBRule() {
									showDialog($('layer_bbrule').innerHTML,
											'info', 'xxxx');
									$('fwin_dialog_close').style.display = 'none';
								}
							</script>
							<script type="text/javascript">
							</script>
						</div>
					</div>
				</div>
			</div>


		</div>
	</div>
	<!-- 尾部 -->
	<div class="cl"></div>
	<div id="footer" align="center">
		<%@include file="foot.jsp"%>
	</div>
	<script src="static/js/home.js" type="text/javascript"></script>
</body>
</html>
