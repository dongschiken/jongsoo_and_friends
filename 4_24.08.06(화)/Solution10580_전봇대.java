package study_0806;

//테케가 적어서 약간 찜찜.. 

import java.util.Scanner;

public class Solution10580_전봇대 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int t = 1; t <= T; t++) {
			int N = sc.nextInt();
			int[][] num = new int[N][2];

			for (int n = 0; n < N; n++) {
				num[n][0] = sc.nextInt();
				num[n][1] = sc.nextInt();
			}

			int cnt = 0;

			for (int i = 0; i < N; i++) {
				for (int j = i+1; j < N; j++) {
					int max = 0;
					int min = 0;
					
					if (num[j][1] - num[j][0] > num[i][1] - num[i][0]) {
						max = j;
						min = i;
					} else {
						max = i;
						min = j;
					}

					if ((num[max][0] < num[min][0] && num[max][1] < num[min][1])
							|| (num[max][0] > num[min][0] && num[max][1] > num[min][1])) {
						continue;
					} else {
						cnt++;
					}

				}
			}
			
			System.out.println("#" + t + " " + cnt);

		}

	}

}
