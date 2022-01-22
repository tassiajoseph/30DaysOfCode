public class Day2 {

    /* ==================================================
     Day 2: Operators
     https://www.hackerrank.com/challenges/30-operators
    =================================================== */

    public static void solve(double meal_cost, int tip_percent, int tax_percent) {

        // percentage = base_num / 100 * percent_num
        double tip_cost = (meal_cost / 100) * tip_percent;
        double tax_cost = (meal_cost / 100) * tax_percent;
        double total_cost = meal_cost + tip_cost + tax_cost;

        System.out.println(Math.round(total_cost));
    }

}
