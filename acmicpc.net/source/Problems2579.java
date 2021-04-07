/* https://www.acmicpc.net/problem/2579 */
import java.util.Scanner;

public class Problems2579 {

    public int getMaxStairVal(int[] stairs) {
        if (stairs.length == 1) {
            return stairs[0];
        } else if (stairs.length == 2) {
            return stairs[0] + stairs[1];
        }

        int[] dp = new int[stairs.length];
        dp[0] = stairs[0];
        dp[1] = stairs[0] + stairs[1];
        dp[2] = Math.max(dp[0] + stairs[2], stairs[1] + stairs[2]);

        for (int i = 3; i < stairs.length; ++i) {
            dp[i] = Math.max(dp[i - 2] + stairs[i], dp[i - 3] + stairs[i - 1] + stairs[i]);
        }

        return dp[stairs.length - 1];
    }

    public static void main(String[] args) {
        Problems2579 main = new Problems2579();

        Scanner sc = new Scanner(System.in);
        int stairCount = sc.nextInt();
        int[] stairs = new int[stairCount];
        for (int i = 0; i < stairCount; ++i) {
            stairs[i] = sc.nextInt();
        }
        System.out.println(main.getMaxStairVal(stairs));
    }
}
