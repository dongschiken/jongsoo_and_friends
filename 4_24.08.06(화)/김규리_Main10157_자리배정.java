package study_0806;

import java.util.Scanner;

public class Main10157_자리배정 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int C = sc.nextInt();
		int R = sc.nextInt();
		int K = sc.nextInt();

		if (C * R < K) {
			System.out.println(0);
			return;
		}

		int[][] seats = new int[R][C];

		int cnt = 1;
		int nx = 0, ny = 0, d = 0, x = 0, y = 0;

		int[] dx = { 0, 1, 0, -1 };
		int[] dy = { 1, 0, -1, 0 };

		while (cnt <= K) {
			seats[y][x] = cnt;
			if (cnt == K) {
				System.out.println((x + 1) + " " + (y + 1));
				return;
			}
			cnt++;

			nx = x + dx[d];
			ny = y + dy[d];

			if (nx < 0 || nx >= C || ny < 0 || ny >= R || seats[ny][nx] != 0) {
				d = (d + 1) % 4;
				nx = x + dx[d];
				ny = y + dy[d];

			}
			
			x = nx;
			y = ny;
		}

	}
}
