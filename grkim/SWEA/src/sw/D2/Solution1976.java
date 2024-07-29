package sw.D2;

import java.util.Scanner;

public class Solution1976 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int t = 1; t <= T; t++) {
			int h1 = sc.nextInt();
			int m1 = sc.nextInt();
			int h2 = sc.nextInt();
			int m2 = sc.nextInt();

			int mm = m1 + m2;
			int hr = h1 + h2;

			if (mm >= 60) {
				mm = mm % 60;
				hr += 1;
			}

			hr %= 12;
			
			if (hr == 0 || hr == 24) {
				hr = 12;
			}
			System.out.println("#" + t + " " + hr + " " + mm);

		}

	}

}
