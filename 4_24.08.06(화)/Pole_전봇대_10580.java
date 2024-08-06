import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
 
public class Pole_전봇대_10580 {
 
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());
        for (int i = 1; i <= T; i++) {
        	List<int[]> list = new ArrayList<>();
            int N = Integer.parseInt(br.readLine());
            for (int k = 0; k < N; k++) {
                st = new StringTokenizer(br.readLine());
                int left = Integer.parseInt(st.nextToken());
                int right = Integer.parseInt(st.nextToken());
                list.add(new int[] {left, right});
            }
            int count = 0;
            for (int j = 1; j < list.size(); j++) {
            	int[] temp = list.get(j);
				for (int j2 = 0; j2 < j; j2++) {
					if(list.get(j2)[0] < temp[0] && list.get(j2)[1] > temp[1] || list.get(j2)[0] > temp[0] && list.get(j2)[1] < temp[1]) count++;
				}
			}
            bw.write("#"+i+" "+count+"\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}