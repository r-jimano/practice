package jp.paiza.poh.logic_summoner.challenges;
import java.util.*;
 
public class logics_skill_4001 {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		double attack1 = sc.nextDouble();
		int price1 = sc.nextInt();
		double attack2 = sc.nextDouble();
		int price2 = sc.nextInt();
		System.out.println((attack1 / price1) > (attack2 / price2) ? price1 : price2);
	}
}