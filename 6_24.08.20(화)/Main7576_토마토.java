package baekjoonGold;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/* 동영 풀이 참조함 
 큐에다가 초기 1인 좌표 넣기 
 사방 탐색하면서 0이면 주변토마토 +1 하고 다시 큐에 넣기 
 모두 탐색이 끝날때까지 돌기
 */

public class Main7576_토마토 {
	public static int[][] box;
	public static Queue<int[]> queue;
	static int[] dx = { 0, 0, 1, -1 };
	static int[] dy = { 1, -1, 0, 0 };

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		int N = sc.nextInt();

		box = new int[N][M];
		queue = new LinkedList<>();

		for (int y = 0; y < N; y++) {
			for (int x = 0; x < M; x++) {
				box[y][x] = sc.nextInt();
				if (box[y][x] == 1)
					queue.offer(new int[] { x, y });
			}
		}

		bfs();
		int max = 0;

		for (int y = 0; y < N; y++) {
			for (int x = 0; x < M; x++) {
				if (box[y][x] == 0) {
					System.out.println(-1);
					return;
				}
				max = Math.max(max, box[y][x]);
			}
		}
		System.out.println(max - 1);

	}

	private static void bfs() {

		while (!queue.isEmpty()) {
			int[] cur = queue.poll();
			int x = cur[0];
			int y = cur[1];

			for (int d = 0; d < 4; d++) {
				int nx = x + dx[d];
				int ny = y + dy[d];

				if (0 <= nx && nx < box[0].length && 0 <= ny && ny < box.length && box[ny][nx] == 0) {
					box[ny][nx] = box[y][x] + 1;
					queue.offer(new int[] { nx, ny });
				}

			}

		}

	}

}