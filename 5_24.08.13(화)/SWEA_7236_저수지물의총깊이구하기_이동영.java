import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Solution {
	static int[] dr = {1, -1, 0, 0, 1, 1, -1, -1};
	static int[] dc = {0, 0, 1, -1, 1, -1, 1, -1};
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int[][] map;
		int T = Integer.parseInt(br.readLine());
		for (int i = 1; i <= T; i++) {
			int N = Integer.parseInt(br.readLine());
			map = new int[N][N];
			
			// G 일때는 1, W 일때는 2
			for (int j = 0; j < map.length; j++) {
				st = new StringTokenizer(br.readLine());
				for (int k = 0; k < map.length; k++) {
					if(st.nextToken().equals("G")) map[j][k] = 1;
					else map[j][k] = 2;
				}
			}
			
			// G가 8개 나와서 0이되면 1로 바꾼다.
			int max = 0;
			for (int j = 0; j < map.length; j++) {
				for (int j2 = 0; j2 < map[j].length; j2++) {
					if(map[j][j2] == 1) continue;
					max = Math.max(searchMap(map, j, j2), max);
				}
			}
			bw.write("#"+i+" "+max+"\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}
  // 8방탐색하는 메서드
	private static int searchMap(int[][] map, int j, int j2) {
		int count = 0;
		for (int i = 0; i < 8; i++) {
			int nr = j+dr[i];
			int nc = j2+dc[i];
			
			if(nr >= 0 && nr < map.length && nc >= 0 && nc < map[j].length && map[nr][nc] == 2) {
				count++;
			}
		}
		if(count == 0) count = 1;
		return count;
	}

}
