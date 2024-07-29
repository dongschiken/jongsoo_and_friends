package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Main1592 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();
		int L = sc.nextInt();

		int[] people = new int[N];

		int idx = 0;
		int total = 0;
		people[idx] = 1;

		while (people[idx] < M) {
			if (people[idx] % 2 == 1) { // 홀수
				if (idx + L >= N)
					idx = L - N + idx;
				else
					idx += L;

			} else {
				if (idx - L < 0)
					idx = N - L + idx;
				else
					idx -= L;
			}
			people[idx]++;
			total++;
		}
		System.out.println(total);

	}

}
