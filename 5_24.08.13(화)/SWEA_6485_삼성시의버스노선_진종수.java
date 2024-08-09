package week_04;

import java.util.Scanner;

public class SWEA_6485_삼성시의버스노선_진종수 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); // testCase
		for (int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();// 1th testcase
			int[] stationMin = new int[N];
			int[] stationMax = new int[N];
			for (int i = 0; i < N; i++) {
				stationMin[i] = sc.nextInt(); // 번호 최소 정류장.
				stationMax[i] = sc.nextInt(); // 번호 최대 정류장.
			}
			int p = sc.nextInt();
			int[] condition = new int[p]; // 버스 정류장 배열 (p 입력).
			for (int i = 0; i < p; i++) {
				condition[i] = sc.nextInt();
			}

			int[] answer = new int[p];
			for (int a = 0; a < p; a++) {
				for (int i = 0; i < N; i++) {
					if (stationMin[i] <= condition[a] && condition[a] <= stationMax[i]) {
						answer[a]++;
					}
				}
			}
			System.out.print("#" + tc + " ");
			for (int i = 0; i < answer.length; i++) {
				System.out.print(answer[i] + " ");
			}
			System.out.println();
		}
	}
}
