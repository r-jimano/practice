package jp.atcoder.Beginner;

import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next() + sc.next();
        double num = Double.parseDouble(s);
        int root = (int)Math.sqrt(num);

        System.out.println(num == Math.pow(root, 2) ?  "Yes" : "No");
    }
}
