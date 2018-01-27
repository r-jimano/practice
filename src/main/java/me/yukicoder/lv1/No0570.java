package me.yukicoder.lv1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeMap;


public class No0570 {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			TreeMap<Integer, String> map = new TreeMap<>();
			map.put(Integer.parseInt(br.readLine()), "A");
			map.put(Integer.parseInt(br.readLine()), "B");
			map.put(Integer.parseInt(br.readLine()), "C");

			while (map.values().size() != 0) {
				System.out.println(map.pollLastEntry().getValue());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
