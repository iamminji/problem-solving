/* https://www.acmicpc.net/problem/9251 */
import java.util.Scanner;

public class Problems9251 {

    public int getLCS(String s1, String s2) {
        int size = 1001;
        int[][] dp = new int[size][size];

        String str1 = " " + s1;
        String str2 = " " + s2;

        for (int i = 0; i < str1.length(); ++i) {
            for (int j = 0; j < str2.length(); ++j) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 0;
                    continue;
                }
                if (str1.charAt(i) == str2.charAt(j)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        int max = -1;
        for (int i = 0; i < size; ++i) {
            for (int j = 0; j < size; ++j) {
                max = Math.max(dp[i][j], max);
            }
        }
        return max;
    }

    public static void main(String[] args) {

        Problems9251 main = new Problems9251();

        Scanner sc = new Scanner(System.in);

        String s1 = sc.next();
        String s2 = sc.next();

        System.out.println(main.getLCS(s1, s2));
    }
}
