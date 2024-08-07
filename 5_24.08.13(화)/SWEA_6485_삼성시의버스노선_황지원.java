package sw.D3;

import java.util.Scanner;

public class no6485_삼성시의버스노선 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); // 테스트 케이스
		for(int t = 1; t <= T; t++) {
			int N = sc.nextInt(); // 버스 노선 개수
			int[] arr= new int[N * 2]; 
			for(int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt(); // 버스 노선이 가는 정류장(노선 개수에 따라 input 개수도 달라져 배열에 담음)
			}
			int P = sc.nextInt(); // 버스 정류장 개수
			int[] busStopNum = new int[P];
			for(int i = 0; i < P; i++) {
				busStopNum[i] = sc.nextInt(); // 버스 정류장 번호
			}
			
			
			// 버스 노선이 가는 정류장 번호를 인덱스로 관리하여 count++
			int[] count = new int[5001]; // 정류장 번호는 5000번까지 있음
			for(int idx = 0; idx < N * 2; idx+=2) {
				int start = arr[idx]; // idx 짝수 번에 버스 노선이 가는 정류장 시작번호 담김
				int finish = arr[idx+1]; // idx 홀수 번에 버스 노선이 가는 정류장 마지막번호 담김
				for(int i = start; i <= finish; i++) {
					++count[i];
				}
			}
			
			// 출력
			System.out.print("#"+t+" ");
			for(int i = 0; i < P; i++) {
				System.out.print(count[busStopNum[i]]);
				if(i != (P-1)) System.out.print(" ");
			}
			System.out.println();
		}
	}
}
