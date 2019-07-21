//选项卡函数
function tab(tid,tidtag,bid,bidtag){
    var td = document.getElementById(tid);
    var tdli = td.getElementsByTagName(tidtag);
    var bd = document.getElementById(bid);
    var bdli = bd.getElementsByTagName(bidtag);
    var cur = "cur";
	var btn = document.getElementById("div_btn");
	var img = document.getElementById("iga");
    var indexValue = function(self,obj){
        for(i = 0; i < obj.length; i++){
            if(obj[i] == self){
                return i; 
            };
        };
    };
    var index;
    tdli[0].className = "cur";
    for(l = 0; l < tdli.length; l++){
        tdli[l].onmouseover = function(){
            index = indexValue(this,tdli);
            for(m = 0; m < tdli.length; m++){
                tdli[m].className = (m == index) ? cur : "";
                bdli[m].style.display = (m == index) ? "block" : "none";
			    btn.style.display = (img.style.display == "block") ? "block" : "none";
                if(index > 0){
                    var this_img = $("#j-rolecon ul:eq(" + index + ")");
                    var replace_html = this_img.html().replace(/lz_src/g, "src");
                    this_img.html(replace_html);    
                }
                
            };
        };
    };
	
};
function tab2(tid,tidtag,bid,bidtag){
    var td = document.getElementById(tid);
    var tdli = td.getElementsByTagName(tidtag);
    var bd = document.getElementById(bid);
    var bdli = bd.getElementsByTagName(bidtag);
    var cur = "cur";
    var indexValue = function(self,obj){
        for(i = 0; i < obj.length; i++){
            if(obj[i] == self){
                return i; 
            };
        };
    };
    var index;
    tdli[0].className = "cur";
    for(l = 0; l < tdli.length; l++){
        tdli[l].onmouseover = function(){
            index = indexValue(this,tdli);
            if($("#video_img_url").length != 0){
                if(index == 0){
                    $("#video_img_url").attr("href", "/haizeiwang/shipin/");
                }else{
                    $("#video_img_url").attr("href", "/haizeiwang/yinyue/");
                }
            }
            for(m = 0; m < tdli.length; m++){
                tdli[m].className = (m == index) ? cur : "";
                bdli[m].style.display = (m == index) ? "block" : "none";
            };
        };
    };
	
};
