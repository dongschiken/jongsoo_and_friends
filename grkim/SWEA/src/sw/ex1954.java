package sw;

import java.util.Arrays;
import java.util.Scanner;

public class ex1954 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int test_case = 1; test_case <= T; test_case++) {

			int N = sc.nextInt();
			int[][] snail = new int[N][N];

			int N2 = 1;

			for (int start = 0; start < (N + 1) / 2; start++) {
				int len = N - 2 * start; // 가로 길이
				int x = start;
				int y = start;

				for (int n = 0; n < len - 1; n++) {
					snail[y][x++] = N2++;
				}
				for (int n = 0; n < len - 1; n++) {
					snail[y++][x] = N2++;
				}
				for (int n = 0; n < len - 1; n++) {
					snail[y][x--] = N2++;
				}
				for (int n = 0; n < len - 1; n++) {
					snail[y--][x] = N2++;
				}

				if (len == 1) {
					snail[y][x] = N2;
				}

			}
			System.out.println("#" + test_case);
			for (int[] s : snail) {
				for (int n : s)
					System.out.print(n + " ");
				System.out.println();
			}

		}

	}
}
