package study_0813;

import java.util.Scanner;

public class Solution2805_농작물수확하기 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int t = 1; t <= T; t++) {
			int N = sc.nextInt();
			sc.nextLine();
			int[][] arr = new int[N][N];

			//분리해서 담기 
			for (int y = 0; y < N; y++) {
				char[] input = sc.nextLine().toCharArray();
				for (int x = 0; x < N; x++) {
					arr[y][x] = Character.getNumericValue(input[x]);
				}
			}
			
			int total = 0; 
			
			//다이아몬드
			for (int i = 0; i < N; i++) {
				int idx = Math.abs(i - N/2);
				for (int j = idx; j < N -idx; j++) {
					total += arr[i][j];
				}
			}
			
			System.out.println("#" + t + " " + total);

		}

	}

}
