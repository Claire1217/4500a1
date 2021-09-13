package assignment1;

import java.util.*;

public class TradeFinder {

    /**
     * @require The set of traders is non-null, and does not contain null traders. The
     *          given trader, t, is non-null and is included in the set of traders. The
     *          given item type, g, is non-null and is included in the set of types of
     *          items that trader t is willing to trade.
     * 
     * @ensure Returns true if and only if there exists a (possibly empty) sequence of
     *         agreements between traders in the given set of traders that can be formed,
     *         such that after those agreements are formed, trader t can trade items of
     *         type g; otherwise the algorithm should return false.
     * 
     *         The method should not modify the set of traders provided as input, nor
     *         should it modify trader t, or item type g.
     * 
     *         (See the assignment handout for details and examples.)
     */
    public static boolean canTrade(Set<Trader> traders, Trader t, ItemType g) {
        ArrayList<Trader> traders_list = new ArrayList<Trader>(traders);
        Graph graph = new Graph(traders_list);



        return false; // REMOVE THIS LINE AND IMPLEMENT THIS METHOD
    }

    public static

}
