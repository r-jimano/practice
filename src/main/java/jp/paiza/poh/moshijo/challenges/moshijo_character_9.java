package jp.paiza.poh.moshijo.challenges;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;

public class moshijo_character_9 {
    @SuppressWarnings("resource")
    public static void main(String args[]) throws Exception {
	Scanner sc = new Scanner(System.in);
	int input = sc.nextInt();
	BigDecimal num = new BigDecimal(input);
	int cnt = num.precision();

	for (int i = 0; i < cnt + 1; i++) {
	    BigDecimal tmp = num.setScale(-1 * i, RoundingMode.HALF_UP);
	    num = num.compareTo(tmp) < 0 ? tmp : num;
	}
	System.out.println(num.intValue());
    }
}
