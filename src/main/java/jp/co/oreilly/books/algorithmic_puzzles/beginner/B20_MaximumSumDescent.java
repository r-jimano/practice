package jp.co.oreilly.books.algorithmic_puzzles.beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 山下りの最大和
 */
public class B20_MaximumSumDescent {
    public static void main(String[] args) {
	try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
	    int cntDepth = Integer.parseInt(br.readLine());
	    int[] sum = new int[cntDepth];

	    for (int i = 0; i < cntDepth; i++) {
		String[] str = br.readLine().split(" ");
		int[] tmp = new int[str.length];
		for (int j = 0; j < str.length; j++) {
		    tmp[j] = Integer.parseInt(str[j]);
		}
		sum = solveDynamic(tmp, sum);
	    }
	    System.out.println(Arrays.stream(sum).max().getAsInt());
	} catch (IOException e) {
	    e.printStackTrace();
	}
    }

    static int[] solveDynamic(int[] tmp, int[] sum) {
	int[] ret = Arrays.copyOf(sum, tmp.length);
	for (int i = 0; i < tmp.length; i++) {
	    if (i == 0) {
		ret[i] += tmp[i];
	    } else if (i == tmp.length - 1) {
		ret[i] = sum[i - 1] + tmp[i];
	    } else {
		ret[i] = Math.max(tmp[i] + sum[i - 1], tmp[i] + sum[i]);
	    }
	}
	return ret;
    }

}
