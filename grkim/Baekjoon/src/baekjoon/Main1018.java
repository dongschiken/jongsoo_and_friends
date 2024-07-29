package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main1018 {
	public static void main(String[] args) {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		int N = 0;
		int M = 0;
		int[][] board = null;

		List<Integer> cnt = new ArrayList<>();

		try {
			String[] dim = reader.readLine().split(" ");
			N = Integer.parseInt(dim[0]);
			M = Integer.parseInt(dim[1]);

			board = new int[N][M];

			for (int i = 0; i < N; i++) {
				String line = reader.readLine();
				for (int j = 0; j < M; j++) {
					if (line.charAt(j) == 'B') {
						board[i][j] = 0; // black
					} else {
						board[i][j] = 1; // white
					}
				}

			}
		} catch (IOException e) {

		}

		int[][] standard1 = new int[8][8];
		int[][] standard2 = new int[8][8];

		for (int y = 0; y < 8; y++) {
			for (int x = 0; x < 8; x++) {
				if ((y % 2 == 0 && x % 2 == 1) || y % 2 == 1 && x % 2 == 0) {
					standard1[y][x] = 1;
				} else {
					standard2[y][x] = 1;
				}

			}
		}
		

		for (int i = 0; i <= N - 8; i++) {
			for (int j = 0; j <= M - 8; j++) {
				int[][] sum1 = new int[8][8];
				int[][] sum2 = new int[8][8];
				
				for (int y = 0; y < 8; y++) {
					for (int x = 0; x < 8; x++) {
						if (standard1[y][x] != board[i + y][j + x]) {
							sum1[y][x] = 1;
						}
						if (standard2[y][x] != board[i + y][j + x]) {
							sum2[y][x] = 1;
						}

					}
				}
				

				int total = 0;
				for (int[] arr : sum1)
					total += Arrays.stream(arr).sum();
				cnt.add(total);
				total = 0;

				for (int[] arr : sum2)
					total += Arrays.stream(arr).sum();
				cnt.add(total);

			}
		}
		cnt.sort(null);
		System.out.println(cnt.get(0));

	}

}
