package sweaD2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution12721_파리퇴치3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		int[] dxP = { 0, 0, 1, -1 };
		int[] dyP = { 1, -1, 0, 0 };

		int[] dxX = { 1, 1, -1, -1 };
		int[] dyX = { 1, -1, 1, -1 };

		for (int t = 1; t <= T; t++) {
			int N = sc.nextInt();
			int M = sc.nextInt();

			int[][] arr = new int[N][N];

			List<Integer> sums = new ArrayList<>();

			for (int y = 0; y < N; y++) {
				for (int x = 0; x < N; x++) {
					arr[y][x] = sc.nextInt();
				}
			}
			
			for (int y = 0; y < N; y++) {
				for (int x = 0; x < N; x++) {
					int sum = arr[y][x];
					for (int d = 0; d < 4; d++) {
						int nx = x;
						int ny = y;
						for (int m = 0; m < M - 1; m++) {
							nx = nx + dxP[d];
							ny = ny + dyP[d];
							if (0 <= nx && nx < N && 0 <= ny && ny < N) {
								sum += arr[ny][nx];
							}

						}
					}
					sums.add(sum);

					sum = arr[y][x];

					for (int d = 0; d < 4; d++) {
						int nx = x;
						int ny = y;
						for (int m = 0; m < M - 1; m++) {
							nx = nx + dxX[d];
							ny = ny + dyX[d];
							if (0 <= nx && nx < N && 0 <= ny && ny < N) {
								sum += arr[ny][nx];
							}

						}
					}
					sums.add(sum);
				}
			}

			int max = Integer.MIN_VALUE;

			for (int s : sums) {
				max = Math.max(max, s);
			}
			System.out.println("#" + t + " " + max);

		}

	}

}
