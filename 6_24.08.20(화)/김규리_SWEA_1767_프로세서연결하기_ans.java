package sweaD4;
//https://swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AV4suNtaXFEDFAUf

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/*
 백트래킹 
 * */


public class Solution1767_프로세서연결하기_ans {
	static class Core {
		int x, y;

		public Core(int y, int x) {
			this.y = y;
			this.x = x;
		}
	}

	static int N, cell[][], minWire, maxCore;
	static int[] dx = { 0, 0, -1, 1 };
	static int[] dy = { 1, -1, 0, 0 };
	static List<Core> coreList;

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();

		int T = Integer.parseInt(br.readLine());
		for (int t = 1; t <= T; t++) {
			N = Integer.parseInt(br.readLine());

			cell = new int[N][N];
			coreList = new ArrayList<>();

			for (int i = 0; i < N; i++) {
				st = new StringTokenizer(br.readLine());
				for (int j = 0; j < N; j++) {
					int in = Integer.parseInt(st.nextToken());
					if (in == 1) {
						cell[i][j] = in;

						if (i == 0 || j == 0 || i == N - 1 || j == N - 1) {
							continue;
						}
						coreList.add(new Core(i, j));
					}
				}
			}
			minWire = Integer.MAX_VALUE;
			maxCore = Integer.MIN_VALUE;

			startConnect(0, 0, 0);
			sb.append("#" + t + " " + minWire + "\n");
		}

		System.out.println(sb.toString());
	}

	public static void startConnect(int idx, int coreCnt, int wireCnt) {
		if (idx == coreList.size()) {
			if (maxCore < coreCnt) { // 최대한 많은 core
				maxCore = coreCnt;
				minWire = wireCnt;
			} else if (maxCore == coreCnt) { // 그 중 전선 길이 합이 최소가 되는 값
				minWire = Math.min(wireCnt, minWire);
			}
			return;

		}
		//인덱스 위치의 코어 좌표 
		int x = coreList.get(idx).x;
		int y = coreList.get(idx).y;
		
		//사방 탐색 
		for (int d = 0; d < 4; d++) {
			int count = 0;
			int nx = x;
			int ny = y;

			while (true) {
				nx += dx[d];
				ny += dy[d];

				//범위를 벗어남 => 다른 코어나 전선 안 만남 
				if (ny < 0 || ny >= N || nx < 0 || nx >= N) {
					break;
				}
				
				//가는 길에 다른 코어 혹은 전선 존재 -> 다른 방향으로 
				if (cell[ny][nx] == 1) {
					count = 0;
					break;
				}
				
				//어떠한 방해도 없다면 + 1
				count++;
				
			}
			
			//카운트 갯수만큼 1로 채워줌 
			int fill_x = x;
			int fill_y = y;
			
			for (int i = 0; i < count; i++) {
				fill_x += dx[d];
				fill_y += dy[d]; 
				cell[fill_y][fill_x] = 1;
			}
			
			if (count == 0) { //cell을 만났으면 다음 셀로 넘어가기 
				startConnect(idx + 1, coreCnt, wireCnt);
			} else {		  //셀 안 만났으면 다음 셀, 연결된 코어 + 1, 와이어 숫자 + 새로 센 숫자 
				
				startConnect(idx + 1, coreCnt + 1, wireCnt + count);
				
				//원본맵을 다시 0으로 되돌림 
				fill_x = x;
				fill_y = y;
				
				for (int i = 0; i < count; i++) {
					fill_x += dx[d];
					fill_y += dy[d];
					cell[fill_y][fill_x] = 0;
				}
			}
			
			
		}

	}

}
