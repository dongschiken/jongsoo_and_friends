package baekjoon;

import java.util.Scanner;

public class Main1436 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int cnt = 0;
		int i = 666;
		
		while (cnt != N) {
			if (String.valueOf(i).contains("666")) {
				cnt++;
			}
			i++;
		}
		System.out.println(--i);
		
	}

}
