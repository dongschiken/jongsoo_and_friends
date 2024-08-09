package study_0813;

import java.util.Scanner;

public class Main2851_슈퍼마리오 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];

		for (int n = 0; n < 10; n++) {
			arr[n] = sc.nextInt();
		}

		int total = 0;

		//새로 더하는게 100에서 더 가까우면 더하기, 한 번 끊기면 탈출
		for (int n = 0; n < 10; n++) {
			if (Math.abs(total - 100) >= Math.abs(total + arr[n]) - 100) {
				total += arr[n];
			} else {
				break;
			}
		}
		System.out.println(total);
	}

}
