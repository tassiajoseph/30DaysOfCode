import java.util.Scanner;

public class Day1 {

    /* ====================================================
     Day 1: Data Types
     https://www.hackerrank.com/challenges/30-data-types
    ==================================================== */

    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);

        /* Declare second integer, double, and String variables. */

        /* Read and save an integer, double, and String to your variables.*/
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.

        /* Print the sum of both integer variables on a new line. */
        System.out.println(i + 12);

        /* Print the sum of the double variables on a new line. */
        System.out.println(d + 4.0);

        /* Concatenate and print the String variables on a new line;
        	the 's' variable above should be printed first. */
        System.out.println(s + "is the best place to learn and practice coding!");

        scan.close();
    }

}
