package sweaD3;

// https://swexpertacademy.com/main/code/userProblem/userProblemDetail.do?contestProbId=AWlTKTUqCN8DFAVS&categoryId=AWlTKTUqCN8DFAVS&categoryType=CODE&&&

import java.util.Scanner;

public class Solution7236_저수지의물의총깊이구하기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		//W이면 1로 받음 
		for (int t = 1; t <= T; t++) {
			int N = sc.nextInt();
			int[][] arr = new int[N + 2][N + 2];

			for (int y = 1; y <= N; y++) {
				for (int x = 1; x <= N; x++) {
					if (sc.next().equals("W")) {
						arr[y][x] = 1;
					}
				}
			}

			int[] dx = { -1, -1, -1, 0, 1, 1, 1, 0 };
			int[] dy = { 0, -1, 1, -1, -1, 0, 1, 1 };

			int max = 0;
			//1이면 팔방 탐색, 다 더함 (G는 0이니까)
			for (int y = 1; y <= N; y++) {
				for (int x = 1; x <= N; x++) {
					if (arr[y][x] == 1) {
						int cnt = 0;
						for (int d = 0; d < 8; d++) {
							int nx = x + dx[d];
							int ny = y + dy[d];
							cnt += arr[ny][nx];
						}
						if (cnt == 0) {
							cnt = 1;
						}
						//max값 업데이트
						max = Math.max(max, cnt);
					}
				}

			}
			System.out.println("#" + t + " " + max);

		}
	}

}
