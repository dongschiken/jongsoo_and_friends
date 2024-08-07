package sweaD3;

import java.util.Scanner;

public class Solution7272_안경이없어 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

    for (int n = 1; n <= N; n++) {
        String first = sc.next();
        String second = sc.next();

        String ans = "SAME";

        //스트링 두 묶음 만들기 
        String AD = "ADOPQR";
        String CE = "CEFGHIJKLMNSTUVWXYZ";

        //앞에서부터 하나씩 뜯어서 비교 
        if (first.length() == second.length()) {
            for (int d = 0; d < first.length(); d++) {
                String f = Character.toString(first.charAt(d));
                String s = Character.toString(second.charAt(d));

                //둘 다 AD의 알파벳과 겹치거나 CE 알파벳과 겹치거나 하면 넘어가고 그 외는 DIFF로 바뀜 
                if ((f.equals("B") && s.equals("B"))
                    || (AD.contains(f) && AD.contains(s))
                    || (CE.contains(f) && CE.contains(s))) {
                    continue;
                } else {
                    ans = "DIFF";
                }

            }
            //길이가 다르면 DIFF
        } else {
            ans = "DIFF";
        }

        System.out.println("#" + n + " " + ans);
    }

}
}
