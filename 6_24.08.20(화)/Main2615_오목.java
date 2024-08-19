package study_0820;

import java.util.Scanner;

/*
문제 : Baekjoon-2615-실버1
메모리 : 19444 KB
시간 :  208 ms
코드길이 : 1101 B
설명 : 오직 오른쪽으로만 탐색, 탐색 방향 반대편에 같은 숫자 있으면 탈출

 */

public class Main2615_오목 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[][] go = new int[19][19];

		for (int y = 0; y < 19; y++) {
			for (int x = 0; x < 19; x++) {
				go[y][x] = sc.nextInt();
			}
		}

		int[] dx = { 0, 1, 1, 1 };
		int[] dy = { 1, 0, 1, -1 };

		int ans = 0;
		int x = 0;
		int y = 0;

		done: for (y = 0; y < 19; y++) {
			for (x = 0; x < 19; x++) {

				if (go[y][x] == 1 || go[y][x] == 2) {
					int cnt;
					for (int d = 0; d < 4; d++) {
						cnt = 1;
						int nx = x + dx[d];
						int ny = y + dy[d];
						if (0 <= x - dx[d] && x - dx[d] < 19 && 0 <= y - dy[d] && y - dy[d] < 19
								&& go[y - dy[d]][x - dx[d]] == go[y][x]) {
							continue;
						}

						while (0 <= nx && nx < 19 && 0 <= ny && ny < 19 && go[ny][nx] == go[y][x]) {
							nx += dx[d];
							ny += dy[d];
							cnt++;

						}

						if (cnt == 5) {
							ans = go[y][x] == 1 ? 1 : 2;
							break done;
						}

					}
				}
			}
		}
		System.out.println(ans);
		if (ans != 0) {
			System.out.println((y + 1) + " " + (x + 1));
		}
	}

}
