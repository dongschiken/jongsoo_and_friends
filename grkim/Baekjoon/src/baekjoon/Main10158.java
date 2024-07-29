package baekjoon;

import java.util.Scanner;

public class Main10158 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int W = sc.nextInt();
		int H = sc.nextInt();

		int p = sc.nextInt(); // w
		int q = sc.nextInt(); // h

		int t = sc.nextInt(); // error나면 long으로

		int np = (p + t) % (2 * W);
		int nq = (q + t) % (2 * H);

		if (np > W) {
			np = 2 * W - np;
		}

		if (nq > H) {
			nq = 2 * H - nq;
		}

		System.out.println(np + " " + nq);
	}

}
