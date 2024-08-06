package study_0806;

import java.util.Scanner;

public class Main2564_경비원 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int W = sc.nextInt();
		int H = sc.nextInt();
		int N = sc.nextInt();

		int[][] store = new int[N][3];

		for (int n = 0; n < N; n++) {
			store[n][0] = sc.nextInt();
			store[n][1] = sc.nextInt();

		}

		int dx = sc.nextInt();
		int dy = sc.nextInt();

		for (int n = 0; n < N; n++) {
			int sx = store[n][0];
			int sy = store[n][1];
			if (dx == sx) {
				store[n][2] = Math.abs(sy - dy);
			} else if (dx + sx == 3) {
				store[n][2] = Math.min(H + dy + sy, H + 2 * W - dy - sy);
			} else if (dx + sx == 7) {
				store[n][2] = Math.min(W + dy + sy, W + 2 * H - dy - sy);
			} else if (dx == 1) {
				if (sx == 3) {
					store[n][2] = dy + sy;
				} else if (sx == 4) {
					store[n][2] = W - dy + sy;
				}

			} else if (dx == 2) {
				if (sx == 3) {
					store[n][2] = dy + H - sy;
				} else if (sx == 4) {
					store[n][2] = W - dy + H - sy;
				}
			} else if (dx == 3) {
				if (sx == 1) {
					store[n][2] = dy + sy;
				} else if (sx == 2) {
					store[n][2] = H - dy + sy;
				}
			} else if (dx == 4) {
				if (sx == 1) {
					store[n][2] = dy + W - sy;
				} else if (sx == 2) {
					store[n][2] = H - dy + W - sy;
				}
			}

		}

		int total = 0;
		for (int t = 0; t < store.length ; t++) {
			total += store[t][2];
		}
		System.out.println(total);
		
	}

}
