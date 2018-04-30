package jp.paiza.poh.moshijo.challenges;

import java.util.*;

public class moshijo_character_6 {
    @SuppressWarnings("resource")
    public static void main(String args[]) throws Exception {
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
	int[] c = new int[N];
	int[] r = new int[N];

	for (int i = 0; i < N; i++) {
	    c[i] = sc.nextInt();
	}
	for (int i = 0; i < N; i++) {
	    r[i] = sc.nextInt();
	}

	for (int i = 0; i < N; i++) {
	    StringBuilder sb = new StringBuilder();
	    for (int j = 0; j < N; j++) {
		sb.append(c[j] + r[i] + " ");
	    }
	    System.out.println(sb.toString().trim());
	}

    }
}
