package com.ssafy.study.swea._3;

import java.io.*;
import java.util.*;

public class Magnetic {

	public static void main(String[] args) throws IOException {
		System.setIn(new FileInputStream("data/Magnetic.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int T = 10;
		for (int i = 0; i < T; i++) {

			int N = Integer.parseInt(br.readLine());
			int count = 0;
			int[][] map = new int[N][N];

			for (int j = 0; j < N; j++) {
				st = new StringTokenizer(br.readLine());
				for (int j2 = 0; j2 < N; j2++) {
					map[j][j2] = Integer.parseInt(st.nextToken());
				}
			}
			for (int c = 0; c < N; c++) {
				int prev = 0;
				for (int r = 0; r < N; r++) {

					if(map[r][c] == 0) continue;
					if(map[r][c] == 2 && prev == 1) count++;

					prev = map[r][c];		
				}
			}
			bw.write("#"+(i+1)+" "+count+"\n");
		}
		bw.flush();
		bw.close();
	}
}