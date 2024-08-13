import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());
		int[] arr;
		for (int i = 1; i <= T; i++) {
			st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken()); // 왕국 갯수
			int M = Integer.parseInt(st.nextToken()); // 제한 거리
			
			arr = new int[N+2];
			arr[0] = 1;
			arr[arr.length-1] = 1;
			
			st = new StringTokenizer(br.readLine());
			for (int j = 1; j < arr.length-1; j++) {
				arr[j] = Integer.parseInt(st.nextToken());
			}
			
			int cnt = 0;
			int warpGate = 0;
			for (int j = 0; j < arr.length; j++) {
				cnt++;
        // 만약 1이 나오면 카운트를 0으로 초기화
				if(arr[j] == 1) {
					cnt = 0;
				}
        // 만약 카운트가 제한거리만큼 커지고, 그때의 arr[j]가 0인경우 워프게이트의 갯수를 늘린다.
				if(cnt == M && arr[j] == 0) {
					warpGate += 1;
					cnt = 0;
				}
			}
			bw.write("#"+i+" "+warpGate+"\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
