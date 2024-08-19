package baekjoonGold;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main2589_보물섬 {

	static int N, M;
	static char map[][];
	static int[] dx = { 0, 0, 1, -1 };
	static int[] dy = { 1, -1, 0, 0 };

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();
		M = sc.nextInt();
		sc.nextLine();

		map = new char[N][M];

		for (int n = 0; n < N; n++) {
			map[n] = sc.nextLine().toCharArray();
		}

		int result = 0; // 최단 거리 중 가장 긴 길이

		// L인 지점에서 실행 
		for (int y = 0; y < N; y++) {
			for (int x = 0; x < M; x++) {
				if (map[y][x] == 'L') {
					int time = search(x, y);
					result = Math.max(result, time);

				}
			}
		}

		System.out.println(result);

	}

	private static int search(int x, int y) {

		Queue<int[]> queue = new LinkedList<>();
		boolean[][] visited = new boolean[N][M];
		queue.add(new int[] { x, y, 0 }); // 큐에 초기 위치와 시작 거리 저장
		visited[y][x] = true;

		int result = 0;

		while (!queue.isEmpty()) {
			int[] curr = queue.poll();
			int cx = curr[0], cy = curr[1], dist = curr[2]; // 큐에서 현재 위치와 거리 꺼내기 

			for (int i = 0; i < 4; i++) {
				int nx = cx + dx[i];
				int ny = cy + dy[i];
				if (0 <= nx && nx < M && 0 <= ny && ny < N && !visited[ny][nx] && map[ny][nx] == 'L') {
					visited[ny][nx] = true;
					queue.add(new int[] { nx, ny, dist + 1 }); // 새로운 위치와 거리를 큐에 추가
					result = Math.max(result, dist + 1); // 가장 먼 거리 업데이트

				}
			}
		}
		return result;
	}

}
