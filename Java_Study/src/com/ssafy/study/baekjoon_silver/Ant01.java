package com.ssafy.study.baekjoon_silver;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Ant01 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] dr = {1}; // ??ê°ì„  ?´?™ ë°©í–¥ (?–‰ ë³??™”)
        int[] dc = {1}; // ??ê°ì„  ?´?™ ë°©í–¥ (?—´ ë³??™”)
        StringTokenizer st = new StringTokenizer(br.readLine());
        int w = Integer.parseInt(st.nextToken()); // ?—´?˜ ìµœë? ê°? (ê°?ë¡?)
        int h = Integer.parseInt(st.nextToken()); // ?–‰?˜ ìµœë? ê°? (?„¸ë¡?)
        st = new StringTokenizer(br.readLine());
        int startC = Integer.parseInt(st.nextToken()); // ?‹œ?‘ ?—´
        int startR = Integer.parseInt(st.nextToken()); // ?‹œ?‘ ?–‰
        int time = Integer.parseInt(br.readLine()); // ì£¼ì–´ì§? ?‹œê°?

        // ê°œë?¸ì˜ ?˜„?¬ ?œ„ì¹?
        int currentR = startR;
        int currentC = startC;
        
        // ?‹œê°„ë§Œ?¼ ?´?™
        for (int t = 0; t < time; t++) {
            // ?‹¤?Œ ?œ„ì¹? ê³„ì‚°
            currentR += dr[0];
            currentC += dc[0];
            
            // ê²½ê³„ ì²´í¬ ë°? ë°©í–¥ ë°˜ì‚¬
            if (currentR == 0 || currentR == h) {
                dr[0] = -dr[0];
            }
            if (currentC == 0 || currentC == w) {
                dc[0] = -dc[0];
            }
        }
        // ê²°ê³¼ ì¶œë ¥
        bw.write(currentC + " " + currentR + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}
