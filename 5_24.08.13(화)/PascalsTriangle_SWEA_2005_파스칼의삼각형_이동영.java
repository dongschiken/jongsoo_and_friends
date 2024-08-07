package com.ssafy.study.swea._2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class PascalsTriangle_SWEA_2005_파스칼의삼각형_이동영 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(br.readLine());
		
		for (int i = 1; i <= T; i++) {
			int N = Integer.parseInt(br.readLine());
			int[][] arr = new int[N][N+1];

			// 배열로 설명하면 5 * 5 배열
			// 0 1 0 0 0 0 -> 0, 1번 좌표를 1로 바꿈
			// 0 1 1 0 0 0 -> 상단의 0, 0 + 0, 1 / 0, 1 + 0, 2 위치를 현재좌표에 더한다. 
			// 0 1 2 1 0 0 -> 상단의 0, 0 + 0, 1/ 0, 1 + 0, 2 / 0, 2 + 0, 3 위치를 현재좌표에 더한다.
			// 0 1 3 3 1 0 -> ...
			// 0 1 4 6 4 1 -> 최종적으로 마지막 좌표까지 오면 숫자가 다 찍힌다.
			arr[0][1] = 1;
			for (int j = 1; j < arr.length; j++) {
				for (int j2 = 1; j2 < arr[j].length; j2++) {
					arr[j][j2] = arr[j-1][j2-1] + arr[j-1][j2];
				}
			}
			bw.write("#"+i+"\n");
			for (int j = 0; j < arr.length; j++) {
				for (int j2 = 1; j2 < arr[j].length; j2++) {
					if(arr[j][j2] != 0) {
						bw.write(arr[j][j2]+" ");
					}
				}
				bw.write("\n");
			}
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
