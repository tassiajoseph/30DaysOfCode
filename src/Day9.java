public class Day9 {

    /* ==================================================
     Day 9: Recursion 3
     https://www.hackerrank.com/challenges/30-recursion
    ==================================================== */

    // Recursive method - a method called inside itself
    public static int factorial(int n) {

        // Base case: when to stop
        if (n == 1) {
            return 1;
            // Recursive Case
        } else {
            return n * factorial(n - 1);
        }

    }
}
