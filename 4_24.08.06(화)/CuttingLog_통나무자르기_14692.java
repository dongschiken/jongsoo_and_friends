

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class CuttingLog_통나무자르기_14692 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		for (int i = 1; i <= T; i++) {
			int N = Integer.parseInt(br.readLine());
			
			if(N % 2 == 0) bw.write("#"+(i)+" Alice\n");
			else bw.write("#"+(i)+" Bob\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}
}

