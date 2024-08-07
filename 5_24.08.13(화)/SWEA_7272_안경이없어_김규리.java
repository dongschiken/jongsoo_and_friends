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

        String AD = "ADOPQR";
        String CE = "CEFGHIJKLMNSTUVWXYZ";

        if (first.length() == second.length()) {
            for (int d = 0; d < first.length(); d++) {
                String f = Character.toString(first.charAt(d));
                String s = Character.toString(second.charAt(d));

                if ((f.equals("B") && s.equals("B"))
                    || (AD.contains(f) && AD.contains(s))
                    || (CE.contains(f) && CE.contains(s))) {
                    continue;
                } else {
                    ans = "DIFF";
                }

            }
        } else {
            ans = "DIFF";
        }

        System.out.println("#" + n + " " + ans);
    }

}
}