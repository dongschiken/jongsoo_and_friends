package week_04;

import java.util.Scanner;

public class SWEA_7087_문서제목붙이기_진종수 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		int tc = 1;

		while (tc <= T) {
			int N = sc.nextInt();
			sc.nextLine();
			char[] arr = new char[N]; // 문자를 라인단위로 읽은 후에 1첫글자만 따서 char 배열에 넣는다.
			for (int i = 0; i < N; i++) {
				String s = sc.nextLine();
				arr[i] = s.charAt(0);
			}
			boolean find = false;
			int count = 0;
			for (int a = 65; a <= 90; a++) { // 아스키코드 65 ~ 90 A~Z
			out:for (int i = 0; i < N; i++) { // 배열 사이즈 만큼 반복 돌기.
					if ((int) arr[i] == a) { //배열의 첫글자가 A, B, ...와 같다면. 다음 알파벳으로 넘어가기. 
						find = true;
						count++;
						break out;
					}
					find = false;
				}
				if (!find)
					break;
			}

			System.out.printf("#%d %d\n", tc, count);
			tc++;
		}
	}

}
