import java.util.ArrayList;
import java.util.Arrays;

import java.util.Comparator;

/*
 * We are given infinite supply of denominations of [1,2,5,10,20,50,100,500,2000].
 * Find minimum number of coins/notes to make a change for a value V. 
 */

public class IndianCoins {

    public static void main(String[] args) {

        Integer coins[] = { 1, 2, 5, 10, 20, 50, 100, 500, 2000 };

        Arrays.sort(coins, Comparator.reverseOrder());

        int countOfCoins = 0;
        int amount = 1218;

        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i < coins.length; i++) {
            if (coins[i] < amount) {

                while (coins[i] <= amount) {
                    countOfCoins++;
                    ans.add(coins[i]);
                    amount -= coins[i];
                }

            }
        }

        System.out.println("Total minimum coins used = " + countOfCoins);

        for (int i = 0; i < ans.size(); i++) {
            System.out.println(ans.get(i) + " ");
        }

    }

}
