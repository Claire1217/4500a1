package assignment1;
import java.util.*;


public class Graph {
    static class Node {
        Trader dest;
        TreeSet<ItemType> can_items;

        Node(Trader dest, TreeSet<ItemType> can_items)  {
            this.dest = dest;
            this.can_items = can_items;
        }
    };

// define adjacency list
    private List<List<String>> agreements = new ArrayList<>();
    private final List<List<Node>> adj_list = new ArrayList<>();
    private final ArrayList<Trader> traders;

    //Graph Constructor
    public void addAgreement(List<String> agreement) {
        agreements.add(agreement);
    }

    public List<List<String>> getAgreements(){
        return agreements;
    }

    public ArrayList<Trader> getTraders() {
        return traders;
    }

    public Graph(ArrayList<Trader> traders) {
        this.traders = traders;
        // adjacency list memory allocation
        for (int i = 0; i < traders.size(); i++)
            adj_list.add(i, new ArrayList<>());
        // add edges to the graph
        for (int i = 0; i < traders.size(); i++) {
            for (int j = i + 1; j < traders.size(); j++) {
                Set<ItemType> items1 = traders.get(i).getTradableItems();
                Set<ItemType> items2 = traders.get(j).getTradableItems();
                TreeSet<ItemType> common_items = new TreeSet<>(items1);
                common_items.retainAll(items2);
                if (common_items.size() > 1) {
                    Node node1 = new Node(traders.get(i), common_items);
                    Node node2 = new Node(traders.get(j), common_items);
                    adj_list.get(i).add(node2);
                    adj_list.get(j).add(node1);
                }
            }
        }
    }
    public void search()

    public Boolean formAgreement(Node node1, Node node2, ItemType item1, ItemType item2){
        if (node1.can_items.contains(item1) && node2.can_items.contains(item2)){
            node1.can_items.add(item2);
            node2.can_items.add(item1);
            List<String> agreement = Arrays.asList(node1.dest.getName(), node2.dest.getName(),
                    Integer.toString(item1.identifier()), Integer.toString(item2.identifier()));
            agreements.add(agreement);
            return true;
        } else {
            return false;
        }
    }

}
