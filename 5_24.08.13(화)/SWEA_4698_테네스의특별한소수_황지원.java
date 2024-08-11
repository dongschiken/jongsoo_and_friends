package sw.D3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class no4698_테네스의특별한소수 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		// 에라토스테네스의 체
		int num = 1000000;
		int[] primeNum = new int[num + 1];

		// 1. 배열을 숫자로 다 채운다.
		for (int i = 2; i <= num; i++) {
			primeNum[i] = i;
		}
		// 2. 자기 자신을 제외한 배수들을 0으로 삭제한다.
		for (int i = 2; i <= num; i++) {
			if (primeNum[i] == 0) {
				continue;
			}
			// j 초기값은 i+i로 자기 자신을 제외하고 j += i 로 j의 배수를 정한다.
			for (int j = i + i; j <= num; j += i) {
				primeNum[j] = 0;
			}
		}

//		// String으로 바꿔주기
//		String[] primeStr = new String[num +1];
//		for (int i = 0; i < num + 1; i++) {
//			primeStr[i] = Integer.toString(primeNum[i]);
//		}
	
//		System.out.println(primeStr);
		
		// 테스트케이스 시작
		for (int t = 1; t <= T; t++) {
			int count = 0;
			String D = sc.next(); // 특별한 소수에 포함되는 숫자(1~9)
			int A = sc.nextInt(); // 시작 숫자
			int B = sc.nextInt(); // 마지막 숫자

			for(int i = A; i <= B;i++) {
				if(primeNum[i] != 0 && Integer.toString(primeNum[i]).contains(D))
					++count;
			}
			System.out.println("#" + t + " " + count);
		}
	}
}
