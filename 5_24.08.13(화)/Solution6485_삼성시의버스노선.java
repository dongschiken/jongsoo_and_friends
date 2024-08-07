package sweaD3;

import java.util.Scanner;
//https://swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AWczm7QaACgDFAWn 

public class Solution6485_삼성시의버스노선 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int t = 1; t <= T; t++) {
			int N = sc.nextInt();
			int[][] arr = new int[N][2];

			//0에 A, 1에 B 받음
			for (int n = 0; n < N; n++) {
				arr[n][0] = sc.nextInt();
				arr[n][1] = sc.nextInt();
			}

			//어떤 정류장이 나올지 몰라서 5000 배열 만듦 
			//A부터 B까지 +1
			
			int[] station = new int[5000];

			for (int n = 0; n < N; n++) {
				for (int i = arr[n][0] - 1; i < arr[n][1]; i++) {
					station[i]++;
				}

			}

			//정류장 인덱스 읽어서 해당 버스 수 출력
			int P = sc.nextInt();

			System.out.print("#" + t);
			for (int p = 0; p < P; p++) {
				System.out.print(" " + station[sc.nextInt() - 1]);
			}
			System.out.println();

		}

	}

}
