package sw.D3;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class no7078_문서제목붙이기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); // 테케
		for(int t = 1; t <= T; t++) {
			int count = 0; 
			int N = sc.nextInt(); // 제목 개수
			String[] arr = new String[N];
		
			for(int n = 0; n < N; n++) {
				arr[n] = sc.next();
			}
			
			// 첫글자 뽑기 -> 아스키코드로 변환 -> 배열에 담기
			int[] firstAlphabet = new int[N];
			for(int i = 0; i < N; i++) {
				firstAlphabet[i] = (int)arr[i].charAt(0);
			}
			
			// 배열 정렬(65부터 시작할 수 있도록)
			Arrays.sort(firstAlphabet);
			
			// 같은 숫자 삭제
			Set<Integer> set = new HashSet<>();
			for(int i : firstAlphabet) {
				set.add(i);
			}
			
			int[] reFirstAlphabet = new int[set.size()];
			int index = 0;
			for(int i : set) {
				reFirstAlphabet[index++] = i;
			}
			
			// 65부터 시작해서 숫자 맞으면 count -> 중간에 안맞으면 count 멈추고 반환
			int asciiNum = 65;
			for(int i = 0; i < reFirstAlphabet.length; i++) {
				if(reFirstAlphabet[i] == asciiNum) {
					++count;
					++asciiNum;
				} else break;
			}
			System.out.println("#"+t+" "+count);
		}
	}
}
