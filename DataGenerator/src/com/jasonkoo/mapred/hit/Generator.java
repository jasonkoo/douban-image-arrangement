package com.jasonkoo.mapred.hit;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Generator {
	

	
	public static void main(String[] args) throws IOException {
		String path = "C:\\Users\\gulei2\\Desktop\\jar-test\\hit-mapred.txt";
		FileWriter fw = new FileWriter(path);
		PrintWriter pw = new PrintWriter(fw);
		
		
		for (int i = 0; i < 200000; i++) {
			HitDataEntry hde = DataGenerator.getHitDataEntry();
			String line = hde.toStringForParsing();
			pw.println(line);			
		}		
		pw.close();
	}
}
