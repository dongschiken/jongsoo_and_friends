
import java.util.Scanner;

public class swea_14692_통나무자르기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 1; i <= t; i++) {
			int num = sc.nextInt();
			System.out.println("#" + i + " " + ((num % 2 == 0) ? "Alice" : "bob"));
		}
	}
}
