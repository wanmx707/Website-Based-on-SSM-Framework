// JavaScript Document
$(function(){

    //动漫画记录
//读取cookie
    var list7330=getCookie('7330List');
    var list7330_str = '';
    if(list7330!=null && list7330!=''){
        var mhArr=list7330.split("####");
        for (var j=0; j< mhArr.length-1; j++){
            list7330_str+=mhArr[j];
        }
    }else{
        list7330_str = "<span>暂时无观看记录</span>";
    }
//载入历史观看记录
    $('#recShow_ck').html(list7330_str);

//观看记录
    if(typeof(ctitle) != "undefined"){
        SetMhCookie(ctitle,curl,cg,window.location);
    }
//SetMhCookie('aaa','http://baidu.com',1,window.location);
//设置COOKIE
    function SetMhCookie(title1,url1,cg,url2){
        var dmstr = '漫画';
        if(cg == 2){ dmstr = '动画'; }
        var day = new Date();
        var timestr = (day.getMonth()+1)+"月"+day.getDate()+"日";
        var mhValue='<dl><dt><span><a href="javascript:void;" class="d_l">x</a></span><a href="'+url1+'"'
            +'target="_blank">'+title1+'('+dmstr+')</a></dt><dd><span><a href="'+url2+'"'
            +'target="_blank">继续观看</a></span>上次于 '+timestr+' 观看</dd></dl>####';
        mh_L=getCookie('7330List');
        if(mh_L!=null && mh_L!=''){
            var mlArray=mh_L.split("####");
            for (var i=0;i<mlArray.length-1;i++){
                if(mlArray[i].indexOf(title1)>=0 && mlArray[i].indexOf(dmstr)>=0){
                    mlArray.splice(i,1); //删除本记录
                    break;
                }
            }
            mh_L = mlArray.join('####');
            mh_L = mhValue+mh_L;  //添加记录
            setCookie('7330List',mh_L,7);
        }else{
            setCookie('7330List',mhValue,7);
        }
    }
//删除观看记录
    jQuery(".d_l").click(function(){
        $(this).parent().parent().parent().remove();
        var coolhtml='';
        $("#recShow_ck dl").each(function(){
            coolhtml+='<dl>'+$(this).html()+'</dl>####';
        })
        setCookie('7330List',coolhtml,1);
    });
//全部删除
    jQuery('.hlist-remove:first').click(function(){
        $('#recShow_ck').html('<span>暂时无观看记录</span>');
        setCookie('7330List','',1);
    });

//最新每周更新周几显示
    var date = new Date();
    var week = 0;
    if(date>0) {
        week = date.getDay()-1;
    }else{
        week = 6;
    }
    jQuery('#tab6 li').removeClass('current');
    jQuery('.tab6box').hide();
    jQuery('#tab6 li').eq(week).addClass('current');
    jQuery('.tab6box').eq(week).show();


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







    //顶部观看记录
    $(".last_jl").mouseenter(function(){
        $(this).addClass("last_bg");
        $(".gkjl").show();
    }).mouseleave(function(){
        $(".gkjl").hide();
        $(this).removeClass("last_bg");
    });


    //顶部搜索框
    $(".search dt").hover(function(){
        $(this).find("ul").show();
        $(this).addClass("se");
    },function(){
        $(this).find("ul").hide();
        $(this).removeClass("se");
    });


//搜索链接(默认是动画)
    var dm_fg = 2;
//根据选择框选择动画、漫画
    jQuery('.search ul li').click(function(){

        //选择漫画
        if(jQuery(this).index()==0){
            dm_fg = 2;
            jQuery('.search .name').eq(0).html('漫画');

        }else if(jQuery(this).index()==1){
            dm_fg = 3;
            jQuery('.search .name').eq(0).html('动画');

        }else if(jQuery(this).index()==2){
            dm_fg = 4;
            jQuery('.search .name').eq(0).html('情报');

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
        if(keyword == '请输入你要查找的内容'){
            jQuery(this).val('');
        }
    }).blur(function(){
        var keyword = jQuery.trim(jQuery(this).val());
        if(keyword==''){
            jQuery(this).css("color",'#999');
            jQuery(this).val('请输入你要查找的内容');
        }else if(keyword=='请输入你要查找的内容'){
            jQuery(this).css("color",'#999');
        }
    });
    function dmchk(){
        var keyword = jQuery.trim(jQuery('.s_input').eq(0).val());
        if(keyword=='请输入你要查找的内容') keyword = '';
        if(keyword!=''){
            if(dm_fg==2) {
                location.href = "http://www.hanhande.com/manhua/so-"+encodeURIComponent(keyword)+".shtml";
            } else if(dm_fg==3){
                location.href = "http://www.hanhande.com/donghua-"+encodeURIComponent(keyword)+".shtml";
            }else{
                location.href="http://comic.hanhande.com/mhqb/";
            }
        }else{
            if(dm_fg==2) {
                location.href = "http://www.hanhande.com/manhua/so-"+encodeURIComponent(keyword)+".shtml";
            } else if(dm_fg==3){
                location.href = "http://www.hanhande.com/donghua-"+encodeURIComponent(keyword)+".shtml";
            }else{
                location.href="http://comic.hanhande.com/mhqb/";
            }
        }
        return false;
    }
//设置搜索框
    var cur_u = window.location;
    cur_u = cur_u.toString();
    if(cur_u.indexOf("manhua")>=0){
        //漫画
        dm_fg = 2;
        jQuery('.name:first').html('漫画');

    } else if(cur_u.indexOf("manhua")>=0) {
        //漫画
        dm_fg = 3;
        jQuery('.name:first').html('动画');

    }else{
        dm_fg = 4;
        jQuery('.name:first').html('情报');

    }





//热门搜素
    $(" .rmss ul li").each(function(i){
        if((i+1)%5==0){
            $(this).css("margin-right","0px")
        }
    });

//相似文章
    $(" .xswz ul li").each(function(i){
        if((i+1)%2==0){
            $(this).css("margin-right","0px")
        }
    });

//漫画推荐图文
    $(".mhtj_list li").each(function(i){
        if((i+1)%3==0){
            $(this).css("margin-right","0px")
        }
    });

//漫画推荐文
    $(".qt_txt li").each(function(i){
        if((i+1)%4==0){
            $(this).css("margin-right","0px")
        }
    });

})



//返回顶部
$(function () {
    $(window).scroll(function () {
        var scrH = document.documentElement.scrollTop + document.body.scrollTop;
        if (scrH > 200) {
            $('.gototop').fadeIn(400);
        } else {
            $('.gototop').stop().fadeOut(400);
        }
    });
    $('.gototop').click(function () {
        $('html,body').animate({scrollTop: '0px'}, 300);
    });
});


//排序
$(function(){

    $('.gxList').eq(0).show()//by jessica add 默认显示第一栏
    $('.tit em').click(function(){
        if($(this).attr("class")=="eb e2" || $(this).attr("class")=="ea e2")
        {
            return;
        }
        $('.tit em').removeClass('e2')
        $(this).addClass('e2');
        //$("div[title='A']").
        var index= $('.tStab li a[class="current"]').index();
        //alert(index);
        //$('.tabbox').eq(index).show().siblings('.tabbox').hide();
        display('.gxList ul',index,$('.gxList ul').eq(index).children().get().reverse());
        
        $('.gxList').eq(index).show().siblings('.gxList').eq(index).hide();
    });

})
function display(obj,index,divs) {
    var html = [];
    for (var i = 0; i < divs.length; i++) {
        html.push('<li>'+divs[i].innerHTML+'</li>');
    }
    $(obj).eq(index).html(html.join(" "));
}

$(function(){
    if($(".gxList #g1 li").length>50){
        $(".gxList ul").css("height","390px");
        $(".Kmore").show();
        $(".Kmore a").click(function(){
        $(".gxList ul").css("height","auto");
            $(".Kmore a").click(function(){
                var anh = $("#g1").position().top;
                $("html,body").stop().animate({scrollTop:anh},100);
            });
        });
    } else {
        $(".Kmore").hide();
    }
    function show(box,dj,current){
       $(box+':gt(49)').hide();
        $(dj).click(function(){
            if($(box+':lt(49)').hide()){
                $(box).toggle();
                $(this).toggleClass(current); return false;
            }
        })
    }
    show('#g1 li','#k1','active')
    /*show('#g2 li','#k2','active')
     show('#g3 li','#k3','active')
     show('#g4 li','#k4','active')
     show('#g5 li','#k5','active')
     show('#g6 li','#k6','active')
     show('#g7 li','#k7','active')
     show('#g8 li','#k8','active')*/
})