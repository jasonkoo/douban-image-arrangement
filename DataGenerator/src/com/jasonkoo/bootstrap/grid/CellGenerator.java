package com.jasonkoo.bootstrap.grid;

import com.jasonkoo.bootstrap.grid.digit.DigitToHTML;

public class CellGenerator {
	
	public static void main(String[] args) {
		int digits[] = {2, 0, 1, 5};
		String baseDir = "D:\\iCodebox\\douban\\bootstrap\\";
		String imgDir = "2015-items";
		DigitToHTML dth = new DigitToHTML(baseDir, imgDir);
		for(int i = 0; i < digits.length; i++) {
			System.out.println(dth.transform(digits[i]));
		}
		System.out.println(dth.getIndex());
		
		
	}
}
