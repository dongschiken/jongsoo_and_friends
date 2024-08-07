package com.ssafy.study.swea._3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.StringTokenizer;

public class 이동영_SWEA_7102_준홍이의카드놀이 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Map<Integer, Integer> map = new HashMap<>();
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());
		for (int i = 1; i <= T; i++) {
			st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			
			for (int j = 1; j <= N; j++) {
				for (int j2 = 1; j2 <= M; j2++) {
					int tmp = j+j2;
					map.compute(tmp, 
							(K, V) -> V == null ? 1 : ++V);	
				}
			}
			
			
			int max = Collections.max(map.values());
			Set <Entry <Integer, Integer>> sm = map.entrySet();
			Iterator<Entry <Integer, Integer>> ir = sm.iterator();
			bw.write("#"+i+" ");
			while (ir.hasNext()) {
				Entry<Integer, Integer> entry =  ir.next();
				if(entry.getValue() == max) {
					bw.write(entry.getKey()+" ");
				}
			}
			bw.write("\n");
			map.clear();
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
