package baekjoonGold;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main14502_연구소 {
	static int N, M, maxZeros, map[][], visitedZero[];
	static int[] dx = { 0, 0, 1, -1 };
	static int[] dy = { 1, -1, 0, 0 };
	static ArrayList<int[]> zeros, virus;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();
		M = sc.nextInt();
		map = new int[N][M];
		zeros = new ArrayList<>();
		virus = new ArrayList<>();
		maxZeros = Integer.MIN_VALUE;

		for (int y = 0; y < N; y++) {
			for (int x = 0; x < M; x++) {
				map[y][x] = sc.nextInt();
				if (map[y][x] == 0)
					zeros.add(new int[] { x, y });
				else if (map[y][x] == 2)
					virus.add(new int[] { x, y });
			}
		}
	
		visitedZero = new int[zeros.size()];

		count(0, 0);
		System.out.println(maxZeros);

	}

	static void count(int wall, int i) {
		if (wall == 3) {
			
			int[][] visited = new int[N][M];
			Queue<int[]> queue = new LinkedList<>();

					for (int[] v : virus) {
						int x = v[0], y = v[1];
						visited[y][x] = 1;
						queue.add(new int[] { x, y });

						while (!queue.isEmpty()) {
							
							int[] cur = queue.poll();
							for (int d = 0; d < 4; d++) {
								int nx = cur[0] + dx[d], ny = cur[1] + dy[d];
								if (0 <= nx && nx < M && 0 <= ny && ny < N && map[ny][nx] == 0
										&& visited[ny][nx] == 0) {
									visited[ny][nx] = 1;
									queue.add(new int[] { nx, ny });
								}

							}

						}

					}

			int cnt = 0;
			for (int y = 0; y < N; y++) {
				for (int x = 0; x < M; x++) {
					if (map[y][x] == 0 && visited[y][x] == 0)
						cnt ++;
				}
			}
			maxZeros = Math.max(maxZeros, cnt);
			return;

		}

		for (int j = i; j < zeros.size(); j++) {
			if (visitedZero[j] == 0) {
				visitedZero[j] = 1;
				int[] nWall = zeros.get(j);
				map[nWall[1]][nWall[0]] = 1;
				count(wall + 1, i + 1);
				visitedZero[j] = 0;
				map[nWall[1]][nWall[0]] = 0;
			}
		}

	}

}
