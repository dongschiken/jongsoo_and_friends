package week_04;

import java.util.Scanner;

public class SWEA_4047_영준이의카드카운팅_진종수 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int tc = 1;

		while (tc <= t) {
			String str = sc.next();

			int[] s = new int[14];
			int[] d = new int[14];
			int[] h = new int[14];
			int[] c = new int[14];
			int scount = 0;
			int dcount = 0;
			int hcount = 0;
			int ccount = 0;
			boolean error = false;
			for (int a = 0; a < str.length(); a += 3) {
				int num = (str.charAt(a + 1) - '0') * 10 + str.charAt(a + 2) - '0';

				if (str.charAt(a) == 'S') {
					if (s[num] > 0) {
						error = true;
						break;
					}
					s[num]++;
					scount++;
				} else if (str.charAt(a) == 'D') {
					if (d[num] > 0) {
						error = true;
						break;
					}
					d[num]++;
					dcount++;
				} else if (str.charAt(a) == 'H') {
					if (h[num] > 0) {
						error = true;
						break;
					}
					h[num]++;
					hcount++;
				} else if (str.charAt(a) == 'C') {
					if (c[num] > 0) {
						error = true;
						break;
					}
					c[num]++;
					ccount++;
				}
			}
			if (error)
				System.out.printf("#%d ERROR\n", tc);
			else
				System.out.printf("#%d %d %d %d %d\n", tc, 13 - scount, 13 - dcount, 13 - hcount, 13 - ccount);
			tc++;
		}
	}

}
