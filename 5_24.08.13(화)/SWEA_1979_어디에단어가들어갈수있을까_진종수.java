package week_04;

import java.util.Scanner;

public class SWEA_1979_어디에단어가들어갈수있을까_진종수 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();
		for (int i = 1; i <= t; i++) {
			int n = sc.nextInt();
			int k = sc.nextInt();

			int[][] arr = new int[n][n];

			for (int a = 0; a < n; a++) {
				for (int j = 0; j < n; j++) {
					arr[a][j] = sc.nextInt();
				}
			}
			int count = 0;
			for (int a = 0; a < n; a++) {
				out: for (int j = 0; j <= n-k; j++) {
					for (int c = 0; c < k; c++) { // 가로검사.
						if (arr[a][j + c] == 0)
							{j+=c; //속도 올리기. c만큼 넘어가서 찾기. 
							continue out;}
					}
					//연속된 K를 찾은 후 검사하기. 
					//맨뒤이거나, 단어 다음이 0이여야되고, 맨앞이거나 단어 앞이 0이여야됨. 둘다 조건을 만족한다면 count++
					if ((j + k ==n || arr[a][j + k] == 0)&&  ( j==0 || arr[a][j-1] == 0))  //뒤검사. 앞에도 검사하기. 
						count++;
				}
			}
			
			for (int a = 0; a < n; a++) {
				out: for (int j = 0; j <= n-k; j++) {
					for (int c = 0; c < k; c++) { //세로 검사.
						if ( arr[j+c][a] == 0) {
							j+=c;
							continue out;}
					}
					if ((j + k ==n || arr[j+k][a] == 0)&&  ( j==0 || arr[j-1][a] == 0))
					count++;
				}
			}
		System.out.printf("#%d %d\n",i, count);
		}
	}
}
