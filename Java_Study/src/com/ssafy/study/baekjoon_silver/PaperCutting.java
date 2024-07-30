package com.ssafy.study.baekjoon_silver;

import java.io.*;
import java.util.*;

public class PaperCutting {
	
	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("data/PaperCutting.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new  StringTokenizer(br.readLine());
		int C = Integer.parseInt(st.nextToken());
		int R = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(br.readLine());
		HashSet<String> hs = new HashSet();
		hs.add("1");
		hs.add("1");
		System.out.println(hs);
		// 而ㅽ똿�쓣 湲곗��쑝濡� �굹�늿�떎.
		
		
	}
}

