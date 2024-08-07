package sw.D3;

import java.util.Scanner;

public class no7964_부먹왕국의차원관문 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for(int t = 1; t <= T; t++) {
			int ans = 0;
			int N = sc.nextInt(); // 부먹 왕국의 도시 수
			int D = sc.nextInt(); // 이동 제한 거리
			int[] arr = new int[N+2]; // 0번째와 N+1째에는 차원관문이 있기때문에
			arr[0] = 1;
			arr[N+1] = 1;
			for(int i = 1; i <= N; i++) {
				arr[i] = sc.nextInt();
			}
			
			// 모든 관문이 직접적으로 이동 가능해야 함
			// 아이디어 : 연속되는 0의 개수가 D개면 안된다
			// D개 되면 그 자리를 1로 바꾼다!
			int index = 0;
			int zeroCnt = 0;
			while(index < arr.length) {
				if(arr[index] == 1) {
					++index;
					zeroCnt = 0; // 이거 꼭 해줘야 함!!
				} else {
					++zeroCnt;
					if(zeroCnt == D) {
						arr[index] = 1;
						++ans;
						zeroCnt = 0;
					}
					++index;
				}
			}
			System.out.println("#"+t+" "+ans);
		}
	}
}
