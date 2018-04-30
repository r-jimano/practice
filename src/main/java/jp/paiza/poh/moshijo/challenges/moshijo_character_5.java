package jp.paiza.poh.moshijo.challenges;

import java.util.*;

public class moshijo_character_5 {
    @SuppressWarnings("resource")
    public static void main(String args[]) throws Exception {
	Scanner sc = new Scanner(System.in);
	int[] arr = new int[10];

	for (int i = 0; i < 10; i++) {
	    arr[i] = sc.nextInt();
	}
	String code = sc.next();
	String[] sArray = sc.next().split("");

	if (code.equals("encode")) {
	    for (int i = 0; i < sArray.length; i++) {
		int num = Integer.parseInt(sArray[i]);
		System.out.print(arr[num]);
	    }
	} else {
	    for (int i = 0; i < sArray.length; i++) {
		int num = Integer.parseInt(sArray[i]);
		for (int j = 0; j < arr.length; j++) {
		    if (arr[j] == num)
			System.out.print(j);
		}
	    }
	}
	System.out.println();
    }
}
