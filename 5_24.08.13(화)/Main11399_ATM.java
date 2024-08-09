package study_0813;

import java.util.Arrays;
import java.util.Scanner;

public class Main11399_ATM {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];

		for (int n = 0; n < N; n++) {
			arr[n] = sc.nextInt();
		}

		Arrays.sort(arr);
		
		int total = 0;
		for (int n = 0; n < N; n++) {
			total += arr[n] * (arr.length - n);
		}
		
		System.out.println(total);
	}

}
