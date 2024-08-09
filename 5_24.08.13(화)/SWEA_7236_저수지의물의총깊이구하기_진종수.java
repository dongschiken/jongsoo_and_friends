package week_04;

import java.util.Scanner;

public class SWEA_7236_저수지의물의총깊이구하기_진종수 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int max = 0;
			int n = sc.nextInt();
			sc.nextLine();
			String[][] arr = new String[n][n];

			for (int i = 0; i < n; i++) { // 문자 한줄씩 String 배열에
				String str = sc.nextLine(); // 공백 기준으로 나눠담기.
				String[] row = str.split(" ");
				for (int j = 0; j < n; j++) {
					arr[i][j] = row[j];
				}
			}

			int[] dr = { -1, -1, -1, 0, 1, 1, 1, 0 }; // 1부터 시계방향으로.
			int[] dc = { -1, 0, 1, 1, 1, 0, -1, -1 };

			
			
			for(int i=0; i<n ; i++) {
				for(int j=0; j<n; j++) {
					int count = 0;
					
				
					for (int d = 0; d < 8; d++) {
						int nr = i + dr[d];
						int nc = j + dc[d];
						if ((!(nr > n - 1 || nr < 0 || nc > n - 1 || nc < 0)) && (arr[nr][nc].equals("W"))) {
							count++;
						}
					}
				if(max<count)
					max = count;
				}
			}
			System.out.printf("#%d %d",tc, max);
			System.out.println();
			
			}

		}

	}

