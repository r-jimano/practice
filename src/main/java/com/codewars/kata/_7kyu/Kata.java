package com.codewars.kata._7kyu;

public class Kata {

	public static String HighAndLow(String numbers) {
		java.util.Scanner sc = new java.util.Scanner(numbers);
	    int max = Integer.MIN_VALUE;
	    int min = Integer.MAX_VALUE;
		
	    while(sc.hasNextInt()) {
	    	int tmp = sc.nextInt();
	    	max = Math.max(tmp, max);
	    	min = Math.min(tmp, min);
	    }
		return String.format("%d %d", max, min);
	}
	
	// numbersをsplitした配列のストリームからmapToIntで最大・最小を取得
	// もしくはIntSummaryStatisticsで取得「
}