package sw.D3;

import java.util.Scanner;

public class no7236_저수지의물의총깊이구하기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); // 테스트케이스
		for (int t = 1; t <= T; t++) {
			int maxSum = 0;
			int N = sc.nextInt(); // 저수지 구획의 크기
			String [][] arr = new String[N][N];

			for (int r = 0; r < N; r++) {
				for (int c = 0; c < N; c++) {
					// String 말고 char로 하려면 ,,? 
					arr[r][c] = sc.next();
				}
			}

			// 구획마다 팔방탐색, 이후 maxSum과 크기 비교
			int[] dr = { -1, 1, 0, 0, -1, -1, 1, 1 };
			int[] dc = { 0, 0, -1, 1, -1, 1, -1, 1 };

			for (int r = 0; r < N; r++) {
				for (int c = 0; c < N; c++) {
					int sum = 0;
					for (int d = 0; d < 8; d++) {
						// 이 친구들을 어디에 선언해야 할지 매번 헷갈려,,
						int nr = r + dr[d];
						int nc = c + dc[d];

						if (0 <= nr && nr < N && 0 <= nc && nc < N && arr[nr][nc].equals("W")) {
							++sum;
						}
					}
          				// sum이 0일경우는 1로 변환 필요
					if (sum == 0)
						sum = 1;
					maxSum = Math.max(maxSum, sum);
				}
			}
			System.out.println("#" + t + " " + maxSum);
		}
	}
}
