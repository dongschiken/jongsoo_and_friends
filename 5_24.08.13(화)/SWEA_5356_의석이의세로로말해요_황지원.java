package sw.D3;

import java.util.Scanner;

public class no5356_의석이의세로로말해요 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int t = 1; t <= T; t++) {
			String[] str = new String[5]; // 단어 5개 담을 배열 선언
			for(int i = 0; i < 5; i++) {
				str[i] = sc.next();
			}
			
			// 단어 제일 긴거 찾기 
			int longestWord = 0;
			for(int i = 0; i < 5; i++) {
				int wordLength = str[i].length();
				longestWord = Math.max(longestWord, wordLength);
			}
			
			// 비어있는 단어 * 채우기...
			// 좋은 아이디어는 아닌거 같아~~~~
			for(int i = 0; i < 5; i++) {
				if(str[i].length() != longestWord) {
					while(str[i].length() != longestWord) {
						str[i] += "*";
					}
				}
			}
			
			// 세로로 읽기
			String ans = "";
			for(int i = 0; i < longestWord; i++) {
				for(int j = 0; j < 5; j++) {
					int asciiNum = str[j].charAt(i);
					// 각 문자열은 영어 대문자, 영어 소문자, 숫자만 들어갈 수 있음
					// * 은 출력되지 않을 것
					if(48 <= asciiNum && asciiNum <= 57 || 
						65 <= asciiNum && asciiNum <= 90 ||
						97 <= asciiNum && asciiNum <= 122) {
						ans += str[j].charAt(i);
					}
				}
			}
			
			System.out.println("#"+t+" "+ ans);
		}
	}
}
