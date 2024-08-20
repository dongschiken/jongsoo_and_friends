

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class SWEA_1860_진기의최고급붕어빵_진종수 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());

		for (int tc = 1; tc <= T; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken()); // 명
			int m = Integer.parseInt(st.nextToken()); // 초
			int k = Integer.parseInt(st.nextToken()); // 개
			int lateTime = 0;

			st = new StringTokenizer(br.readLine());
			ArrayList<Integer> a = new ArrayList<>(); // 손님 오는 시간 배열.
			for (int i = 0; i < n; i++) { // n명의 시간을 리스트에 저장.
				a.add(Integer.parseInt(st.nextToken()));
			}
			a.sort(null);

			// Arrays.sort(일반배열); 이렇게 해도 됌.
			String answer = "Possible";
			for (int i = 0; i < a.size(); i++) {
				int time = a.get(i); // 시간
				int bCount = (time / m) * k; // 각 시간마다의 빵의갯수

				if (i + 1 > bCount) { // i는 손님 리스트 idx(0부터시작). idx+1 = 손님수
					answer = "Impossible";
					break;
				}
			}
			System.out.printf("#%" + tc + " " + answer);
		}

	}
}
