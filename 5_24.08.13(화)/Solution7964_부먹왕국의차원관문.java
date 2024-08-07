package sweaD3;

import java.util.Scanner;

//https://swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AWuSgKpqmooDFASy

public class Solution7964_부먹왕국의차원관문 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int t = 1; t <= T; t++) {
			int N = sc.nextInt();
			int D = sc.nextInt();
			int[] arr = new int[N];

			for (int n = 0; n < N; n++) {
				arr[n] = sc.nextInt();
			}

			int dist = 0;
			int cnt = 0;

			//앞에서부터 0이면 거리 +1, 거리가 D가 되면 cnt++하고 거리 리셋
			//1이면 거리 리셋
			
			for (int n = 0; n < N; n++) {
				if (arr[n] == 0) {
					dist++;
					if (dist == D) {
						cnt++;
						dist = 0;
					}
				} else {
					dist = 0 ;
				}
				
			}
			System.out.println("#" + t + " " + cnt);

		}

	}

}
