package week_04;

import java.util.Scanner;

public class SWEA_7964_부먹왕국의차원관문_진종수 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {

			int cityCount = sc.nextInt();
			int distance = sc.nextInt();
			int[] map = new int[cityCount];
			for (int i = 0; i < cityCount; i++) {
				map[i] = sc.nextInt();
			}

			int idx = -1;
			int count = 0;

			while (idx < cityCount) {
				 // 현 인덱스로부터 최대 거리부터 문 있는지 검사.
					boolean find = false;

					
					if (idx + distance < cityCount) { // 문 있으면 break; 인덱스 다음 인덱스로.
						for (int j = distance; j >= 1; j--) {
							if (idx + j<cityCount &&map[idx + j] == 1) {
								idx += j;
								find = true;
								break;
							}
						}
					}

					if (!find) { // 문이 없으면 가장 먼 곳에 문 만들고, 인덱스 변경.
						if (idx == -1) {
							map[distance - 1] = 1;
							count++;
							idx = distance - 1;
						}
						else if (idx + distance < cityCount) {
							idx += distance;
							map[idx] = 1;
							count++;
						} else
							break;
					}

				
			}
			System.out.printf("#%d %d \n", tc, count);
		}
	}
}
