package com.jasonkoo.hive.table;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

public class Generator {
	

	
	public static void main(String[] args) throws IOException {
		String path = "C:\\Users\\gulei2\\Desktop\\jar-test\\hive-table.txt";
		FileWriter fw = new FileWriter(path);
		PrintWriter pw = new PrintWriter(fw);
		
		for (int i = 0; i < 20000; i++) {
			 Date randDate = RandomDateGenerator.generate("20140601", "20140606");
			 String thedate = DateUtil.dateToString(randDate, DateUtil.DATE_PATTERN);
			 int id = i;
			 double price = RandomNumberGenerator.generateDouble(0, i);
			 int count = RandomNumberGenerator.generateInt(0, i);
			 pw.println(id + "\t" + price + "\t" + count + "\t" + thedate);			
		}		
		pw.close();
	}
}
