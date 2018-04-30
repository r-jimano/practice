package jp.paiza.poh.enkoi;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Poh4_3 {
    public static void main(String args[]) throws Exception {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String readLineArray[] = br.readLine().trim().split(" ");
	int t = Integer.parseInt(readLineArray[0]);
	int n = Integer.parseInt(readLineArray[1]);
	int cell[] = new int[n];
	int tmp = 0;

	for (int i = 0; i < n; i++) {
	    cell[i] = Integer.parseInt(br.readLine());
	}

	// しゃくとり法
	for (int i = 0; i < t; i++) {
	    tmp += cell[i];
	}
	int max = tmp;
	for (int i = 0; i < n - t; i++) {
	    tmp += cell[i + t] - cell[i];
	    max = Math.max(max, tmp);
	}
	System.out.println(max);
    }
}
