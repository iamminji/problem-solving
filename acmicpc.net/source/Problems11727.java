/* https://www.acmicpc.net/problem/11727 */

import java.util.Scanner;

public class Problems11727 {

  public int getTileCount(int tile) {

      if (tile <= 1) {
          return tile;
      } else if (tile == 2) {
          return 3;
      } else if (tile == 3) {
          return 5;
      }

      int[] dp = new int[tile + 1];

      dp[0] = 0;
      dp[1] = 1;
      dp[2] = 3;
      dp[3] = 5;

      for (int i = 4; i < tile + 1; i++) {
          dp[i] = (dp[i - 1] + 2 * dp[i - 2]) % 10007;
      }

      return dp[tile];
  }

  public static void main(String[] args) {

      Problems11727 main = new Problems11727();

      Scanner sc = new Scanner(System.in);
      int tile = sc.nextInt();
      System.out.println(main.getTileCount(tile));
  }
}
