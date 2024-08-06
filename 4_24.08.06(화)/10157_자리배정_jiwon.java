import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int C = Integer.parseInt(st.nextToken()); // 가로(열)
		int R = Integer.parseInt(st.nextToken()); // 세로(행)
		int K = Integer.parseInt(br.readLine()); // K 번째 관객
		
		// 달팽이 만들기
		int[][] arr = new int[R][C];
		int num = 1;
		
		int r = (R - 1);
		int c = 0;
		
		int[] dr = {-1, 0, 1, 0};
		int[] dc = {0, 1, 0, -1};
		int d = 0;
		
		arr[r][c] = num++;

		int nr = r + dr[d];
		int nc = c + dc[d];
		
		while(num <= (R * C)) {
			arr[nr][nc] = num++;
			
			nr += dr[d];
			nc += dc[d];
			
			if(nr < 0 || nr >= R || nc < 0 || nc >= C || arr[nr][nc] != 0) {
				nr -= dr[d];
				nc -= dc[d];
				d = (d + 1) % 4;
				nr += dr[d];
				nc += dc[d];
			}
		}
		
		// 만약 모든 좌석이 배정된 경우는 0 출력 로직 만들기 
		if(K > num) {
			System.out.println(0);
			return;
		}
		
		int yy = 0;
		int xx = 0;
		// K번째 관객에게 맞는 좌표값 출력
		out : for(int i = 0; i < R; i++) {
			for(int j = 0; j < C; j++) {
				if(arr[i][j] == K) {
					xx = i;
					yy =j;
					break out;
				}
			}
		}

		System.out.println((yy + 1) + " " + (R - xx));
	}
}
