package baekjoon;

import java.util.Scanner;
import java.util.Arrays;

public class ex2309 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] dwarf = new int[9];
		int[] copy = new int[9];

		for (int d = 0; d < 9; d++)
			dwarf[d] = sc.nextInt();

		outer: for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if (i == j) 
					continue;

				copy = Arrays.copyOf(dwarf, dwarf.length);
				copy[i] = 0;
				copy[j] = 0;

				if (Arrays.stream(copy).sum() == 100)
					break outer;
			}
		}
		Arrays.sort(copy);
		for (int i = 2; i < 9; i++)
			System.out.println(copy[i]);
	}

}
