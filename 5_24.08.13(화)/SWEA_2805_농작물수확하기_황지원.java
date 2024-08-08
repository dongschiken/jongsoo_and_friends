package Day_240808;

import java.util.Scanner;

public class no2805_농작물수확하기 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int t = 1; t <= T; t++) {
			int ans = 0;
			int N = sc.nextInt();
			int[][] map = new int[N][N];

			// 농장의 규칙에 따라 얻을 수 있는 수익을 "공백"으로 줌
			for(int i = 0; i < N; i++) {
				String[] strArr = sc.next().split("");
				for(int j = 0; j < N; j++) {
					map[i][j] = Integer.parseInt(strArr[j]);
				}
			}
			
			
			// 아이디어 : middle 열을 기준으로 칸의 개수 규칙을 찾음
			int middleCol = N / 2;
			int count = 0;
			for(int r = 0; r <= middleCol; r++) {
				for(int c = (middleCol - count); c <= (middleCol + count); c++) {
					ans+= map[r][c];
				}
				++count;
			}
			
			count -= 2;
			for(int r = middleCol + 1; r < N; r++) {
				for(int c = (middleCol - count); c <= (middleCol + count); c++) {
					ans += map[r][c];
				}
				--count;
			}
			System.out.println("#"+t+" "+ ans);
		}
	}
}
