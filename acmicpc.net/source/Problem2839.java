// https://www.acmicpc.net/problem/2839

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem2839 {

    public void solve(int sugar) {

        int result = Integer.MAX_VALUE;

        for (int i = 0; i < 5000; i++) {
            for (int j = 0; j < 5000; j++) {
                if (3 * i + 5 * j == sugar) {
                    result = Math.min(i + j, result);
                }
            }
        }
        if (result == Integer.MAX_VALUE) {
            System.out.println(-1);
        } else {
            System.out.println(result);
        }
    }

    public static void main(String[] args) throws IOException {
        Problem2839 problem2839 = new Problem2839();
        problem2839.solve(18);
        problem2839.solve(6);
        problem2839.solve(4);
        problem2839.solve(11);
        problem2839.solve(9);
    }
}
