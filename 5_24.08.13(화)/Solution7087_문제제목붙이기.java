package sweaD3;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

//https://swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AWkIdD46A5EDFAXC 

public class Solution7087_문제제목붙이기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int t = 1; t <= T; t++) {
			int N = sc.nextInt();
			Set<Character> set = new HashSet<>();

			//set에 첫번째 char만 받음 
			for (int n = 0; n < N; n++) {
				set.add(sc.next().charAt(0));
			}

			//정렬
			set.stream().sorted();

			int cnt = 0;
			int i = 'A';

			//순서대로 같으면 +1
			for (char c : set) {
				if (c == i++) {
					cnt++;
				}
			}

			System.out.println("#" + t + " " + cnt);
		}
	}
}
