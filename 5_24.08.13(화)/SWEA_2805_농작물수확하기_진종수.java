package week_04;

import java.util.Scanner;

public class SWEA_2805_농작물수확하기_2th {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int tc = 1;
		while (tc <= t) {
			int n = sc.nextInt();
			int[][] arr = new int[n][n];

			for (int i = 0; i < n; i++) {
				String str = sc.next(); // 배열 입력받기.
				for (int j = 0; j < n; j++) {
					arr[i][j] = str.charAt(j) - '0';
				}
			}
			int start = n / 2;
			int end = n / 2;
			int sum = 0;
			for (int i = 0; i < n; i++) {
				for (int j = start; j <= end; j++) {
					sum += arr[i][j];
				}
				if (i < n / 2) {
					start--;
					end++;
				} else {
					start++;
					end--;
				}

			}

			System.out.printf("#%d %d\n", tc, sum);
			tc++;
		}
	}
}
