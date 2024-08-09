package study_0813;

import java.util.Scanner;

public class Solution1493_수의새로운연산 {

	static class XY {
		int x;
		int y;

		XY(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int t = 1; t <= T; t++) {
			int A = sc.nextInt();
			int B = sc.nextInt();

			int ans = toNum(getLoc(A).x + getLoc(B).x, getLoc(A).y + getLoc(B).y);

			System.out.println("#" + t + " " + ans);

		}
	}

	private static XY getLoc(int A) {
		int i = 0;
		do {
			A -= i++;
		} while (A - i > 0);

		return new XY(A, i - A + 1);

	}

	private static int toNum(int A, int B) {

		int max = Math.max(A, B);
		int min = Math.min(A, B);
		int sum = 0;

		for (int i = 1; i <= min + max - 1; i++) {
			sum += i;
		}
		
		return sum - B + 1;

	}

}
