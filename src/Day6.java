import java.util.Scanner;

public class Day6 {

    /* ===============================================================
     Day 6: Let's Review
     https://www.hackerrank.com/challenges/30-review-loop
    ================================================================ */

    public static void main(String[] args) {

        /* =========================================
            My original answer (solves Test case 0)
        ============================================ */

        String hacker = "Hacker";
        String rank = "Rank";
        int t = 0;

        //
        for (int i = 0; i < hacker.length(); i++) {
            if (i % 2 == 0) {
                System.out.print(hacker.charAt(i));
            }
        }

        // space
        System.out.print(" ");

        for (int i = 0; i < hacker.length(); i++) {
            if (i % 2 != 0) {
                System.out.print(hacker.charAt(i));
            }
        }

        // new line
        System.out.println(" ");

        for (int i = 0; i < rank.length(); i++) {
            if (i % 2 == 0) {
                System.out.print(rank.charAt(i));
            }
        }

        // space
        System.out.print(" ");

        for (int i = 0; i < rank.length(); i++) {
            if (i % 2 != 0) {
                System.out.print(rank.charAt(i));
            }
        }


        /* ==========================================
            Scanner Class - Works for all Test cases
        ============================================= */

        // Start scanner
        Scanner scanner = new Scanner(System.in);

        // Reads an int value from the user
        int n = scanner.nextInt();

        // Reads a String value from user
        scanner.nextLine();

        for (int i = 0; i < n; i++) {

            // String = Reads the String value from user
            String s = scanner.nextLine();

            // Turn the String into individual characters and store in a char array
            char[] sArray = s.toCharArray();

            // nest for loop to find even char(s)
            for (int j = 0; j < sArray.length; j++) {
                if (j % 2 == 0) {
                    System.out.print(sArray[j]);
                }
            }

            // space
            System.out.print(" ");

            // nest for loop to find odd char(s)
            for (int j = 0; j < sArray.length; j++) {
                if (j % 2 != 0) {
                    System.out.print(sArray[j]);
                }
            }

            // print empty new line
            System.out.println();
        }

        // End scanner
        scanner.close();


    } // end main method

}
