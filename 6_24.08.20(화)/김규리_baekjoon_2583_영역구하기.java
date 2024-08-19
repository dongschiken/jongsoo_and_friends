package baekjoonSilver;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Main2583_영역구하기 {
	static int M, N, K, map[][];
	static List<Integer> area;
	static int[] dx = { 0, 0, 1, -1 };
	static int[] dy = { 1, -1, 0, 0 };

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		M = sc.nextInt(); // 세로
		N = sc.nextInt(); // 가로
		K = sc.nextInt();

		map = new int[M][N];
		area = new LinkedList<>();

		for (int k = 0; k < K; k++) {
			int Ax = sc.nextInt();
			int Ay = sc.nextInt();
			int Bx = sc.nextInt();
			int By = sc.nextInt();

			for (int y = Ay; y < By; y++) {
				for (int x = Ax; x < Bx; x++) {
					map[y][x] = 1;
				}
			}

		}
		
		for (int y = 0; y < M; y++) {
			for (int x = 0; x < N; x++) {
				if (map[y][x] == 0) {
					map[y][x] = 1;
					startCount(x, y);
				}
			}
		}
		
		Collections.sort(area);
		
		System.out.println(area.size());
		for (int a: area) {
			System.out.print(a + " ");
		}
	}

	private static void startCount(int x, int y) {
		Queue<int[]> queue = new LinkedList<>();
		queue.add(new int[] { x, y });

		int cnt = 1;
		while (!queue.isEmpty()) {
			int[] cur = queue.poll();
			int nx = cur[0], ny = cur[1];
			for (int d = 0; d < 4; d++) {
				nx = cur[0] + dx[d];
				ny = cur[1] + dy[d];
				if (0 <= nx && nx < N && 0 <= ny && ny < M && map[ny][nx] == 0) {
					map[ny][nx] = 1;
					queue.add(new int[] {nx, ny});
					cnt++;
				}
			}
		}

		area.add(cnt);
	}

}
