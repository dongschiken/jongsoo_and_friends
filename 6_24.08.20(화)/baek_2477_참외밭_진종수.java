
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Vector;

public class baek_2477_참외밭_진종수 {
	/*
	 * 가로 세로최대 길이 구하기. 최대길이 양옆의 차 = 최소거리
	 *
	 */
	static int maxH, maxW, maxwIdx, maxhIdx;
	static int[] distance = new int[6];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		sc.nextLine();
		maxH = -1;
		maxW = -1;
		maxwIdx = -1;
		maxhIdx = -1;
		for (int i = 0; i < 6; i++) {
			StringTokenizer st = new StringTokenizer(sc.nextLine());
			int path = Integer.parseInt(st.nextToken());
			distance[i] = Integer.parseInt(st.nextToken());
			// 최대 가로, 세로 길이 구하고 해당 인덱스를 통해 빼야할 넓이 계산에 필요한 세로, 가로 길이를 구한다.
			if (path == 1 || path == 2) { // path가 가로인 경우.
				if (maxW < distance[i]) {
					maxW = distance[i];
					maxwIdx = i;
				}
			} else if (path == 3 || path == 4) {
				if (maxH < distance[i]) {
					maxH = distance[i];
					maxhIdx = i;
				}
			}
		}

		int smallSquare = lcal(maxwIdx) * lcal(maxhIdx);
		int result = ((maxW * maxH) - smallSquare) * k;
		System.out.println(result);

	}

	static int lcal(int maxIdx) {
		return Math.abs(distance[(maxIdx - 1 + 6) % 6] - distance[(maxIdx + 1) % 6]);
	}

}
