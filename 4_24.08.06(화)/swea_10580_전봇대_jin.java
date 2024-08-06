
import java.util.ArrayList;
import java.util.Scanner;

public class swea_10580_전봇대 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int TC = sc.nextInt(); //전체 테스트케이스 수 
		for (int tc = 1; tc <= TC; tc++) {
			int N = sc.nextInt(); // 각 케이스 전선 갯수.

			if (N == 1) // 전선 1개면 교차 0개
				System.out.printf("#%d 0", tc);

			int[] listr = new int[1000]; 
			int[] listc = new int[1000];
			int count=0;
			
			for (int i = 0; i < N; i++) { // 리스트에 값 추가하기.
				listr[i]=sc.nextInt(); //Ai
				listc[i]=sc.nextInt(); //Bi
			}
			
			for (int i = 0; i < N ; i++) {
				for (int j = 0; j < N; j++) {
					if (listr[i] < listr[j] && listc[i] > listc[j]) { //3사분
						count++;
					}
					if (listr[i] > listr[j] && listc[i] < listc[j]) { //1사분
						count++;
					}
				}
			}
			System.out.printf("#%d %d",tc,count/2);
			System.out.println();

		}

	}

}
