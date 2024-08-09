package study_0813;

import java.util.Scanner;

public class Main2810_컵홀더 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.nextLine();

		char[] arr = sc.nextLine().toCharArray();

		//S 개수, L의 개수 셈 (L나오면 i+해서 하나 넘김)
		
		int cnt = 1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 'S') {
				cnt++;
			} else if (arr[i] == 'L') {
				cnt++;
				i++;
			}
		}
		
		//사람의 수 이므로 cnt가 사람보다 많으면 사람 수 출력
		if (cnt > arr.length) {
			cnt = arr.length;
		}
		
		System.out.println(cnt);

	}

}
