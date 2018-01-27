package me.yukicoder.wip;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class No0495_2 {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			String[] str = br.readLine().split("\\)");
			Map<String, Integer> map = new HashMap<>(); 
			String right = "(*^^";
			String left = "(^^*";
			
			// TODO substringでまわす
			for (String s: str) {
				map.computeIfPresent(s, (k,v) -> map.get(s) + 1);
				map.putIfAbsent(s, 1);
			}
			int cntLeft = map.get(left) !=null ? map.get(left): 0;
			int cntRight= map.get(right) !=null ? map.get(right): 0;
			System.out.println(cntLeft + " " + cntRight);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}