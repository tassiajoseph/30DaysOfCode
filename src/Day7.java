import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Day7 {

    /* ================================================
     Day 7: Arrays
     https://www.hackerrank.com/challenges/30-arrays
    ================================================= */

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim()); // ln1
        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" ")) // ln2
                .map(Integer::parseInt)
                .collect(toList());

        // code
        for (int i = arr.size() - 1; i >= 0; i--) {
            System.out.print(arr.get(i));
            System.out.print(" ");
        }

        bufferedReader.close();
    }

}
