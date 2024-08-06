package study_0806;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Solution1244_최대상금 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int t = 1; t <= T; t++) {

			char[] charNums = sc.next().toCharArray();
			int[] num = new int[charNums.length];

			for (int i = 0; i < charNums.length; i++) {
				num[i] = Character.getNumericValue(charNums[i]);
			}

			int change = sc.nextInt();

			// 내림차순 정렬.. 이게 맞는건지..ㅋ
			int[] sorted = Arrays.copyOf(num, num.length);
			sorted = Arrays.stream(sorted).boxed().sorted(Comparator.reverseOrder()).mapToInt(Integer::intValue)
					.toArray();

			done: while (change > 0) {

				// 내림차순과 다르면 그 이후 정렬 순서와 다른,
				// 가장 큰 값과 자리 바꿈
				for (int l = 0; l < num.length; l++) {
					if (num[l] != sorted[l]) {
						int max = 0;
						int idx = 0;
						for (int i = l; i < num.length; i++) {
							if (max < num[i] && num[i] != sorted[i]) {
								max = num[i];
								idx = i;
							}
						}
						int imsi = num[idx];
						num[idx] = num[l];
						num[l] = imsi;
						change--;
						continue done;
					}

				}

				// 정렬이 다 되었다면 남은 change의 수에 따라 자리 바꿈
				done2:
				if (change % 2 == 1) {
					for (int i = 0; i < num.length - 1; i++) {
						for (int j = i + 1; j < num.length; j++) {
							if (num[i] == num[j]) {
								break done2;
							}
						}
					}
					int imsi = num[num.length - 1];
					num[num.length - 1] = num[num.length - 2];
					num[num.length - 2] = imsi;
					break done2;
				}

				change = 0;
			}

			System.out.print("#" + t + " ");
			for (int n : num) {
				System.out.print(n);
			}
			System.out.println();
		}

	}

}
