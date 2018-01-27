package me.yukicoder.lv1;
public class No188 {
	public static void main(String[] args) {
		int i = 0;
		int cnt = 0;
		int[] day_of_month = {31,28,31,30,31,30,31,31,30,31,30,31};
		for(int d : day_of_month){
			i++;
			for(int j = 1; j <= d; j++){
				if(i == (j / 10) + (j % 10)) cnt++;//日にちを10の位と1の位に分離して数字和を出す
			}
		}
		System.out.println(cnt);
	}
}