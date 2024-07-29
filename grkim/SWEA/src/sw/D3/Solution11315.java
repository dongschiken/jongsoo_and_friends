package sw.D3;

import java.util.Scanner;

public class Solution11315 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int t = 1; t <= T; t++) {
			int N = sc.nextInt();
			char[][] stone = new char[N][N];

			for (int y = 0; y < N; y++) {
				String st = sc.next();
				char[] cha = st.toCharArray();
				stone[y] = cha;
			}

			int[] dx = { -1, 0, 1, 1 };
			int[] dy = { 1, 1, 1, 0 };

			String flag = "NO";

			done: for (int y = 0; y < N; y++) {
				for (int x = 0; x < N; x++) {
					if (stone[y][x] == 'o') {
						for (int i = 0; i < 4; i++) {
							int nx = x + dx[i];
							int ny = y + dy[i];
							int cnt = 1;

							while (0 <= nx && nx < N && 0 <= ny && ny < N && cnt < 5) {
								if (stone[ny][nx] == 'o') {
									cnt++;
									nx += dx[i];
									ny += dy[i];
								} else {
									break;
								}
							}
							if (cnt == 5) {
								flag = "YES";
								break done;
							}

						}

					}

				}

			}
			System.out.println("#" + t + " " + flag);
		}

	}

}
