package study_0813;

import java.util.Scanner;

public class Main2941_크로아티아알파벳 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String st1 = "c= c- d- lj nj s= z=";

		String input = sc.nextLine();
		int cnt = 0;

		for (int i = 0; i < input.length() - 1; i++) {
			String check = input.substring(i, i + 2);
			if (i < input.length() - 2 && input.substring(i, i + 3).equals("dz=")) {
				cnt += 2;
				i++;
			}

			if (st1.contains(check)) {
				cnt++;
			}
		}

		System.out.println(input.length() - cnt);

	}

}
