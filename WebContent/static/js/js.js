$(function(){
	$(".num span").click(function(){
		$('.num span').removeClass('current');
		$(this).addClass('current');
		var index = $(this).index();
		$(".flash ul li").eq(index).show().siblings('.flash ul li').hide();
	})
        //×Ô¶¯ÇÐ»»
	setInterval(function(){
		var index = $(".num span[class=current]").index();
		//alert(index);
		index = index+1;
		if(index>=4){index=0}
		$(".num span").removeClass("current").eq(index).addClass("current");
		$(".flash ul li").eq(index).show().siblings('.flash ul li').hide();
	},5000);
	
	function qiehuan(qhan,qhshow,qhon){
		$(qhan).click(function(){
			$(qhan).removeClass(qhon);
			$(this).addClass(qhon);
			var i = $(this).index();
			$(qhshow).eq(i).show().siblings(qhshow).hide();
		})
	}
	qiehuan(".data_tab ul li",".databox","current");


})

function showpic(){
	var imgurl = "http://op.hanhande.com/showpic.htm?img="+jQuery('.nph_photo_view img').attr("src");
	window.open(imgurl,"_blank"); 
}


function week_init(){
	$("#weektab li").each(function(i){
		$(this).click(function(){week_click(i);})
			.hover(function(){$(this).addClass('hover');},function(event){$(this).removeClass('hover');});
	});
	var w = new Date().getDay();
	if (w==0){ w=6;} else {w=w-1;}
	week_click(w);
}
function week_click(num){
	$("#weektab li").removeClass('on').eq(num).addClass('on');
	$curdl=$("#weekcon dl").eq(num);
	var posi=$curdl.position();
//	var t=$("#weekcon").scrollTop();
//	var nt=posi.top+t;
	$("#weekcon").animate({scrollTop:posi.top},200);
}





function testDisplay()
{
    var divD = document.getElementById("testD");
	var divV=document.getElementById("testV");
    if(divD.style.display=="none")
    {
        divD.style.display = "block";
		divV.style.display="none";
    }
    else
    {
        divD.style.display = "none";
		divV.style.display="block";
    }
}
