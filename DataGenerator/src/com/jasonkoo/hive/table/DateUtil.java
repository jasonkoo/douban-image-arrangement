package com.jasonkoo.hive.table;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {

	public final static String DATE_TIME_PATTERN = "yyyy-MM-dd HH:mm:ss";
	public final static String DATE_PATTERN = "yyyyMMdd";

	public static String dateToString(Date date, String pattern) {
		if (date != null) {
			SimpleDateFormat sdf = new SimpleDateFormat(pattern);
			return sdf.format(date);
		} else {
			return null;
		}
	}

	public static Date stringToDate(String dateStr, String pattern)
			throws ParseException {
		if (dateStr != null) {
			SimpleDateFormat sdf = new SimpleDateFormat(pattern);
			return sdf.parse(dateStr);
		} else {
			return null;
		}
	}
}
