import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Day3 {

    /* ===============================================================
     Day 3: Intro to Conditional Statements
     https://www.hackerrank.com/challenges/30-conditional-statements
    ================================================================ */

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        if (n % 2 == 1) {
            System.out.println("Weird");
        }
        if (n % 2 == 0 && n > 2 && n < 6) {
            System.out.println("Not Weird");
        }
        if (n % 2 == 0 && n > 5 && n < 21) {
            System.out.println("Weird");
        }
        if (n % 2 == 0 && n > 20) {
            System.out.println("Not Weird");
        }

        bufferedReader.close();
    }
}
