package baekjoonGold;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main2206_벽부수고이동하기_1 {
	static int M, N, map[][], minDist, visited[][], dist[][][];
	static int[] dx = { 0, 0, 1, -1 };
	static int[] dy = { 1, -1, 0, 0 };

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		N = sc.nextInt(); // 세로
		M = sc.nextInt(); // 가로
		sc.nextLine();

		map = new int[N][M];
		dist = new int[N][M][2];
		minDist = Integer.MAX_VALUE;

		for (int y = 0; y < N; y++) {
			char[] input = sc.nextLine().toCharArray();
			int x = 0;
			for (char c : input) {
				map[y][x] = Character.getNumericValue(c);
				x++;
			}
		}

		find();

		minDist = minDist == Integer.MAX_VALUE ? -1 : minDist;
		System.out.println(minDist);

	}

	public static void find() {
		Queue<int[]> queue = new LinkedList<>();
		queue.add(new int[] { 0, 0, 0 }); // x, y, wall
		visited = new int[N][M];
		dist[0][0][0] = 1;

		while (!queue.isEmpty()) {
			int[] cur = queue.poll();
			int curX = cur[0], curY = cur[1],  wall = cur[2];
		
			if (curX == M - 1 && curY == N - 1) {
				minDist = dist[curY][curX][wall];
				return;
			}

			for (int d = 0; d < 4; d++) {
				int nx = curX + dx[d];
				int ny = curY + dy[d];

				if (0 <= nx && nx < M && 0 <= ny && ny < N) {
					if (map[ny][nx] == 0 && dist[ny][nx][wall] == 0) {
						dist[ny][nx][wall] = dist[curY][curX][wall] + 1;
						queue.add(new int[] { nx, ny,  wall });
					}

					if (map[ny][nx] == 1 && wall == 0 && dist[ny][nx][1] == 0) {
						dist[ny][nx][1] = dist[curY][curX][wall] + 1;
						queue.add(new int[] { nx, ny, 1 });
					}
				}

			}
		}
	}
}
