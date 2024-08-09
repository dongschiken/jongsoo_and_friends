package study_0813;

import java.util.Scanner;

public class Main2798_블랙잭 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();

		int[] arr = new int[N];

		for (int n = 0; n < N; n++) {
			arr[n] = sc.nextInt();
		}

		int max = Integer.MAX_VALUE;
		
		//모든 3개의 조합을 계산, max값보다 M에서 가까우면 업데이트

		for (int i = 0; i < N - 2; i++) {
			for (int j = i + 1; j < N - 1; j++) {
				for (int k = j + 1; k < N; k++) {
					int sum = arr[i] + arr[j] + arr[k];
					
					if (sum <= M && Math.abs(M-sum) < Math.abs(M-max)) {
						max = sum;
					}
				}
			}
		}
		
		System.out.println(max);

	}

}
