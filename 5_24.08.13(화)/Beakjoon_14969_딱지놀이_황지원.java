package beak;

import java.util.Scanner;

public class no14696_딱지놀이 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 총 라운드 수
		for (int n = 0; n < N; n++) {

			// 4 < 3 < 2 < 1 순으로 비교
			// 카운트 정렬 활용하기
			int[] Acount = new int[5];
			int[] Bcount = new int[5];

			int a = sc.nextInt(); // 라운드 0에서 A가 내는 딱지의 나온 그림의 총 개수
			int[] A = new int[a];
			for (int i = 0; i < a; i++) {
				A[i] = sc.nextInt(); // A가 낸 딱지의 그림(1~4)
				Acount[A[i]]++;
			}
			
			int b = sc.nextInt(); // 라운드 0에서 B가 내는 딱지의 나온 그림의 총 개수
			int[] B = new int[b];
			for (int i = 0; i < b; i++) {
				B[i] = sc.nextInt(); // B가 낸 딱지의 그림(1~4)
				Bcount[B[i]]++;
			}
			
			// 
			for(int i = 4; i >= 1; i--) {
				if(Acount[i] > Bcount[i]) {
					System.out.println("A");
					break;
				} else if(Acount[i] < Bcount[i]) {
					System.out.println("B");
					break;
				} 
				if(i == 1 && Acount[i] == Bcount[i]) {
					System.out.println("D");
				}
			}
		}
	}
}
