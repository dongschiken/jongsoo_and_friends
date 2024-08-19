package baekjoonSilver;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Main2667_단지번호붙이기 {
	static int N, map[][], visited[][], cnt;
	static int[] dx = { 0, 0, 1, -1 };
	static int[] dy = { 1, -1, 0, 0 };
	static List<Integer> houses;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		sc.nextLine();
		map = new int[N][N];
		visited = new int[N][N];
		houses = new ArrayList<>();

		for (int y = 0; y < N; y++) {
			String st = sc.nextLine();
			for (int x = 0; x < N; x++) {
				map[y][x] = st.charAt(x) - '0';
			}
		}

		for (int y = 0; y < N; y++) {
			for (int x = 0; x < N; x++) {
				if (map[y][x] == 1 && visited[y][x] == 0) {
					visited[y][x] = 1;
					count(x, y);
				}

			}
		}
		Collections.sort(houses);

		System.out.println(houses.size());
		for (int h : houses) {
			System.out.println(h);
		}

	}

	private static void count(int x, int y) {
		Queue<int[]> queue = new LinkedList<>();
		queue.add(new int[] { x, y});
		cnt = 1;

		while (!queue.isEmpty()) {
			int[] cur = queue.poll();
			int cx = cur[0], cy = cur[1];

			for (int d = 0; d < 4; d++) {
				int nx = cx + dx[d], ny = cy + dy[d];
				if (0 <= nx && nx < N && 0 <= ny && ny < N && visited[ny][nx] == 0 && map[ny][nx] == 1) {
					visited[ny][nx] = 1;
					cnt++;
					queue.add(new int[] { nx, ny});
				}
			}

		}
		houses.add(cnt);
	}

}
