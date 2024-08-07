package sweaD3;

//https://swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AWVWgkP6sQ0DFAUO&categoryId=AWVWgkP6sQ0DFAUO&categoryType=CODE&problemTitle=5356&orderBy=FIRST_REG_DATETIME&selectCodeLang=ALL&select-1=&pageSize=10&pageIndex=1

import java.util.Scanner;

public class Solution5356_의석이의세로로말해요 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		sc.nextLine();
		
		//5x15 배열 만들어서 앞에서부터 char로 넣기 
		for (int t = 1; t <= T; t++) {
			char[][] arr = new char[5][15];

			for (int i = 0; i < 5; i++) {
				int j = 0;
				for (char c : sc.nextLine().toCharArray())
					arr[i][j++] = c;
			}
			
			//0이면 출력 안하고 그 외는 세로로 읽으며 출력
			System.out.print("#" + t + " ");
			for (int x = 0; x < 15; x++) {
				for (int y = 0; y < 5; y++) {
					if ((int) arr[y][x] != 0) {
						System.out.print(arr[y][x]);
					}
						
				}
			}
			System.out.println();

		}

	}

}
