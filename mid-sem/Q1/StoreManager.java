import java.util.Scanner;

public class StoreManager {

    public static void main(String[] args) {

        Item fruit = new Item("apple", 10);

        System.out.println("Price of Apples Rs." + fruit.getPrice(1, 10));

        Item app = new Item("phone", 1000);

        System.out.println("Price of Phone Rs." + app.getPrice(2));

        double total = app.getPrice(2) + fruit.getPrice(1, 10);

        System.out.println("Total: Rs." + total);
    }

}
