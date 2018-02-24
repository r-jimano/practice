package jp.paiza.moshijo;

import java.util.*;

public class moshijo_character_8 {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		String[] input = sc.next().split("/");
		String[] absPath = sc.next().split("/");

		// 一番先頭の/は空になってしまう。ややこしくならないように、取り除いて考える
		List<String> l = new ArrayList<>();
		for (String path : input) {
			l.add(path);
		}
		l.removeIf(e -> e.isEmpty());

		for (String path : absPath) {
			if (path.equals("..")) {
				if (l.size() > 0) {
					l.remove(l.size() - 1);
				}
			} else if (!path.equals(".")) {
				l.add(path);
			}
		}
		System.out.println('/' + String.join("/", l));
	}
}
