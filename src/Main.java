import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // create our array of COIN denominations
        int[] coins = {6, 4, 5, 1, 1, 8, 9};
        // call our method & display the result
        System.out.println(nonConstructableChange(coins));
    }

    //O(nLog(n)) time | O(1) space
    public static int nonConstructableChange(int[] coins) {
        // sort the input array in ascending order
        Arrays.sort(coins);     // O(nLog(n)) time
        // create a variable for the amount of change we can make (we can ALWAYS make change for '0')
        int change = 0;
        // iterate through the COINS array
        for(int coin : coins) {     // O(n) time
            // if the value of the current coin is greater than the amount of change we can make + 1,
            // break out of the loop
            if(coin > change + 1) {
                break;
            }
            // otherwise, add the value of the coin to the amount of change we can make
            change += coin;
        }
        // return the amount of change we can make + 1.
        // +This is the smallest amount of change we CAN'T make
        return change + 1;
    }
}