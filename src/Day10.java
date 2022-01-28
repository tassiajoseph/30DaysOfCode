import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Day10 {

    /* ======================================================
     Day 10: Binary Numbers
     https://www.hackerrank.com/challenges/30-binary-numbers
    ========================================================= */

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        int count = 0;

        while (n != 0) {
            // Binary Operators
            // Bitwise Operator (&) + Shift Operator (<<)
            n = (n & (n << 1));
            count++;
        }

        System.out.println(count);

        bufferedReader.close();
    }

}
