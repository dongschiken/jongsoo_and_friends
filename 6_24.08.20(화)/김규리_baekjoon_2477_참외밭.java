package baekjoonSilver;

import java.util.Scanner;

public class Main2477_참외밭 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		int[][] input = new int[6][2];

		for (int c = 0; c < 6; c++) {
			input[c][0] = sc.nextInt();
			input[c][1] = sc.nextInt();
		}

		int minA = 0, minB = 0;
		int maxA = 0, maxB = 0;

		for (int c = 0; c < 5; c++) {
			if (!((input[c][0] == 4 && input[c + 1][0] == 2) 
				|| (input[c][0] == 2 && input[c + 1][0] == 3)
				|| (input[c][0] == 3 && input[c + 1][0] == 1) 
				|| (input[c][0] == 1 && input[c + 1][0] == 4))) {
				minA = input[c][1];
				minB = input[c + 1][1];
				break;
			}
		}
		
		if (minA == 0 &&  minB == 0) {
			minA = input[0][1];
			minB = input[5][1];
		}
		

		for (int c = 0; c < 6; c++) {
			if (input[c][0] == 3 || input[c][0] == 4) {
				if (input[c][1] > maxA) {
					maxA = input[c][1];
				}
			} else {
				if (input[c][1] > maxB) {
					maxB = input[c][1];
				}
				
			}
		}
		int total = ((maxA * maxB) - (minA * minB)) * K;
		System.out.println(total);

	}

}
