package com.bw.utils;

import java.util.Date;

public class Utils {
	
	//求未来日期离今天还剩的天数
	public static int getDaysByFuture (Date future){
		Date d = new Date();
		return (int)((future.getTime()-d.getTime()/(60*60*24*1000)));
	}
	
	//求过去日期离今天过去的天数
	public static int getDaysByDeparted (Date departed){
		Date d = new Date();
		return (int)((d.getTime()-departed.getTime()/(60*60*24*1000)));
	}
	
	//根据传入的参数获取该日期的月初日期，例如给定的日期为“2019-09-19 19:29:39”，返回“2019-09-01 00:00:00”
	/*public static Date getDateByMonthInit (Date src) {
		return ;
	}*/
	
	
	
	
	
	//根据传入的参数获取该日器的月末日期，例如给定的日期为“2019-09-19 19:29:39”，返回“2019-09-30 23:59:59”，注意月大月小以及闰年。
	/*public static Date getDateByMonthLast(Date src) {
		
	}*/
	
	
	
	
	//根据传入的日期获取年龄
	public static int getAge (Date src) {
		return 0;
	}
	
}
