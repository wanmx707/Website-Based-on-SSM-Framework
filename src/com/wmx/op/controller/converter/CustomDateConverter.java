package com.wmx.op.controller.converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;

/**
 * 日期转换�?
 * @author 温孟�?
 *
 */
public class CustomDateConverter implements Converter<String, Date>{

	public Date convert(String source) {
		//将日期串转为日期类型（格式是yyyy-MM-dd HH:mm:ss�?
		SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try {
			//转换成功直接返回
			return simpleDateFormat.parse(source);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		//如果参数绑定失败，返回空
		return null;
	}

}
