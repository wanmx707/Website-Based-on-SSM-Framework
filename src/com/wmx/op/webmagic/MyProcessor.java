package com.wmx.op.webmagic;

import com.wmx.op.po.News;
import com.wmx.op.service.NewsService;
import com.wmx.op.service.impl.NewsServiceImpl;

import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.Spider;
import us.codecraft.webmagic.processor.PageProcessor;

public class MyProcessor implements PageProcessor {
	// 抓取网站的相关配置，包括编码、抓取间隔、重试次数等
    private Site site = Site.me().setRetryTimes(3).setSleepTime(100);
    private static int count =0;
     
    @Override
    public Site getSite() {
        return site;
    }
 
    @Override
    public void process(Page page) {
    	//判断链接是否符合http://www.cnblogs.com/任意个数字字母-/p/7个数字.html格式
        if(!page.getUrl().regex("http://op.hanhande.net/shtml/[a-z 0-9 -]+/[0-9]{7}.shtml").match()){
        	//加入满足条件的链接
            page.addTargetRequests(
            		page.getHtml().links().regex("http://op.hanhande.net/shtml/[a-z 0-9 -]+/[0-9]{7}.shtml").all());
            //.xpath("//*[@class=\"show listbox\"]/div/h2/@href").all());
            //page.getHtml().xpath("//*[@id=\"post_list\"]/div/div[@class='post_item_body']/h3/a/@href").all());
        }else{                             
        	//获取页面需要的内容
        	
        	News news=new News();
            if(page.getHtml().xpath("//*[@class=\"show listbox\"]/div[@class='showbox']/html()").get()!=null&&page.getHtml().xpath("//*[@class=\"show listbox\"]/div/h2/text()").get()!=null){
            	/*System.out.println("抓取的标题："+
                        page.getHtml().xpath("//*[@class=\"show listbox\"]/div/h2/text()").get()
                        );
            	System.out.println("抓取的内容："+
                        page.getHtml().xpath("//*[@class=\"show listbox\"]/div[@class='showbox']/html()").get()
                        );*/
            	NewsService newsService=new NewsServiceImpl();
            	news.setNewstitle(page.getHtml().xpath("//*[@class=\"show listbox\"]/div/h2/text()").get());
            	news.setNewscontent(page.getHtml().xpath("//*[@class=\"show listbox\"]/div[@class='showbox']/html()").get());
            	try {
					newsService.insertNewsByuser(news);
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
            count ++;
        }
    }
    public void findNewsFromInternet(){
        long startTime, endTime;
        System.out.println("开始爬取...");
        startTime = System.currentTimeMillis();
        Spider.create(new MyProcessor()).addUrl("http://op.hanhande.net/shtml/fenxi.shtml").thread(5).run();
        endTime = System.currentTimeMillis();
        System.out.println("爬取结束，耗时约" + ((endTime - startTime) / 1000) + "秒，抓取了"+count+"条记录");
    }
 
}