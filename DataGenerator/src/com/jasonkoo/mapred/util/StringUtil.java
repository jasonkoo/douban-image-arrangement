package com.jasonkoo.mapred.util;

import org.apache.commons.lang.StringUtils;

public class StringUtil {
	public static boolean isEmpty(String string){
		return StringUtils.isEmpty(string) || "null".equalsIgnoreCase(string);
	}
}
