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
        int[] dr = {1}; // ??κ°μ  ?΄? λ°©ν₯ (? λ³??)
        int[] dc = {1}; // ??κ°μ  ?΄? λ°©ν₯ (?΄ λ³??)
        StringTokenizer st = new StringTokenizer(br.readLine());
        int w = Integer.parseInt(st.nextToken()); // ?΄? μ΅λ? κ°? (κ°?λ‘?)
        int h = Integer.parseInt(st.nextToken()); // ?? μ΅λ? κ°? (?Έλ‘?)
        st = new StringTokenizer(br.readLine());
        int startC = Integer.parseInt(st.nextToken()); // ?? ?΄
        int startR = Integer.parseInt(st.nextToken()); // ?? ?
        int time = Integer.parseInt(br.readLine()); // μ£Όμ΄μ§? ?κ°?

        // κ°λ?Έμ ??¬ ?μΉ?
        int currentR = startR;
        int currentC = startC;
        
        // ?κ°λ§?Ό ?΄?
        for (int t = 0; t < time; t++) {
            // ?€? ?μΉ? κ³μ°
            currentR += dr[0];
            currentC += dc[0];
            
            // κ²½κ³ μ²΄ν¬ λ°? λ°©ν₯ λ°μ¬
            if (currentR == 0 || currentR == h) {
                dr[0] = -dr[0];
            }
            if (currentC == 0 || currentC == w) {
                dc[0] = -dc[0];
            }
        }
        // κ²°κ³Ό μΆλ ₯
        bw.write(currentC + " " + currentR + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}
