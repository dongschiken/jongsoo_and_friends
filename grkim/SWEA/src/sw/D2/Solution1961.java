package sw.D2;

import java.util.Scanner;
import java.util.Arrays;

public class Solution1961 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			int[][] nums = new int[N][N];
			int[][] nums90 = new int[N][N];
			int[][] nums180 = new int[N][N];
			int[][] nums270 = new int[N][N];

			for (int y = 0; y < N; y++) {
				for (int x = 0; x < N; x++)
					nums[y][x] = sc.nextInt();
			}

			nums90 = turn90(nums, N);
			nums180 = turn90(nums90, N);
			nums270 = turn90(nums180, N);

			System.out.println("#" + tc);
			for (int y = 0; y < N; y++) {
				for (int x = 0; x < N; x++) {
					System.out.print(nums90[y][x]);
				}
				System.out.print(" ");
				
				for (int x = 0; x < N; x++) {
					System.out.print(nums180[y][x]);
				}
				System.out.print(" ");
				for (int x = 0; x < N; x++) {
					System.out.print(nums270[y][x]);
				}
				System.out.println();
				
			}

		}

	}

	public static int[][] turn90(int[][] nums, int N) {
		int[][] res = new int[N][N];

		for (int y = 0; y < N; y++) {
			for (int x = 0; x < N; x++) {
				res[x][N - 1 - y] = nums[y][x];
			}
		}

		return res;

	}

}
