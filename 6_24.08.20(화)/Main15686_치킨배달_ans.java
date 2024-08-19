package baekjoonGold;

import java.util.ArrayList;
import java.util.Scanner;

//풀이 참고함 ㅜㅜ 이게 왜 단지번호 붙이기랑 비슷한지 잘 모루겟..

public class Main15686_치킨배달_ans {
	static int N, M, graph[][], result = Integer.MAX_VALUE;
	static ArrayList<int[]> house, chicken, selected;
	static boolean[] visited;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();
		M = sc.nextInt();
		graph = new int[N][N];

		house = new ArrayList<>();
		chicken = new ArrayList<>();
		selected = new ArrayList<>();

		for (int y = 0; y < N; y++) {
			for (int x = 0; x < N; x++) {
				graph[y][x] = sc.nextInt();
				if (graph[y][x] == 1)
					house.add(new int[] { x, y });	//집의 좌표 저장
				else if (graph[y][x] == 2)
					chicken.add(new int[] { x, y }); // 치킨집 좌표 저장 
			}
		}

		visited = new boolean[chicken.size()]; //치킨집에 방문했는지 

		back(0, 0);
		System.out.println(result);
	}

	private static void back(int depth, int start) {
		if (depth == M) {
			int sum = 0;
			for (int[] h : house) {	//모든 집들과 치킨집 최소 거리 저장 
				int min = Integer.MAX_VALUE;
				for (int[] s : selected) { //선택한 M개의 치킨집과 집의 거리를 계산해 최소 거리 구함 
					int d = Math.abs(h[0] - s[0]) + Math.abs(h[1] - s[1]);
					min = Math.min(min, d);
				}
				sum += min;
			}
			result = Math.min(result, sum);
			return;
		}

		for (int i = start; i < chicken.size(); i++) { //모든 치킨집 탐색 
			if (!visited[i]) {
				visited[i] = true;
				selected.add(chicken.get(i));
				back(depth + 1, i + 1);
				selected.remove(selected.size() - 1); //탐색 끝나면 다시 한 빼기 
				visited[i] = false;
			}
		}
	}

}
