
$(window).load(function() {   
	$(".mhBoxShow img").each( function() {
		//modify luoxd 20140626
		var obj = $(this).get(0);
		if (obj != null) imageObject = obj;
		var MaxW = 960;
		var MaxH = 2000;
        var oldImage = new Image();
        oldImage.src = imageObject.src;
        var dW = oldImage.width;
        var dH = oldImage.height;
        if (dW > MaxW) { a = dW / MaxW; b = dH / MaxH; if (b > a) a = b; dW = dW / a; dH = dH / a; }
        if (dW > 0 && dH > 0) { imageObject.width = dW; imageObject.height = dH; }
	});  
});  
//快捷键js

var nowPage = getPage(1);
document.onkeydown=jumpPage; 


function getPage(tip){
	var  filename=location.href;
	filename=filename.substr(filename.lastIndexOf('/')+1); 
	prefname=filename.substr(0,filename.lastIndexOf('.'));
	attrv = prefname.split('_');
	if (typeof(attrv[tip]) == 'undefined')
	{
		return 1;
	} else {
		return attrv[tip];
	}
}

function gprev(){
	if(nowPage==2){
		window.location.href = location.href.substring(0,location.href.lastIndexOf("/"))+'/'+getPage(0)+ '.shtml';
	}
	if(nowPage>2){
		window.location.href = location.href.substring(0,location.href.lastIndexOf("/"))+'/'+getPage(0)+'_'+ (parseInt(getPage(1))-1)+ '.shtml';
	}
}

function gnext(){
	var pageLen = document.getElementById('p__select').options.length;
	var nexturl = document.getElementById('nextArtLinkUrl').value;
	//pageLen = getElementsByName('p__select','option');
	if(nowPage>=pageLen){
		if (confirm("进入下一话观看!"))
		{
			window.location.href=nexturl;
		}
	}
	else {

		window.location.href = location.href.substring(0,location.href.lastIndexOf("/"))+'/'+getPage(0)+'_'+ (parseInt(getPage(1))+1)+ '.shtml';
	}
} 
// 漫画跳转提示
function jumpnext(url){
	if(confirm('已经是最一话,是否跳转到此漫画首页?')){
		if((typeof (url) == 'undefined') || (url='')){
			window.location.href='http://'+document.domain+'/manhua/';
		} else {
			window.location.href='http://'+document.domain+'/manhua/'+url;
		}
	}
}


/*function gprev(){
	var prePage=$("#page__pre>a").attr('href');
	if ( prePage =="" || prePage == undefined){
		if(confirm("已经是第一页了, 是否返回专区首页?")){location.href="/";}
		
	} else {
			location.href=prePage;
	}
}
function goNextPage(){
	var nextPage=$("#page__next>a").attr('href');
	if ( nextPage =="" || nextPage == undefined){
		if(confirm("已经是最后一页了, 是否返回专区首页?")){location.href="/";}
		
	} else {
			location.href=nextPage;
	}
	
}*/
function jumpPage(e){
	if (( e ? e.which :event.keyCode)==37) { //Left Arrow next page
		gprev();
	}
	if (( e ? e.which :event.keyCode)==39) { //Right Arrow pre page
		gnext();
	}
	if (( e ? e.which :event.keyCode)==88) { //X 88 next hua
		if($("#nextArtLinkUrl").val().indexOf('.shtml')){
			location.href = $("#nextArtLinkUrl").val();
		} else {
			gnext();
		}
	}
	if (( e ? e.which :event.keyCode)==90) { //Z 90  pre hua
		if($("#nextArtLinkUrl").val().indexOf('.shtml')){
			location.href = $("#lastArtLinkUrl").val();
		} else {
			if(confirm("已经是第一话了, 是否返回专区首页?")){location.href="/";}
		}

	}
}

$(document).ready(function() {
	 $('.arc_text img').not(".arc_add img").each(function(){
		if($(this).attr("src")!=="" && $(this).attr("src")!==undefined){
			$(this).css("cursor","hand");
			$(this).click(function(){goNextPage();});
			document.onkeydown=jumpPage; 
		}
	 });
	
});