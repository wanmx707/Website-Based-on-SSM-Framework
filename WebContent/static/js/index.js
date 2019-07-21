// JavaScript Document

var dm_fg = 1;
var agt = navigator.userAgent.toLowerCase();
var is_ie = ((agt.indexOf("msie") != -1) && (agt.indexOf("opera") == -1));
var is_gecko= (navigator.product == "Gecko");
var is_webkit=agt.indexOf('webkit')>-1;
function CopyCode(obj) {
	if (typeof obj != 'object') {
		if (is_ie) {
			window.clipboardData.setData("Text",obj);
			alert('���Ƴɹ�!');
		} else {
			prompt('��Ctrl+C��������', obj);
		}
	} else if (is_ie) {
		var js = document.body.createTextRange();
		js.moveToElementText(obj);
		js.select();
		js.execCommand("Copy");
		alert('���Ƴɹ�!');
	}
	return false;
}

function AddFavorite(sURL, sTitle){
	try{
		window.external.addFavorite(sURL, sTitle);
	}catch (e){
		try{
			window.sidebar.addPanel(sTitle, sURL, "");
		}catch (e){
			alert("�����ղ�ʧ�ܣ���ʹ��Ctrl+D�������");
		}
	}
};

function floatResize(){
	var a =  Number($("#main").offset()['left'])+ 1030;
	$("#floatnav").css('left',a+'px');
}

function arrayAdds(){
	var a = arguments[0];
	var b = arguments[1];
	var c = 0;
	for(var i=0;i<b;i++){
		c+=a[i];
	}
	return c;
}

$(function(){

var weekHeights = [];
	var _len = $(".qhbox ul").length;
	for(var i=0;i<_len;i++){
		weekHeights.push($(".qhbox ul").eq(i).height()+40);
	}
	
	$(".qhnav li").click(function(){
		$(this).addClass("cur").siblings().removeClass("cur");
		var a = $(this).index();
		$("#pane").animate({scrollTop:arrayAdds(weekHeights,a)},200);
	});//�ܼ�
	
	setTimeout(function(){
		var _a = new Date().getDay();
		$(".qhnav li").removeClass('cur');
		$(".qhnav li[sid="+_a+"]").addClass("cur");
		var _b = $(".qhnav li[sid="+_a+"]").index();
		// $("#pane").css("top","-"+arrayAdds(weekHeights,_b)+'px');
		$("#pane").animate({scrollTop:arrayAdds(weekHeights,_b)},200);
	},200);

$(".search dt").hover(function(){
		$(this).find("ul").show();	
	},function(){
		$(this).find("ul").hide();	
	});
//����ѡ���ѡ�񶯻�������
jQuery('.search ul li').click(function(){
	//ѡ������
	if(jQuery(this).index()==0){
		dm_fg = 2;
		jQuery('.search .name').eq(0).html('����'+'<i></i>');
	}else if(jQuery(this).index()==1){
		dm_fg = 3;	
		jQuery('.search .name').eq(0).html('Ӱ��'+'<i></i>');
	}else if (jQuery(this).index()==2){
		dm_fg = 4;
		jQuery('.search .name').eq(0).html('����'+'<i></i>');
	}else if(jQuery(this).index()==3){
		dm_fg = 5;
		jQuery('.search .name').eq(0).html('��Ѷ'+'<i></i>');
	}
	jQuery('.search ul').hide();
});

jQuery('.s_btn').click(function(){dmchk();});
jQuery('.s_input').keydown(function(event){
		if(event && event.keyCode==13){
			event.preventDefault();
			dmchk();
		}
	}).focus(function(){
		jQuery(this).css("color",'#444');
		var keyword = jQuery.trim(jQuery(this).val());
		if(keyword == '��������������'){
			jQuery(this).val('');
		}
	}).blur(function(){
		var keyword = jQuery.trim(jQuery(this).val());
		if(keyword==''){
		    jQuery(this).css("color",'#999');
			jQuery(this).val('��������������');
		}else if(keyword=='��������������'){
			jQuery(this).css("color",'#999');
		}
	});
function dmchk(){
	var keyword = jQuery.trim(jQuery('.s_input').eq(0).val());
	if(keyword=='�����붯������') keyword = '';
	if(keyword!=''){
		if(dm_fg==2) {
			location.href = "http://www.hanhande.com/manhua/so-"+encodeURIComponent(keyword)+".shtml";
		} else if(dm_fg==3){
			location.href="http://www.hanhande.com/donghua-"+encodeURIComponent(keyword)+"-7-0-0-0-0-0-0-0-1.shtml";
			} else if(dm_fg==5) {
			location.href="http://zhannei.baidu.com/cse/search?s=14117673542050572497&q="+keyword+"&searchsubmit=&isNeedCheckDomain=1&jump=1";
			} else {
			location.href = "http://www.hanhande.com/donghua-"+encodeURIComponent(keyword)+".shtml";
		}
	}else{
		if(dm_fg==2){
			location.href = "http://www.hanhande.com/manhua/so/";
		}else if(dm_fg==3){
			location.href = "http://www.hanhande.com/donghua-7-0-0-0-0-0-0-0-1.shtml";
		}else if(dm_fg==5){
			location.href="http://zhannei.baidu.com/cse/search?s=14117673542050572497&q=&searchsubmit=&isNeedCheckDomain=1&jump=1";
		} else {
			location.href = "http://www.hanhande.com/donghua/";
		}
	}
	return false; 
}
//����������
var cur_u = window.location;
cur_u = cur_u.toString();
if(cur_u.indexOf("manhua")>=0){
	//����
	dm_fg = 2;
	jQuery('.name:first').html('����'+'<i></i>');
} else if(cur_u.indexOf("manhua")>=0){
	dm_fg = 3;
	jQuery('.name:first').html('Ӱ��'+'<i></i>');
	} else if(cur_u.indexOf("manhua")>=0){
	dm_fg = 5;
	jQuery('.name:first').html('��Ѷ'+'<i></i>');
	} else {
	//����
	dm_fg = 4;
	jQuery('.name:first').html('����'+'<i></i>');
}

jQuery('.botbtn').click(function(){dmchk2();});
jQuery('.text').keydown(function(event){
		if(event && event.keyCode==13){
			event.preventDefault();
			dmchk2();
		}
	}).focus(function(){
		jQuery(this).css("color",'#444');
		var keyword = jQuery.trim(jQuery(this).val());
		if(keyword == '��������������'){
			jQuery(this).val('');
		}
	}).blur(function(){
		var keyword = jQuery.trim(jQuery(this).val());
		if(keyword==''){
		    jQuery(this).css("color",'#999');
			jQuery(this).val('��������������');
		}else if(keyword=='��������������'){
			jQuery(this).css("color",'#999');
		}
	});
function dmchk2(){
	var keyword = jQuery.trim(jQuery('.text').eq(0).val());	
	if(keyword=='�����붯������') keyword = '';
	if(keyword!=''){
		location.href = "http://www.hanhande.com/donghua-"+encodeURIComponent(keyword)+".shtml";
	}else{
		location.href = "http://www.hanhande.com/donghua/";	
	}
	return false; 
}
	
	// this initialises the demo scollpanes on the page.
	//$('#pane').jScrollPane({scrollbarWidth:10,showArrows:true,reinitialiseOnImageLoad:true});
	
	floatResize();
	
	$(window).resize(function(){
		floatResize();
	});
		
		
	$(window).scroll(function(){
		var st = $(document).scrollTop();
		(st > 250)? $("").show(): $("#floatnav").hide();
	})
		

$(".thumic dl dd").click(function(){
		$(".thumic dl dd").removeClass("cur");
		$(this).addClass("cur");
		var i = $(this).index();
		$(".hd li").eq(i).show().siblings().hide();
	})
  
setInterval(function(){
		var index = $(".thumic dl dd[class=cur]").index();
		index = index+1;
		if(index>=4){index=0}
		$(".thumic dl dd").removeClass("cur").eq(index).addClass("cur");
		$(".hd li").eq(index).show().siblings(".hd li").hide();
	},5000);
	

	$(".fktc li").click(function(){
		$(".fktc li").removeClass("cur")
		$(this).addClass("cur");
		var params = $(this).attr('label');
		senderrorbox(this,params);
		})
	$(".submit").click(function(){
		var ftype = $("#fbtype").val();
		var msg = $("#message").val();
		var aid = $("#aid").val();
		var infor = $('#information').val();
		//$(".fktc li").removeClass("cur")
		//$(this).addClass("cur");
		//var params = $(this).attr('label');
		//alert("sss");
		if(msg!=""){
			var params = {'fbtype':ftype, 'message':msg, 'aid':aid,'information':infor};
			sendfbbox(this,params);
		} else {
			alert("����д����������Ӵ��");
			$("#message").focus();
		}
	})
		
	$("#floatnav li").click(function(){
		$("#floatnav li").removeClass("cur")
		$(this).addClass("cur");
		})
		
		
	$(".share .sharebtn").hover(function(){
		$(".share #share").show()
		});
		
	$(".share cite").click(function(){
		$(".share #share").hide()
		});
		
		if($(".juji ul li").length>50){
		$(".juji ul").css("height","440px");
		$(".kmore").show();
		$(".kmore a").click(function(){
			$(".juji").toggleClass("active");
			$(".active .kmore a").click(function(){
				var anh = $(".juji").position().top;
				$("html,body").stop().animate({scrollTop:anh},100);	
			});
		});
	}
	
      $(".article_nav code,.nav2_b b").toggle(
		function(){
			$('.gkjl').html(list7330_str);
			$(".gkjl").show();
		},
		function(){
			$(".gkjl").hide();
		}
	);
	
		
	//����	
	$(".bc").click(function(){
		$(".fktc").show();
		})	
		
	$(".fktc cite").click(function(){
		$(".fktc").hide();
		})		
	
		
	
	
	function mytab2(menu,content,on){
	//��ʼ����ʾ״̬		
	$(menu).hover(function(){
		$(menu).removeClass(on);
		$(this).addClass(on);
		var i = $(this).index(menu);
		$( content).eq(i).show().siblings(content).hide();
	  })
	}
	mytab2(".dm_ex dd",".dm_ex ul","cur");
	/*mytab2(".rankbox .rankmenu1 dd span",".rankbox .rankctnbox","cur");
	mytab2(".rankctnbox dd",".rankctnbox ul","cur");*/
	mytab2(".splist dd",".splist .jslist","cur");
	//mytab2(".bcjy dd",".bcjy .bccon","cur");
	$(".bcjy dd").hover(function(){
		$(".bcjy dd").removeClass("cur");
		$(this).addClass("cur");
		$("#fbtype").val($(this).index());
	})
	//mytab2(".juqh .jujlist li",".juqh .juji","cur");

$(".xftjboxm li").hover(function(){
		$(this).addClass("top1").siblings().removeClass("top1");
	});



$("#zuijia").click(function(){
		var anh = $("#location").position().top;
		$("html,body").stop().animate({scrollTop:anh},1000);
	});

$(".pingl,.pl2").click(function(){
		var anh = $("#pinglun").position().top;
		$("html,body").stop().animate({scrollTop:anh},1000);
	});
$(".closed").click(function(){
		$(".closed2").show();
		$("#shadow").show();	
	});
	$(".closed2").click(function(){
		$("#shadow").hide();
		$(this).hide();
	});
	

	
})


//����by jessica  add 2016/7/8
$(function(){
	var mydate = new Date();
	//var t=mydate.toLocaleString();
	$("#nowtime").html("������"+(mydate.getMonth()+1)+"��"+mydate.getDate()+"��"+mydate.getHours()+"��");
	function tab2(menu,box,current,child){
		$(menu).hover(function(){
			
		if(child){
			$(menu).children(child).removeClass(current);
			$(this).children(child).addClass(current);
		} else {
			$(menu).removeClass(current);
			$(this).addClass(current);
		}
		var index=$(this).index();
		$(box).eq(index).show().siblings(box).hide()
		})
	}	
	tab2('.fysx dd','.xflist','cur','')
	tab2('.tStab li','.gxList','current','a')
 	$('.gxList').eq(0).show()//by jessica add Ĭ����ʾ��һ��

	 $('.jujlist em').click(function(){
		
		 if (!$(this).hasClass("cur") ){
			var html=$(".juji ul").html();html=html.toLowerCase();
			var arr=html.split("</li>");arr.pop();		//�ֽ����飬��ȥ�����һ����Ч��
			html=arr.reverse().join("</li>")+"</li>";
			$(".juji ul").html(html);
		 }
		 $('.jujlist em').removeClass('cur');
		 $(this).addClass('cur');	

	 })

}) 

 function display(obj,index,divs) {
	  var html = [];
	  for (var i = 0; i < divs.length; i++) {
		html.push('<li>'+divs[i].innerHTML+'</li>');
	  }
	  $(obj).eq(index).html(html.join(" "));
 }


/*//��������(Ĭ���Ƕ���)
var dm_fg = 1;
jQuery('.searchbtn').click(function(){dmchk();});
jQuery('.searchtxt').keydown(function(event){
		if(event && event.keyCode==13){
			event.preventDefault();
			dmchk();
		}
	}).focus(function(){
		jQuery(this).css("color",'#444');
		var keyword = jQuery.trim(jQuery(this).val());
		if(keyword == '�����붯������'){
			jQuery(this).val('');
		}
	}).blur(function(){
		var keyword = jQuery.trim(jQuery(this).val());
		if(keyword==''){
		    jQuery(this).css("color",'#999');
			jQuery(this).val('�����붯������');
		}else if(keyword=='�����붯������'){
			jQuery(this).css("color",'#999');
		}
	});
function dmchk(){
	var keyword = jQuery.trim(jQuery('.searchtxt').eq(0).val());
	if(keyword=='�����붯������') keyword = '';
	if(keyword!=''){
		if(dm_fg==2) {
			location.href = "http://www.hanhande.com/manhua-"+encodeURIComponent(keyword)+".shtml";
		} else {
			location.href = "http://www.hanhande.com/dh-"+encodeURIComponent(keyword)+".shtml";
		}
	}else{
		if(dm_fg==2){
			location.href = "http://www.hanhande.com/manhua/";
		}else{
			location.href = "http://www.hanhande.com/dh/";
		}
	}
	return false; 
}*/
//�����ύ
var isSEND=0;
var djs_sec=3;
var close_T=false;
var issubmiting=0;
function senderrorbox(obj,vars){
	if(isSEND!=0){return;}
	isSEND++;
	$.post("/taglist/feedback.php?action=save&"+vars,function(data){
		//alert(data);
		
		if(data==1){
			$(obj).html("лл�㣬�ύ�ɹ�!<span id='jsq'>("+djs_sec+")����Զ��ر�</span>");
			close_T=setInterval("closebox()",1000);
		} else {			
			alert("�����쳣������ϵ������Ա!");
		}
	});
}


function sendfbbox(obj,vars){
	if(issubmiting==1){alert("�벻Ҫ�ظ���������!");return false;}
	issubmiting=1;
	$.post("/taglist/feedback.php?action=save",vars,function(data){
		//$("#result").html(data+(data==1));
		if(data==1){
			$("#message").val("");
			$('#information').val("");
			alert("���������ѳɹ��ύ����ȴ�����Ա��˻�ظ�!");
		} else {			
			alert("�����쳣������ϵ������Ա!");
		}
		issubmiting=0;
	});
	return false;

}

function closebox(){
	djs_sec--;
	$("#jsq").html("("+djs_sec+")����Զ��ر�");
	if(djs_sec<1){
		clearTimeout(close_T);
		$(".fktc li").removeClass('cur');
		$(".fktc li").html("");$(".fktc").hide();
	}
}


//��������¼
//��ȡcookie
var list7330=getCookie('hanhandeList');
var list7330_str = '';
var cleanStr = '<div class="listremove"><a href="#">���ȫ����¼</a></div>';
if(list7330!=null && list7330!=''){
	var mhArr=list7330.split("####");
	for (var j=0; j< mhArr.length-1; j++){
		list7330_str+=mhArr[j];
	}
	list7330_str = list7330_str+cleanStr;
}else{
	list7330_str = "<div class='jlctn'>��δ��¼�κ���ʷ��Ϣ</div><a class='jlmore' href='http://www.hanhande.com/dh/' target='_blank'>�鿴����</a>";
}

//������ʷ�ۿ���¼	
$('.gkjl').html(list7330_str);

//�ۿ���¼
if(typeof(ctitle) != "undefined"){
	SetDmCookie(ctitle,curl,cg,window.location);
}

//����COOKIE
function SetDmCookie(title,url,cg,url2){
	var dmstr = '����';
	if(cg == 2){ dmstr = '����'; }
	var day = new Date();
	var timestr = (day.getMonth()+1)+"��"+day.getDate()+"��";
	var mhValue='<dl><dt><span class="d_l"></span><a href="'+url+'"'
				+'target="_blank">'+title+'('+dmstr+')</a></dt><dd><span><a href="'+url2+'"' 
				+'target="_blank">�����ۿ�</a></span>�ϴ��� '+timestr+' �ۿ�</dd></dl>####';	
	mh_L=getCookie('hanhandeList');
	if(mh_L!=null && mh_L!=''){
		var mlArray=mh_L.split("####");
		for (var i=0;i<mlArray.length-1;i++){
			if(mlArray[i].indexOf(title)>=0 && mlArray[i].indexOf(dmstr)>=0){
				mlArray.splice(i,1); //ɾ������¼
				break;
			}
		}
		mh_L = mlArray.join('####');
		mh_L = mhValue+mh_L;  //��Ӽ�¼
		setCookie('hanhandeList',mh_L,7);	
	}else{
		setCookie('hanhandeList',mhValue,7);
	}
}

//ɾ���ۿ���¼
jQuery(".d_l").live('click',function(){
	//$(this).parent().parent().parent().remove();
	var coolhtml='';
	var del_i = $(".d_l").parents("dl").index();
	$(".gkjl dl").each(function(i){
		if(del_i!=i){
			coolhtml+='<dl>'+$(".gkjl dl").eq(i).html()+'</dl>####';
		}
	})
	setCookie('hanhandeList',coolhtml,1);
	
	list7330=getCookie('hanhandeList');
	list7330_str = '';
	cleanStr = '<div class="listremove"><a href="#">���ȫ����¼</a></div>';
	if(list7330!=null && list7330!=''){
		var mhArr=list7330.split("####");
		for (var j=0; j< mhArr.length-1; j++){
			list7330_str+=mhArr[j];
		}
		list7330_str = list7330_str+cleanStr;
	}else{
		list7330_str = "<div class='jlctn'>��δ��¼�κ���ʷ��Ϣ</div><a class='jlmore' href='http://www.hanhande.com/dh/' target='_blank'>�鿴����</a>";
	}
	console.log(list7330_str);
	$('.gkjl').html(list7330_str);
	return false;
});

//ȫ��ɾ��
jQuery('.listremove').live('click',function(){
    $('.gkjl').html("<div class='jlctn'>��δ��¼�κ���ʷ��Ϣ</div><a class='jlmore' href='http://www.hanhande.com/dh/' target='_blank'>�鿴����</a>");
	setCookie('hanhandeList','',1);
});

function setCookie(c_name,value,expiredays){
	var exdate = new Date();
	exdate.setSeconds(exdate.getSeconds()+expiredays*24*3600);
	//document.cookie = c_name + "=" +escape(value) + (";expires=" + exdate.toGMTString()+";path=/;domain=52pk.com");
	document.cookie = c_name + "=" +escape(value) + (";expires=" + exdate.toGMTString()+";path=/");
}
function getCookie(c_name){
 if (document.cookie.length > 0){
	c_start = document.cookie.indexOf(c_name + "=")
	if (c_start != -1){
		c_start = c_start + c_name.length + 1;
	    c_end   = document.cookie.indexOf(";",c_start);
	    if (c_end == -1){
			c_end = document.cookie.length;
		}
		return unescape(document.cookie.substring(c_start,c_end));
	 }
 }
	return null
}

// �������
$(function(){
		$(".morelink").live("click",function(){
		 $(this).toggle(
		function(){
			$(".epi_box").toggleClass("active");
			$(".morelink").html("�������");
			var anh = $(".epi_btn").position().top;
			$("html,body").stop().animate({scrollTop:anh},100);
		},
		function(){
			$(".epi_box").toggleClass("active");
			$(".morelink").html("����鿴����");
			var anh = $(".epi_btn").position().top;
			$("html,body").stop().animate({scrollTop:anh},100);
		});
		$(this).trigger('click');
	});
	
if($(".epi_box article").height()<330){$("a.morelink").hide();$(".epi_box").css("height","auto")}

	var a = $(".epi_btn li").length;
        $(".epi_btn li.more").hide();
	if(a>10){
		$(".epi_btn li:gt(10)").hide();
		$(".epi_btn li.more").show();
		$(".epi_btn li:lt(3)").hide();
		$(".epi_btn li.more").click(function(){
			$(".epi_btn li:gt(10)").show();
			$(".epi_btn li:lt(3)").show();	
			$(".epi_btn li.more").hide();
		})
	}else{$(".epi_btn li.more").hide();}
	
 $('.epi_btn li ').click(function(){
		var aids = $(this).attr("title");
		if($('.epi_box').hasClass('active')){
            $('.epi_box').removeClass('active');
        }
		 $(".epi_btn li").removeClass("cur");

		$(this).addClass("cur");
		 $.ajax({
			type: "POST",
			url : "/taglist/juqing.php?action=get",
			data: { "aids":aids},
			success: function(msg){
			 // alert(msg);
			  $(".epi_box").html(msg);
			}
		 });
	
	});	
	
})