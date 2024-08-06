
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Security_경비원_2564 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		List<int[]> list = new ArrayList<>();
		int c = Integer.parseInt(st.nextToken());
		int r = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(br.readLine());
		int[][] map = new int[r+1][c+1];
		// 모든 좌표값 넣어놓고, 마지막에 들어가는 값이 현재 위치
		for (int i = 0; i < N+1; i++) {
			st = new StringTokenizer(br.readLine());
			int command = Integer.parseInt(st.nextToken());
			switch (command) {
			// 북
			case 1:
				list.add(new int[]{0, Integer.parseInt(st.nextToken())});
				break;
			// 남
			case 2:
				list.add(new int[]{r, Integer.parseInt(st.nextToken())});
				break;
			// 서
			case 3:
				list.add(new int[]{Integer.parseInt(st.nextToken()), 0});
				break;
			// 동
			default:
				list.add(new int[]{Integer.parseInt(st.nextToken()), c});
				break;
			}
		}
		// 현재위치가 nr, nc
		int nr = list.get(N)[0];
		int nc = list.get(N)[1];
		int count = 1;
		// 동서남북에서 시작할때 각각의 조건을 줘서 배열의 가장 바깥쪽 방을 순회하면서 count를 넣기
		do {
			if(nr == r) {
				nc += -1;
				map[nr][nc] = count++;
				if(nc == 0) {
					nr -= 1;
					map[nr][nc] = count++;
				}
			}else if(nc == 0) {
				nr -= 1;
				map[nr][nc] = count++;
				if(nr == 0) {
					nc += 1;
					map[nr][nc] = count++; 
				}
			}else if(nr == 0) {
				nc += 1;
				map[nr][nc] = count++;
				if(nc == c) {
					nr += 1;
					map[nr][nc] = count++;
				}
			}else {
				nr += 1;
				map[nr][nc] = count++;
				if(nr == r) {
					nc -= 1;
					map[nr][nc] = count++;
				}
			}
		} while (nr != list.get(N)[0] || nc != list.get(N)[1]);

		count -= 1;
		int sum = 0;
		// 각각의 좌표값에 들어있는 숫자를 꺼내와서 count-숫자 와 비교
		for (int i = 0; i < N; i++) {
			int temp = map[list.get(i)[0]][list.get(i)[1]];
			sum += (Math.min(temp, count-temp));
		}
		System.out.println(sum);
		
	}
}
