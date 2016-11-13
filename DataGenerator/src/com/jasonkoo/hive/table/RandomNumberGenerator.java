package com.jasonkoo.hive.table;

import java.util.Random;

public class RandomNumberGenerator {
	
	public static int generateInt(int min, int max){
		Random rand = new Random();
		int randomInt = rand.nextInt(max - min + 1) + min;
		return randomInt;
	}
	
	public static long generateLong(long min, long max){
		return  min + (long) ( Math.random() * ((max - min) + 1) );		
	}
	
	public static double generateDouble(double min, double max) {
		return min + Math.random() * ((max - min) + 1);
	}
	
	public static void main(String[] args) {
		for(int i = 0; i < 20; i++){
			//System.out.println(RandomNumberGenerator.generateInt(1, 10));
			System.out.println(RandomNumberGenerator.generateLong(2450, 2460));
		}
		
	}

}
