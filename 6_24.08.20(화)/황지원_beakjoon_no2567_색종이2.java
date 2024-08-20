package beak;

import java.util.Scanner;

public class no2567_색종이2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); 
		int[][] paper = new int[100][100];
		
		// 색종이 붙이기
		for(int i = 0; i < N; i++) {
			int x = sc.nextInt(); 
			int y = sc.nextInt();
			for(int dx = 0; dx < 10; dx++) {
				for(int dy = 0; dy < 10; dy++) {
					paper[x+dx][y+dy] = 1;
				}
			}
		}

		// 둘레 계산
		// 현재 칸이 1이고 상하좌우 중 0인 칸이 있다면, 그 방향의 변이 둘레에 포함
		int perimeter = 0;
		int[] dx = {-1, 1, 0, 0};
		int[] dy = {0, 0, -1, 1};
		for(int x = 0; x < 100; x++) {
			for(int y = 0; y < 100; y++) {
				if(paper[x][y] == 1) {
					for(int k = 0; k < 4; k++) {
						int nx = x + dx[k];
						int ny = y + dy[k];
						// or 연산자를 사용한 이유
						// 배열의 범위를 벗어나는 경우 == 도화지의 경계라는 뜻 
						// 도화지의 경계에 붙어있다면 둘레로 간주해야 하기 때문
						if(nx < 0 || nx >= 100 || ny < 0 || ny >= 100 || paper[nx][ny] == 0) {
							perimeter++;
						}
					}
				}
			}
		}
		System.out.println(perimeter);
	}
}
