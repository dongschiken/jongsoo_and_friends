package baekjoonGold;

import java.util.Scanner;

//dfs, 그러나 시간초과..

public class Main2206_벽부수고이동하기 {
	static int M, N, map[][], visited[][], wall, minDist;
	static int[] dx = { 0, 0, 1, -1 };
	static int[] dy = { 1, -1, 0, 0 };

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		N = sc.nextInt(); // 세로
		M = sc.nextInt(); // 가로
		sc.nextLine();

		map = new int[N][M];
		visited = new int[N][M];
		wall = 1;
		minDist = Integer.MAX_VALUE;

		for (int y = 0; y < N; y++) {
			char[] input = sc.nextLine().toCharArray();
			int x = 0;
			for (char c: input) {
				map[y][x] = Character.getNumericValue(c);
				x++;
			}
		}
		
		find(0, 0, 1);
		
		minDist = minDist == Integer.MAX_VALUE ? -1 : minDist;
		System.out.println(minDist);

	}

	public static void find(int x, int y, int dist) {
		if (x == M - 1 && y == N - 1) {
			minDist = Math.min(minDist, dist);
			return;
		} else {
			for (int d = 0; d < 4; d++) {
				int nx = x + dx[d];
				int ny = y + dy[d];

				if (wall == 1 && 0 <= nx && nx < M && 0 <= ny && ny < N 
						&& visited[ny][nx] == 0 && map[ny][nx] == 1
						) {
					wall--;
					visited[ny][nx] = 1;
					find(nx, ny, dist + 1);
					wall++;
					visited[ny][nx] = 0;
					continue;
				} else if (0 <= nx && nx < M && 0 <= ny && ny < N 
						&& visited[ny][nx] == 0 && map[ny][nx] == 0) {
					visited[ny][nx] = 1;
					find(nx, ny, dist + 1);
					visited[ny][nx] = 0;
					continue;
				}
				if (d == 3) {
					return;
				}
			}
		}
	}

}
