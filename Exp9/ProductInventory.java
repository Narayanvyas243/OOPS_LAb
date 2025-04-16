import java.util.HashMap;

public class ProductInventory {
    public static void main(String[] args) {
        HashMap<Integer, Integer> inventory = new HashMap<>();
        inventory.put(101, 50);
        inventory.put(102, 30);
        inventory.put(103, 20);

        inventory.put(102, 25);
        inventory.remove(101);

        System.out.println(inventory);
    }
}