import java.util.Scanner;
 
public class Solution {
    public static void main(String[] args) {
         
        Scanner sc = new Scanner(System.in);
        int TC = sc.nextInt();
         
        for(int t = 0; t < TC; t++) {
            String ans;
            int N = sc.nextInt(); // 통나무 길이
             
            if(N % 2 == 0) ans = "Alice";
            else ans = "Bob";
             
            System.out.println("#"+(t+1)+" "+ ans);
        }
    }
}
