package jp.paiza.mondai.skillcheck_archive;

import java.util.*;
import java.util.stream.IntStream;

public class MaxRange {
  public static void main(String[] args) throws Exception {
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int k = sc.nextInt();// キャンペーンの日数k
    int[] arr = new int[N];// n日分の訪問者数
    IntStream.range(0, N).forEachOrdered(n -> arr[n] = sc.nextInt());

    List<Integer> list = new ArrayList<>();// 候補期間（仮）の訪問者数
    int tmp = Arrays.stream(arr).limit(k).sum();
    list.add(tmp);
    int tmpmax = tmp;
    // 2回目以降はしゃくとり法で
    for (int i = 0; i < N - k; i++) {
      tmp = tmp - arr[i] + arr[i + k];
      list.add(tmp);
      tmpmax = Math.max(tmp, tmpmax);
    }

    // キャンペーンを行った期間の候補数と、候補の中で最も早い開始日
    int max = tmpmax;
    System.out.println(list.stream().filter(n -> n == max).count() + " " + (list.indexOf(max) + 1));
  }

}
