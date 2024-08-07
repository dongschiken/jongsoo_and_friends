package week_04;

import java.util.Arrays;
import java.util.Scanner;

public class SWEA_7272_안경이없어_진종수 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		sc.nextLine();

		for (int i = 1; i <= T; i++) {
			String str = sc.nextLine();
			String[] arr1 = str.split(" ");

			char[] same1 = { 'C', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'S', 'T', 'U', 'V', 'W', 'X', 'Y',
					'Z' };
			char[] same2 = { 'A', 'D', 'O', 'P', 'Q', 'R' };

			char[] cArr1 = arr1[0].toCharArray();
			char[] cArr2 = arr1[1].toCharArray();
			
			if(cArr1.length != cArr2.length) {
				System.out.printf("#%d %s\n", i, "DIFF");
				continue;

			}
			for (int j = 0; j < cArr1.length; j++) {
				for (int a = 0; a < same1.length; a++) {
					if (cArr1[j] == same1[a]) {
						cArr1[j] = 'C';
						break;
					}
				}
				for (int a = 0; a < same2.length; a++) {
					if (cArr1[j] == same2[a]) {
						cArr1[j] = 'A';
						break;
					}
				}

			}
			
			for (int j = 0; j < cArr2.length; j++) {
				for (int a = 0; a < same1.length; a++) {
					if (cArr2[j] == same1[a]) {
						cArr2[j] = 'C';
						break;
					}
				}
				for (int a = 0; a < same2.length; a++) {
					if (cArr2[j] == same2[a]) {
						cArr2[j] = 'A';
						break;
					}
				}

			}
			boolean same = true;
			for (int b = 0; b < cArr1.length; b++) {
				if (cArr1[b] != cArr2[b]) {
					same = false;
					break;
				}
			}

			if (same) {
				System.out.printf("#%d %s\n", i, "SAME");
			} else {
				System.out.printf("#%d %s\n", i, "DIFF");
			}

		}

	}

}
