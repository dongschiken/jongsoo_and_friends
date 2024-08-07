package com.ssafy.study.swea._3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CardCounting_SWEA_4047_영준이의카드카운팅_이동영 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		OUT:
		for (int i = 1; i <= T; i++) {
			// 3개씩 잘라서 맵에 넣고 다넣으면 돌면서 -1 확인하고
			// 전부다 돌아서 S, D, H, C가 몇개있는지 체크
			Map<String, Integer> map = new HashMap<>();
			String str = br.readLine();
			String[] strArr = new String[str.length()/3];
			for (int j = 0, k = 0; j < str.length(); j += 3, k++) {
				strArr[k] = str.substring(j, j+3); 
			}
			// 맵을 순회하면서 문자열 넣을때 동일한 값이 있으면 -1 없으면 1 ( 중복체크 )
			for (int j = 0; j < strArr.length; j++) {
				map.compute(strArr[j], 
						(K, V) -> V != null ? -1 : 1);
			}
			
			int S = 0;
			int D = 0;
			int H = 0;
			int C = 0;

			// 현재 맵에 담겨있는 값을 기준으로 value에 -1이 찍혀있으면 동일한 값이 들어온거니까 ERROR를 출력
			// S, D, H, C를 현재 키값에 있으면 ++
			Set<Entry<String, Integer>> sm = map.entrySet();
			Iterator<Entry<String, Integer>> ir = sm.iterator();
			while (ir.hasNext()) {
				Map.Entry<String, Integer> entry = (Map.Entry<String, Integer>) ir.next();
				
				if(entry.getValue() == -1) {
					bw.write("#"+i+" ERROR\n");
					continue OUT;
				}
				if(entry.getKey().contains("S")) {
					S++;
				}else if(entry.getKey().contains("D")) {
					D++;
				}else if(entry.getKey().contains("H")) {
					H++;
				}else {
					C++;
				}
			}
			S = Math.abs(S-13);
			D = Math.abs(D-13);
			H = Math.abs(H-13);
			C = Math.abs(C-13);
			bw.write("#"+i+" "+S+" "+D+" "+H+" "+C+"\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
