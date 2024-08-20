package solved;

import java.util.Arrays;
import java.util.Scanner;

public class SWEA_1979_어디에단어가들어갈수있을까 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int test_case = 1; test_case <= T; test_case++) {
			int N = sc.nextInt();
			int K = sc.nextInt();
			
			int[][] map = new int[N + 1][N + 1];
			for (int i = 0; i < N + 1; i++) {
				map[N][i] = 0;
				map[i][N] = 0;
			}
			
			for (int r = 0; r < N; r++) {
				for (int c = 0; c < N; c++) {
					map[r][c] = sc.nextInt();
				}
			}
			
			int sum = 0;
			int cnt1 = 0;
			
			for (int r = 0; r < N + 1; r++) {
				cnt1 = 0;
				for (int c = 0; c < N + 1; c++) {
					if (map[r][c] == 1) {
						cnt1++;
					}
					if (map[r][c] != 1) {
						if (cnt1 == K) {
							cnt1 = 0;
							sum++;
						}
						cnt1 = 0;
					}
				}
			}
			
			cnt1 = 0;
			for (int c = 0; c < N + 1; c++) {
				cnt1 = 0;
				for (int r = 0; r < N + 1; r++) {
					if (map[r][c] == 1) {
						cnt1++;
					}
					if (map[r][c] != 1) {
						if (cnt1 == K) {
							cnt1 = 0;
							sum++;
						}
						cnt1 = 0;
					}
				}
			}
			
			System.out.println("#" + test_case + " " + sum);
		}
	}
}
/*
 */
