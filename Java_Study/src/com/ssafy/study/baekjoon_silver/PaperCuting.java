//package com.ssafy.study.baekjoon_silver;
//
//import java.io.BufferedReader;
//import java.io.BufferedWriter;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.io.OutputStreamWriter;
//import java.util.Arrays;
//import java.util.StringTokenizer;
//
//public class PaperCuting {
//	static int[][] map;
//	public static void main(String[] args) throws NumberFormatException, IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		StringTokenizer st;
//		int N = Integer.parseInt(br.readLine());
//		int M = Integer.parseInt(br.readLine());
//		int T = Integer.parseInt(br.readLine());
//		int[] dr = {1, -1, 0, 0};
//		int[] dc = {0, 0, 1, -1};
//		map = new int[M][N];
//		
//		Arrays.fill(map, 1);
//		for (int i = 0; i < T; i++) {
//			st = new StringTokenizer(br.readLine());
//			int command = Integer.parseInt(st.nextToken());
//			int startPoint = Integer.parseInt(st.nextToken());
//
//			// 만약 0이면 가로방향으로 N지점 까지 반복해서 1로 초기화 해준다.
//			if(command == 0) {
//				for (int j = 0; j < N; j++) {
//					map[startPoint++][0] = 0;
//				}
//			} else {
//				for (int j = 0; j < M; j++) {
//					map[0][startPoint++] = 0;
//				}
//			}
//			// nr, nc가 1이면 +1 / 0이면 +0
//		}
//		OUT:
//		while (true) {
//			int count = 0;
//			
//			for (int i = 0; i < M; i++) {
//				for (int j = 0; j < N; j++) {
//					if(map[i][j] == 1) {
//						paperCheck(j, i, count);
//						continue OUT;
//					}
//				}
//			}
//			break;
//		}
//		
//	}
//
//	private static int paperCheck(int j, int i, int count) {
//		
//		
//		
//		return count;
//	}
//	
//}
