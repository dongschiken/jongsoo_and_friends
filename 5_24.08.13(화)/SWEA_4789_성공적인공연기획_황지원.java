package sw.D3;

import java.util.Scanner;

public class no4789_성공적인공연기획 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int t = 1; t <= T;t++) {
			int ans = 0; // 고용할 숫자
			String str = sc.next(); // 박수칠 조건
			
			int clappingP = 0; // 현재 박수치고 있는 사람의 수
			int condition = 0; // 박수칠 조건 -> for문을 돌릴때마다 +1 증가
			
			for(int i = 0; i < str.length();i++) {
				int num = str.charAt(i) - '0'; // 숫자형 문자열 -> int형으로 반환하는 방법
				if(num == 0) { 
					++condition;
				} else if(clappingP >= condition) { // 조건을 만족
					clappingP += num; // 박수치는 사람만 늘어난다
					++condition;
				} else { // 조건을 불만족
					int addPerson = (condition - clappingP); // 고용할 사람 수
					ans += addPerson; // 정답에 누적
					clappingP += addPerson; // 고용한 사람들은 무조건 박수침
					clappingP += num; // 조건을 만족하게 되므로 num 숫자만큼 박수치는 사람 늘어남
					++condition;
				}
			}
			
			System.out.println("#"+t+" "+ans);
		}
	}
}
