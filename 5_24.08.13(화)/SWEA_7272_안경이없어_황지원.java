import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int t = 1; t <= T; t++) {
            boolean ans = false;
            String str = sc.next();
            String str2 =sc.next();
//            String[] arr = str.split(" "); // 빈칸을 기준으로 잘라서 문자열 저장

            if(!(str.length() == str2.length())) { // 애초에 비교할 배열 길이가 다르면 false
                ans = false;
            } else { // 비교할 배열 길이가 같다면 아래 로직 수행
                for(int i = 0; i < str.length();i++) {
                    char comp1 = str.charAt(i); // 왼쪽 문자열 하나씩 꺼내오기
                    char comp2 = str2.charAt(i); // 오른쪽 문자열 하나씩 꺼내오기

                    int comp1Num = 0;
                    int comp2Num = 0;

                    switch(comp1) {
                    case 'B' : comp1Num = 2; break;
                    case 'A' : 
                    case 'D' :
                    case 'O' :
                    case 'P' :
                    case 'Q' :
                    case 'R' : comp1Num = 1; break;
                    default : comp1Num = 0;
                    }

                    switch(comp2) {
                    case 'B' : comp2Num = 2; break;
                    case 'A' : 
                    case 'D' :
                    case 'O' :
                    case 'P' :
                    case 'Q' :
                    case 'R' : comp2Num = 1; break;
                    default : comp2Num = 0;
                    }

                    if(comp1Num != comp2Num) {
                        ans = false;
                        break;
                    }
                    ans = true;
                }
            } // end else

            System.out.println("#"+t+" "+ (ans ? "SAME" : "DIFF"));
        }
    }
}