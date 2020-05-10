package org.coursera.learn.introcs.week2;

public class BandMatrix {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int width = Integer.parseInt(args[1]);

        for (int i = 0; i < n; i++) { 
            for (int j = 0; j < n; j++) {
                String tmp = (Math.abs(i - j) <= width) ? "*  " : "0  ";
                System.out.print(tmp);
            }
            System.out.println();
        }

    }
}