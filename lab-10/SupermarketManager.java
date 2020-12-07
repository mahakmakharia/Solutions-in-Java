import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SupermarketManager {
    private static List<Item> item;
    private static List<Integer> quantity;
    private static List<Double> price;
    private static double total = 0;
    private static int count = -1;
    private static String s = "";

    public SupermarketManager() {
        item = new ArrayList<Item>();
        quantity = new ArrayList<Integer>();
        price = new ArrayList<Double>();
    }

    public boolean addItem(Item myItem) {
        item.add(myItem);
        return true;
    }

    public static double calcprice(int i) {
        double p = 0.0;
        if (item.get(i).getCategory().equals("Fruits and Vegetables")) {
            if (item.get(i).getUnitOfMeasure() == true) {
                p = ((item.get(i).getUnitPrice()) * (item.get(i).getweight()));
            } else {
                p = ((item.get(i).getUnitPrice()) * (item.get(i).getweight())) / 0.1;
            }
        } else {
            p = ((item.get(i).getUnitPrice()) * (quantity.get(i)));
        }
        price.add(p);
        return p;
    }

    public String printItem(int c) {
        for (int i = 0; i <= c; i++) {
            s = s + (i + 1) + " " + item.get(i).printDesc();
            if (item.get(i).getCategory().equals("Fruits and Vegetables")) {
                if (item.get(i).getUnitOfMeasure() == true) {
                    s = s + "(per 1kg)";
                } else {
                    s = s + "(per 100g)";
                }
                s = s + " " + item.get(i).getweight() + " " + item.get(i).getUnitPrice() + " " + this.price.get(i);
                // s=s+" "+this.quantity.get(i);
                s = s + "\n";
            } else {
                s = s + " " + " " + item.get(i).getUnitPrice() + " " + this.quantity.get(i) + " " + this.price.get(i);
                s = s + "\n";
            }
        }
        return s;
    }

    public double totalCost(int c) {
        for (int i = 0; i <= c; i++) {
            total += price.get(i);
        }
        return total;
    }

    public static void removeItem(SupermarketManager myMgr, int i) {
        item.remove(i);
        quantity.remove(i);
        price.remove(i);
        count--;
        checkout(myMgr, count);
    }

    public static void checkout(SupermarketManager myMgr, int c) {
        System.out.println("Checkout Bill");
        System.out.println(" Description Weight(kg) UnitPrice(Rs) Quantity Price(Rs)");
        System.out.println(myMgr.printItem(c));
        System.out.println("Total " + myMgr.totalCost(c));
        total = 0;
    }

    public static void main(String[] args) {
        SupermarketManager myMgr = new SupermarketManager();
        boolean added = false;
        System.out.println("Enter number of Items to be added");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String cat = "";
        String category = "";
        String name = "";
        boolean unitOfMeasure = false;
        double unitPrice = 0.0;
        double weight = 0.0;
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the category of item e, f or s and item name");
            cat = sc.next();
            if (cat.equals("f")) {
                name = sc.nextLine();
                System.out.println("Enter the unit of measure of item");
                unitOfMeasure = sc.nextBoolean();
                System.out.println("Enter weight");
                weight = sc.nextDouble();
                System.out.println("Enter unit price");
                unitPrice = sc.nextDouble();
                Item fv = new Item("Fruits and Vegetables", name, unitOfMeasure, unitPrice, weight);
                added = myMgr.addItem(fv);
                quantity.add(0);
                calcprice(i);
            } else {
                // System.out.println("Enter the name and unitPrice of item");
                if (cat.equals("e")) {
                    category = "Electrical Appliances";
                } else {
                    category = "Snacks";
                }
                name = sc.nextLine();
                System.out.println("Enter the unit price of item");
                unitPrice = sc.nextDouble();
                Item others = new Item(category, name, unitPrice);
                added = myMgr.addItem(others);
                System.out.println("Enter the quantity item");
                int q = sc.nextInt();
                quantity.add(q);
                calcprice(i);
            }
            if (added == true) {
                count++;
            }
        }
        checkout(myMgr, count);
        removeItem(myMgr, 1);
    }
}
