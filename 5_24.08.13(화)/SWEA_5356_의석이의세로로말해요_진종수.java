package week_04;

import java.util.Scanner;

public class SWEA_5356_의석이의세로로말해요_진종수 {
	// 2차원 배열에 입력받고 행, 열 순서 바꿔서 출력
	// 배열에 char 형태의 값이 비어있을때는 null이 아닌 0을 이용해 비교 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		for (int tc = 1; tc <= t; tc++) {

			char[][] arr = new char[5][15];
			for (int i = 0; i < 5; i++) {
				String str = sc.nextLine();
				for (int j = 0; j < str.length(); j++) {
					arr[i][j] = str.charAt(j);
				}
			}
			System.out.print("#"+tc+" ");
			
			for (int j = 0; j < 15; j++) {
				for (int i = 0; i < 5; i++) {
					if (arr[i][j] == 0) { // char 형도 0을 이용해 비교.
						continue;
					} else
						System.out.print(arr[i][j]);

				}
			}	System.out.println("");

		}

	}

}
