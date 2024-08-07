package sweaD3;

//https://swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AWS2dSgKA8MDFAVT&categoryId=AWS2dSgKA8MDFAVT&categoryType=CODE&problemTitle=4789&orderBy=FIRST_REG_DATETIME&selectCodeLang=ALL&select-1=&pageSize=10&pageIndex=1

import java.util.Scanner;

public class Solution4789_성공적인공연기획 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		sc.nextLine();

		//숫자 찢어서 담음 
		for (int t = 1; t <= T; t++) {
			String input = sc.nextLine();
			int[] arr = new int[input.length()];
			
			for (int c = 0; c < input.length(); c++) {
				arr[c] = Character.getNumericValue(input.charAt(c));
			}
			
			int cnt = 0;
			int curr = 0;
			
			//첫번째에 0인 경우 1명 추가하고 curr 1 늘려줌
			if (arr[0] == 0) {
				cnt++;
				curr++;
			} else {
				curr += arr[0];
			}
			
			//i - 1보다 현재 많으면 새로운 인원 추가, 아니면 부족한 만큼 사람 고용
			for (int i = 1; i < arr.length; i++) {
				if (curr >= i) {
					curr += arr[i];
				} else {
					cnt += i - curr;
					curr = i + arr[i];
				}
			}
		System.out.println("#" + t + " " + cnt);
		
		}
	}

}
