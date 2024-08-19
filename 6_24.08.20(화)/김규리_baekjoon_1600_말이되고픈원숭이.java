package baekjoonGold;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//벽 부수기랑 비슷

public class Main1600_말이되고픈원숭이 {
	static int K, W, H, map[][], visited[][][], minDist;

	static int[] mx = { 0, 0, 1, -1 };
	static int[] my = { 1, -1, 0, 0 };
	static int[] hx = { -2, -1, 1, 2, -2, -1, 2, 1 };
	static int[] hy = { -1, -2, -2, -1, 1, 2, 1, 2 };

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		K = sc.nextInt(); // 점프 수
		W = sc.nextInt(); // 가로
		H = sc.nextInt(); // 세로
		map = new int[H][W];
		visited = new int[H][W][K+1];

		for (int y = 0; y < H; y++) {
			for (int x = 0; x < W; x++)
				map[y][x] = sc.nextInt();
		}
		count();
		
		System.out.println(minDist);

	}

	private static void count() {

		Queue<int[]> queue = new LinkedList<>();
		queue.add(new int[] { 0, 0, 0 });

		while (!queue.isEmpty()) {
			
			int[] cur = queue.poll();
			int x = cur[0], y = cur[1], jump = cur[2];

			//도착하면 끝냄 
			if (x == W - 1 && y == H - 1) {
				minDist = visited[y][x][jump];
				return;
			}

			//말 점프 남았으면 사용 
			if (jump < K) {
				for (int d = 0; d < 8; d++) {
					int nx = x + hx[d], ny = y + hy[d];
					if (0 <= nx && nx < W && 0 <= ny && ny < H 
						&& map[ny][nx] == 0 && visited[ny][nx][jump + 1] == 0) {
						visited[ny][nx][jump+1] = visited[y][x][jump] + 1;
						queue.add(new int[] { nx, ny, jump + 1 });
					}

				}
			}

			//원숭이 점프 사용 
			for (int d = 0; d < 4; d++) {
				int nx = x + mx[d], ny = y + my[d];
				if (0 <= nx && nx < W && 0 <= ny && ny < H 
						&& map[ny][nx] == 0 && visited[ny][nx][jump] == 0) {
					visited[ny][nx][jump] = visited[y][x][jump] + 1;
					queue.add(new int[] { nx, ny, jump });
				}
			}

		}
		minDist = -1;

	}

}
