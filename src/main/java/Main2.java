import java.util.*;

public class Main2 {
    @SuppressWarnings("resource")
    public static void main(String args[]) throws Exception {
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
	for (int i = 0; i < N; i++) {
	    String s = sc.next();
	    String[] array = s.split(",");
	    System.out.println("hello = " + array[0] + " , world = " + array[1]);
	}
    }
}