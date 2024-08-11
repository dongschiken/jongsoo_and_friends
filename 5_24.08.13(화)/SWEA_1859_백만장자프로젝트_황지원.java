package sw.D2;

import java.util.Scanner;

public class no1859_백만장자프로젝트 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int t = 1; t <= T; t++) {
			int N = sc.nextInt(); 
			int[] price = new int[N];
			for(int i = 0; i < N; i++) {
				price[i] = sc.nextInt();
			}
			
			long ans = 0;
			
			// 매매가 최대값을 끝날부터 구한다.(시간복잡도 훨씬 줄어듦) 
			int[] maxPrice = new int[N];
			maxPrice[N-1] = price[N-1];
			for(int i = N- 2; i >= 0; i--) {
				maxPrice[i] = Math.max(price[i], maxPrice[i+1]);
				ans += (maxPrice[i] - price[i]);
			}
			System.out.println("#"+t+" "+ans);
		}
	}
}
