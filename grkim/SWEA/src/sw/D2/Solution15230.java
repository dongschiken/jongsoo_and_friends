package sw.D2;

import java.util.Scanner;

public class Solution15230 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int t = 1; t <= T; t++) {
			char[] st = sc.next().toCharArray();

			int cnt = 0;
			int a = 'a';

			for (int cha : st) {
				if (a == cha) {
					cnt++;
					a++;
				} else {
					break;
				}

			}

			System.out.println("#" + t + " " + cnt);

		}

	}

}
