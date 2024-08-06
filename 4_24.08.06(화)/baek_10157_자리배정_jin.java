
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.nio.Buffer;
import java.util.Arrays;

public class baek_10157_자리배정 {
	// 개미 방법처럼 풀 순 없나? 목 짝수일때만. 나머지로 위치 변경
	// 그냥 돌려가면서 인덱스 넣어서 풀자.

	// 돌리는방법 %4로

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] strArr = br.readLine().split(" ");
		int rSize = Integer.parseInt(strArr[1]);
		int cSize = Integer.parseInt(strArr[0]);
		int N = Integer.parseInt(br.readLine());

		int[][] arr = new int[rSize][cSize];

		int[] dr = { -1, 0, 1, 0 }; // 상 우 하 좌
		int[] dc = { 0, 1, 0, -1 }; // 상 우 하 좌

		int r = rSize - 1; // 시작지점
		int c = 0;
		int d = 0;
		int count = 0;
		int nr = 0;
		int nc = 0;

		while (count < rSize * cSize) {
			arr[r][c] = ++count;
			nr = r + dr[d];
			nc = c + dc[d];
			// 또는 다음 행 or 열이 0이 아닐때. (이미 값이 있을때.)
			if (nr < 0 || nr > rSize - 1 || nc < 0 || nc > cSize - 1 || (arr[nr][nc] != 0)) {
				nr = r - dr[d];
				nc = c - dc[d];
				d = (++d) % 4;
				nr = r + dr[d];
				nc = c + dc[d];
			}
			r = nr;
			c = nc;

		}
//		for (int i = 0; i < rSize; i++) {
//			for (int j = 0; j < cSize; j++) {
//				System.out.print(arr[i][j]);
//			}
//			System.out.println();
//		}
		boolean find = false;
		int answerR = 0;
		int answerC = 0;
		out1: for (int i = 0; i < rSize; i++) {
			for (int j = 0; j < cSize; j++) {
				if (arr[i][j] == N) {
					answerR = i;
					answerC = j;
					find = true;
					System.out.println((answerC+1) +" "+ (rSize-answerR) );
					break out1;
				}

			}
		}
		if (!find)
			System.out.println(0);
	}
}
