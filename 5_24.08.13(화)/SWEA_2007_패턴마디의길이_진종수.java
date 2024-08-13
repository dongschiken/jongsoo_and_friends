package week_04;

import java.util.ArrayList;
import java.util.Scanner;

public class SWEA_2007_패턴마디의길이_진종수 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int tc = 1;
		while (tc <= t) {
			String str = sc.next();

			for (int i = 1; i <=10; i++) {
				if (str.substring(0, i).equals(str.substring(i, i * 2))) {
					System.out.printf("#%d %d\n", tc, i);
					break;
				}
			}
			tc++;
		}
	}

}
