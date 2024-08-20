package solved;

import java.util.Scanner;

public class SWEA_1288_새로운불면증치료법 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for (int test_case = 1; test_case <= T; test_case++) {
			
			int N = sc.nextInt();
			
			// 0 ~ 9 까지 저장할 배열
			int[] count = new int[10];
			
			// 양을 세는 것을 멈추기 위한 기저조건
			boolean fin = false;
			
			// 마지막으로 양을 센 횟수
			int finalK = 0;
			
			for (int k = 1; fin == false; k++) {
				int sheep = k * N;
				String str = String.valueOf(sheep);
				char[] charArr = str.toCharArray();
				for (int i = 0; i < charArr.length; i++) {
					count[charArr[i] - '0']++;
				}
				
				for (int i = 0; i < count.length; i++) {
					if (count[i] > 0) {
						finalK = k;
						fin = true;
					} else {
						fin = false;
						break;
					}
				}
			}
			System.out.println("#" + test_case + " " + (finalK * N));
		}
		sc.close();
	}
}
