
import java.util.Scanner;

public class swea_1244_최대상금 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 1; i <= t; i++) {

			int number = sc.nextInt();
			int count = sc.nextInt();

			String answer = null;
			String numString = Integer.toString(number);
			
			char[] charList = numString.toCharArray();

			int[] list = new int[charList.length];
			int count2 = count - list.length;

			for (int j = 0; j < charList.length; j++) {
				list[j] = charList[j] - '0'; // list에 char형식을 int 형식으로 변환해서 넣기.
			}
			if (list.length == 1)
				System.out.println("#" + i + " " + list[0]);
			else if (list.length == 2) {
				if (count % 2 == 1) {
					System.out.printf("#%d %d%d", i, list[1], list[0]);
					System.out.println();
				} else {
					System.out.printf("#%d %d%d", i, list[0], list[1]);
					System.out.println();
				}
			} else {
				out: while (count > 0) {
					for (int j = 0; j <= list.length - 2; j++) {
						if (count == 0)
							break;
						int maxIdx = j;

						for (int a = j + 1; a <= list.length - 1; a++) { // 최댓값 찾기.
							if (list[a] >= list[maxIdx]) {
								maxIdx = a;
							}

						}
						if (j != maxIdx) { // j 인덱스가 최대가 아닌경우 바꾸기.
							int temp = list[maxIdx];
							list[maxIdx] = list[j];
							list[j] = temp;
							count--;
						}
						if (j == list.length - 2) // 끝까지 비교 다 했으면 나가기.
							break out;
					}
				}

				if ((count) % 2 == 1) {
					boolean same = false;

					for (int a = 0; a < list.length - 2; a++) {
						if (list[a] == list[a + 1])
							same = true;
						break;
					}

					if (!same) {

						int min1 = list[list.length - 1];
						int min2 = list[list.length - 2];
						list[list.length - 1] = min2;
						list[list.length - 2] = min1;
					}
				}

				StringBuilder sb = new StringBuilder();
				for (int a : list) {
					sb.append(a);
				}
				answer = sb.toString();

				System.out.println("#" + i + " " + answer);
				System.out.flush();
			}
		}
	}
}
