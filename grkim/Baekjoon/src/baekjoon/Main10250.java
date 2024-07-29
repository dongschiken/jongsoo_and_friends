package baekjoon;

import java.util.Scanner;

public class Main10250 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int tc = 0; tc < T; tc++) {
			int H = sc.nextInt();
			int W = sc.nextInt();
			int N = sc.nextInt();

			if (N % H == 0) {
				System.out.printf("%d%02d", H, N / H);
			} else {
				System.out.printf("%d%02d", N % H, N / H + 1);
			}
			System.out.println();
		}
	}

}
