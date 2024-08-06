package study_0806;

import java.util.Arrays;
import java.util.Scanner;

public abstract class Main2116_주사위쌓기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		int[][] dice = new int[N][6];

		for (int n = 0; n < N; n++) {
			for (int i = 0; i < 6; i++) {
				dice[n][i] = sc.nextInt();
			}
		}

		int[] sixes = new int[6];

		for (int s = 0; s < 6; s++) {
			int cnt = 0;
			int idx = s;
			int num = dice[0][s];
			int n = 0;

			if (num == 6) {
				cnt++;
			}

			while (n < N) {

				if (idx == 0 || idx == 5) {
					idx = 5 - idx;
				} else if (idx == 1 || idx == 3) {
					idx = 4 - idx;
				} else if (idx == 2 || idx == 4) {
					idx = 6 - idx;
				}

				if (num + dice[n][idx] == 11) {
					cnt++;
				}

				num = dice[n][idx];

				if (n == N - 1) {
					if (num == 6) {
						cnt++;
					}
					n++;
					break;
				} else {
					if (num == 6) {
						cnt += 2;
					}
				}

				for (int ss = 0; ss < 6; ss++) {
					if (dice[n + 1][ss] == num) {
						n++;
						idx = ss;
						break;
					}
				}

			}

			sixes[s] = cnt;

		}

		int min = 10000;

		for (int m : sixes) {
			min = Math.min(m, min);
		}

		System.out.println(6 * N - min);

	}

}
