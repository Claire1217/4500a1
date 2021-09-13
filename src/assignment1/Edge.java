package assignment1;

import java.util.*;

public class Edge {
    Trader trader1;
    Trader trader2;
    TreeSet<ItemType> common_items;

    public Edge(Trader trader1, Trader trader2, TreeSet<ItemType> common_items) {
        this.trader1 = trader1;
        this.trader2 = trader2;
        this.common_items = common_items;
    }
}
