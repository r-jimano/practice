package jp.paiza.poh.logic_summoner.challenges;

import java.util.*;
import java.util.Map.Entry;

public class logics_skill_4004 {
    @SuppressWarnings("resource")
    public static void main(String args[]) throws Exception {
	Scanner sc = new Scanner(System.in);
	int cnt = sc.nextInt();
	Map<Integer, String> map = new TreeMap<>();

	for (int i = 0; i < cnt; i++) {
	    int id = sc.nextInt();
	    String word = sc.next();

	    map.computeIfPresent(id, (k, v) -> map.get(id) + word);
	    map.putIfAbsent(id, word);
	}

	for (Entry<Integer, String> entry : map.entrySet()) {
	    System.out.println(entry.getKey() + " " + entry.getValue());
	}
    }
}
