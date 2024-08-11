package sw.D2;

import java.util.Arrays;
import java.util.Scanner;

public class no1979_어디에단어가들어갈수있을까 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int t = 1; t <= T; t++) {
			int ans = 0;
			int N = sc.nextInt(); // 퍼즐 크기
			int K = sc.nextInt(); // 단어의길이
			// 흰색은 1. 검은색은 0
			int[][] puzzle = new int[N][N];
			for(int r = 0; r < N; r++) {
				for(int c = 0; c < N; c++) {
					puzzle[r][c] = sc.nextInt();
				}
			}
			
			// 1이면 ++count
			// 0이면 count를 확인한다. count == K이면 ++ans 하고 리셋, != K이면 그냥 리셋
			// 한줄이 끝났을때 count == K이면 ++ans
			for(int r = 0; r < N;r++) {
				int count = 0;
				for(int c = 0; c < N; c++) {
					if(puzzle[r][c] == 1) {
						++count;
					} else {
						if(count == K) {
							++ans;
							count = 0;
						} else {
							count = 0;
						}
					}
				}
				if(count == K) {
					++ans;
				}
			}
			
			for(int c = 0; c < N;c++) {
				int count = 0;
				for(int r = 0; r < N; r++) {
					if(puzzle[r][c] == 1) {
						++count;
					} else {
						if(count == K) {
							++ans;
							count = 0;
						} else {
							count = 0;
						}
					}
				}
				if(count == K) {
					++ans;
				}
			}
			System.out.println("#"+t+" "+ans);
		}
	}
}
