package com.ssafy.study.swea._3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class PatternTest_SWEA_2007_패턴마디의길이_이동영 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(br.readLine());
		for (int i = 1; i <= T; i++) {
			String str = br.readLine();
			int index = 0;
			for (int j = 1; j <= 10; j++) {
				
				String tmp1 = str.substring(0, j);
				String tmp2 = str.substring(j, j*2);
				if(tmp2.equals(tmp1)) {
					index = j;
					break;
				}
			}
			bw.write("#"+i+" "+index+"\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
