import java.util.HashMap;
import java.util.Scanner;

public class Day8 {

    /* =============================================================
     Day 8: Dictionaries and Maps
     https://www.hackerrank.com/challenges/30-dictionaries-and-maps
    ================================================================ */

    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); // number of entries in the phone book

        // hashmap key:value pair
        HashMap<String, Integer> phoneBook = new HashMap<String, Integer>();

        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();

            // add a key and value
            phoneBook.put(name, phone);
        }

        // check whether there is any element remaining
        while(in.hasNext()){
            String s = in.next(); // key value
            // if s equals the hashmap key print details
            if (phoneBook.get(s) != null) {
                System.out.println(s + "=" + phoneBook.get(s));
            }
            else {
                System.out.println("Not found");
            }
        }
        in.close();
    }

}
