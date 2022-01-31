import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Day11 {

    /* ======================================================
     Day 11: 2D Arrays
     https://www.hackerrank.com/challenges/30-2d-arrays
    ========================================================= */

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        // int[][] arr = new int {{1,2,3}, {1,2,3}}

        int maxHourGlass =
                arr.get(0).get(0) + arr.get(0).get(1) + arr.get(0).get(2)
                        + arr.get(1).get(1)
                        + arr.get(2).get(0) + arr.get(2).get(1) + arr.get(2).get(2);

        // arr.size() - 2 = 4
        for (int i = 0; i < 4; i++) {

            for (int j = 0; j < 4; j++) {
                // create an hourglass shape once and iterate until sum
                /*
                    [00] [01] [02]  // top 3 hourglass
                         [11]       // middle
                    [20] [21] [22]  // bottom 3 hourglass
                */
                // System.out.print(arr.get(i).get(j) + " ");

                int tmpHourGlass =
                        arr.get(i).get(j) + arr.get(i).get(j + 1) + arr.get(i).get(j + 2)
                                + arr.get(i + 1).get(j + 1)
                                + arr.get(i + 2).get(j + 0) + arr.get(i + 2).get(j + 1) + arr.get(i + 2).get(j + 2);
                if (tmpHourGlass > maxHourGlass) {
                    maxHourGlass = tmpHourGlass;
                }
            }
        }

        System.out.println(maxHourGlass);

        bufferedReader.close();
    }



}
