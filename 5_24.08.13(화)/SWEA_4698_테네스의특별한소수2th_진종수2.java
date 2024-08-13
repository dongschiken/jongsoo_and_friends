package week_04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SWEA_4698_테네스의특별한소수2th_진종수2 {

	public static void main(String[] args) {
		// 문제의 배열 범위까지 지수리스트를 만든다.

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		final int MAX = 1000000;
		//소수 리스트 만들기
		List<Integer> primes = sieveOfEratosthenes(MAX);

		int tc = 1;
		while (tc <= t) {

			int d = sc.nextInt();
			int a = sc.nextInt();
			int b = sc.nextInt();
			int count = 0;
				for (int prime : primes) {
					if (prime > b)
						break;
					if (prime >= a && dTest(prime, d)) {
						count++;
					}
				}
				System.out.printf("#%d %d\n", tc, count);
			tc++;
		}
		sc.close();
	}

	//소수리스트 : 2부터~ 만들기. 
	static List<Integer> sieveOfEratosthenes(int max) {
		boolean[] isPrime = new boolean[max + 1];
		// 배열 초기화 
		for (int i = 2; i <= max; i++) { 
			isPrime[i] = true;
		}
		// 소수의 배수를 제거
		for (int p = 2; p * p <= max; p++) {
			if (isPrime[p]) {
				for (int multiple = p * p; multiple <= max; multiple += p) {
					isPrime[multiple] = false;
				}
			}
		}
		//소수 배열 만들기. 
		List<Integer> primes = new ArrayList<>();
		for (int p = 2; p <= max; p++) {
			if (isPrime[p]) {
				primes.add(p);
			}
		}
		return primes;
	}

	static boolean dTest(int num, int d) {

		while (num > 0) {
			if (num % 10 == d) {
				return true;
			}
			// 검사하는 자리수 바꾸기.
			num /= 10;
		}

		return false;
	}

}
