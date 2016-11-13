package com.jasonkoo.hive.table;

import java.text.ParseException;
import java.util.Date;



public class RandomDateGenerator {

	public static Date generate(String beginDate, String endDate){
		try {
			Date begin = DateUtil.stringToDate(beginDate, DateUtil.DATE_PATTERN);
			Date end = DateUtil.stringToDate(endDate, DateUtil.DATE_PATTERN);
			if(begin.getTime() >= end.getTime()){
				return null;
			}
			
			long date = random(begin.getTime(), end.getTime());
			return new Date(date);
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
		
	}
	
	private static long random(long begin, long end){
		long rtn = begin + Math.round((Math.random() * (end - begin)));
		
		if(rtn == begin || rtn == end){
			return random(begin, end);
		}
		
		return rtn;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i = 0; i < 10; i++)
		{
			Date randDate = generate("20140410", "20140421");
			System.out.println(DateUtil.dateToString(randDate, DateUtil.DATE_PATTERN));
		}
	}
}
