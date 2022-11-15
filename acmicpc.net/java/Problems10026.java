/* https://www.acmicpc.net/problem/10026 */
import java.util.Scanner;

public class Problems10026 {

    public boolean found(int i, int j, char prev, Character[][] array, boolean[][] cache) {

        if (i < 0 || j < 0 || i > cache.length-1 || j > cache.length-1) {
            return true;
        }

        if (cache[i][j]) {
            return true;
        }

        if (array[i][j] != prev) {
            return true;
        }

        cache[i][j] = true;

        return found(i+1, j,  array[i][j], array, cache) && found(i, j+1, array[i][j], array, cache) &&
                found(i, j-1, array[i][j], array, cache) && found(i-1, j, array[i][j], array, cache);
    }

    public int getResult(int size, Character[][] array) {

        boolean[][] cache = new boolean[size][size];
        int count = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                char prev = array[i][j];
                if (!cache[i][j] && found(i, j, prev, array, cache)) {
                    count += 1;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {

        Problems10026 main = new Problems10026();

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        Character[][] array = new Character[size][size];
        Character[][] array2 = new Character[size][size];
        for (int i = 0; i < size; i++) {
            String line = sc.next();
            int j = 0;
            for (char c : line.toCharArray()) {
                if (c == 'G') {
                    array2[i][j] = 'R';
                } else {
                    array2[i][j] = c;
                }
                array[i][j] = c;
                j += 1;
            }
        }

        System.out.println(main.getResult(size, array) + " " + main.getResult(size, array2));
    }
}