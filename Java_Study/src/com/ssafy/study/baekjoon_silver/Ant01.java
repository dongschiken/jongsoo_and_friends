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
        int[] dr = {1}; // ??각선 ?��?�� 방향 (?�� �??��)
        int[] dc = {1}; // ??각선 ?��?�� 방향 (?�� �??��)
        StringTokenizer st = new StringTokenizer(br.readLine());
        int w = Integer.parseInt(st.nextToken()); // ?��?�� 최�? �? (�?�?)
        int h = Integer.parseInt(st.nextToken()); // ?��?�� 최�? �? (?���?)
        st = new StringTokenizer(br.readLine());
        int startC = Integer.parseInt(st.nextToken()); // ?��?�� ?��
        int startR = Integer.parseInt(st.nextToken()); // ?��?�� ?��
        int time = Integer.parseInt(br.readLine()); // 주어�? ?���?

        // 개�?�의 ?��?�� ?���?
        int currentR = startR;
        int currentC = startC;
        
        // ?��간만?�� ?��?��
        for (int t = 0; t < time; t++) {
            // ?��?�� ?���? 계산
            currentR += dr[0];
            currentC += dc[0];
            
            // 경계 체크 �? 방향 반사
            if (currentR == 0 || currentR == h) {
                dr[0] = -dr[0];
            }
            if (currentC == 0 || currentC == w) {
                dc[0] = -dc[0];
            }
        }
        // 결과 출력
        bw.write(currentC + " " + currentR + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}
