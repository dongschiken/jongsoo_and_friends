package sweaD3;

//https://swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AWIsY84KEPMDFAWN&categoryId=AWIsY84KEPMDFAWN&categoryType=CODE&problemTitle=4047&orderBy=FIRST_REG_DATETIME&selectCodeLang=ALL&select-1=&pageSize=10&pageIndex=1

import java.util.Arrays;
import java.util.Scanner;

public class Solution4047_영준이의카드카운팅 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		sc.nextLine();

		for (int t = 1; t <= T; t++) {
			String input = sc.nextLine();
			char[] kind = new char[input.length() / 3];
			int[] num = new int[input.length() / 3];

			// 문자와 숫자를 분리해서 kind와 num에 각자 넣기
			for (int n = 0; n < input.length() / 3; n++) {
				String cut = input.substring(3 * n, 3 * n + 3);
				kind[n] = cut.charAt(0);
				num[n] = Character.getNumericValue(cut.charAt(1)) * 10 + Character.getNumericValue(cut.charAt(2));

			}
			
			int[][] count = new int[4][14];

			//크기 14의 배열에 카드값에 해당하는 인덱스에 카드 숫자 세기 
			for (int n = 0; n < input.length() / 3; n++) {
				switch (kind[n]) {
				case 'S':
					count[0][num[n]]++;
					continue;
				case 'D':
					count[1][num[n]]++;
					continue;
				case 'H':
					count[2][num[n]]++;
					continue;
				case 'C':
					count[3][num[n]]++;
					continue;
				}
			}
			
			//하나라도 1 초과가 있는지 확인 
			int cnt = 0;
			for (int d = 0; d < 4; d++) {
				for (int n = 0; n < 14; n++) {
					if (count[d][n] > 1) {
						cnt = 1;
						break;
					}
				}
			}
			
			//1 초과면 ERROR, 아니라면 각 행별로 더해서 13에서 뺀 값 출력
			if (cnt == 1) {
				System.out.println("#" + t + " " + "ERROR");
			} else {
				System.out.print("#" + t);
				for (int d = 0; d < 4; d++) {
					System.out.print(" " + (13 - Arrays.stream(count[d]).sum()));
				}
				System.out.println();
				
				
			}

		}

	}

}
