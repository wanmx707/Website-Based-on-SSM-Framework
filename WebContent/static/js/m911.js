function browserRedirect(){
	var content	= $("link[rel='alternate']").attr("href");
    var url		= content.match(/http.*/);
	var isMobile = jQuery.browser.mobile;
	var winUrl = window.location.href;
	var winIndex = "http://www.hanhande.com/";
	if(url>""  && isMobile && winUrl != winIndex)
	{
		window.location.href=url;
	}
}
browserRedirect();
function indexgg(ggan,ggshow){
	$(ggan).hover(
		function(){
			time = setTimeout(function(){$(ggshow).show();},200);
		},function(){
			clearTimeout(time);
	});
	$(ggshow).hover(
		function(){
			$(ggshow).show();
		},
		function(){
			$(ggshow).hide();
		}
	)
}