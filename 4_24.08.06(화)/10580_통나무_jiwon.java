import java.util.Scanner;
 
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int TC = sc.nextInt();
        for (int t = 0; t < TC; t++) {
            int ans = 0;
            int N = sc.nextInt(); // 전선의 개수
 
            int[][] arr = new int[N][2];
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < 2; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }
 
            int count = (N - 1);
            while (count > 0) {
 
                // Bi 기준 가장 높은 전선 구하기
                int highestAi = 0;
                int highestBi = 0;
                int highestIndex = 0;
                for (int i = 0; i < N; i++) {
                    highestBi = Math.max(arr[i][1], highestBi);
                    if (highestBi == arr[i][1]) {
                        highestAi = arr[i][0];
                        highestIndex = i;
                    }
                }
 
                // 행은 작고, 열이 높다면 count++;
                for (int i = 0; i < N; i++) {
                    if (highestAi < arr[i][0] && highestBi > arr[i][1]) {
                        ++ans;
                    }
                }
 
                // 가장 높은 전선 배열에서 빼주기
                arr[highestIndex][0] = 0;
                arr[highestIndex][1] = 0;
                --count;
            }
 
            System.out.println("#" + (t + 1) + " " + ans);
        }
    }
}
