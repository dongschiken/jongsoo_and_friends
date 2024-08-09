package study_0813;

import java.util.Scanner;

//https://swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AV19AcoKI9sCFAZN&categoryId=AV19AcoKI9sCFAZN&categoryType=CODE&problemTitle=1289&orderBy=FIRST_REG_DATETIME&selectCodeLang=ALL&select-1=&pageSize=10&pageIndex=1&&&&&&&&&

public class Solution1289_원재의메모리복구하기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		sc.nextLine();

		for (int t = 1; t <= T; t++) {
			String input = sc.nextLine();
			int[] arr = new int[input.length()];
			int cnt = 0; 

			//하나씩 비교하면서 다르면 n부터 뒤까지 다 바꾸기
			for (int n = 0; n < input.length(); n++) {
				int inputVal = Character.getNumericValue(input.charAt(n));
				if (inputVal != arr[n]) {
					cnt++;
					for (int i = n; i < input.length(); i++) {
						arr[i] = inputVal;
						
					}
				} 
			}
			
			System.out.println("#" + t + " " + cnt);

		}

	}

}
