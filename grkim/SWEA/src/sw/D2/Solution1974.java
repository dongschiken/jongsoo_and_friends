package sw.D2;

import java.util.Arrays;
import java.util.Scanner;

public class Solution1974 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {
			int[][] sudoku = new int[9][9];
			int flag = 1;
			for (int y = 0; y < 9; y++) {
				for (int x = 0; x < 9; x++) {
					sudoku[y][x] = sc.nextInt();
				}
			}
			outerloop1: for (int y3 = 0; y3 < 3; y3++) {
				for (int x3 = 0; x3 < 3; x3++) {
					int[] cut = new int[9];
					int c = 0;
					for (int dy = 0; dy < 3; dy++) {
						for (int dx = 0; dx < 3; dx++) {
							int nx = x3 * 3 + dx;
							int ny = y3 * 3 + dy;

							cut[c++] = sudoku[ny][nx];
						}
					}
					if (check(cut) == 0) {
						flag = 0;
						break outerloop1;
					}

				}

			}
			outerloop2: if (flag == 1) {
				
				int[] cut = new int[9]; 
				int idx = 0;
				
				for (int y = 0; y < 9; y++) {
					for (int x = 0; x < 9; x++) {
						cut[idx++] = sudoku[y][x];
					}
					idx = 0; 
					if (check(cut) == 0) {
						flag = 0;
						break outerloop2;					
						
					}
				}

				for (int x = 0; x < 9; x++) {
					for (int y = 0; y < 9; y++) {
						cut[idx++] = sudoku[y][x];		
					}
					idx = 0;
					if (check(cut) == 0) {
						flag = 0;
						break outerloop2;					
						
					}
				}

			}

			System.out.println("#" + tc + " " + flag);

		}

	}

	public static int check(int[] list) {
		Arrays.sort(list);
		for (int i = 0; i < 9; i++) {
			if (list[i] != i + 1) {
				return 0;
			}
		}
		return 1;
	}

}
