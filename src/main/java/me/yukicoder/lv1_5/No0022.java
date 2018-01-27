package me.yukicoder.lv1_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * 「(」と「)」のみで構成されるN文字の文字列が与えられ、さらに整数値K (1≤K≤N)が与えられる。
 * このとき、K番目の文字と対応する文字の箇所の番目を求めてください。
 * 与えられる文字列は、すべての文字で括弧の対応があると保証されるとする。
 * 
 * (をスタックで保持しておいて、対応する）が来たら、対応する番目のマッピング情報を格納
 * 
 */

public class No0022 {
	public static void main(String[] args) {
		try (BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in))) {
	        String[] N = br.readLine().split(" ");
	        int cntString = Integer.parseInt(N[0]);
	        int index = Integer.parseInt(N[1]);
	        String[] str = br.readLine().split("");

	        Deque<Integer> deq = new LinkedList<>();
	        Map<Integer, Integer> map = new HashMap<>();
	        
	        for (int i = 0; i < cntString; i++) {
	        	if (str[i].equals("(")) {
	        		deq.addFirst(i);
	        	}
	        	else {
	        		int j = deq.removeFirst();
	        		map.put(i, j);
	        		map.put(j, i);
	        	}
	        }
	        
	        System.out.println(map.get(index - 1) + 1);
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
}