package com.ssafy.study.swea._2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class MemoryRestore {

	public static void main(String[] args) throws NumberFormatException, IOException {
		System.setIn(new FileInputStream("data/MemoryRestore.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		for (int i = 0; i < T; i++) {
			
			String[] token = br.readLine().split("");
			
			int[] target = new int[token.length];
			int[] original = new int[token.length];
			for (int j = 0; j < token.length; j++) {
				target[j] = Integer.parseInt(token[j]);
			}
//			System.out.println(Arrays.toString(target));
			
			int count = 0;
			for (int j = 0; j < token.length; j++) {
				if(original[j] != target[j]) {
					count++;
					int temp = 0;
					if(target[j] == 0) temp = 0;
					if(target[j] == 1) temp = 1;
					for (int j2 = j; j2 < token.length; j2++) {
						original[j2] = temp;
					}
				}
			}
			bw.write("#"+(i+1)+" "+count+"\n");
		}
		bw.flush();
		bw.close();
	}
}
