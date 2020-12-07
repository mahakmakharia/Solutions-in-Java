import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.time.*;
import java.time.LocalTime;

public class BillManager {
    static List<FoodLineItem> mylist;
    private static int count = -1;
    private int hrs1;
    private int min1;
    private int hrs2;
    private int min2;
    private double dis = 0.0;
    private double twdis = 0.0;
    private static double total = 0.0;

    public BillManager(String tentry, String texit) {
        mylist = new ArrayList();
        this.hrs1 = Integer.parseInt(tentry.split(":")[0]);
        this.min1 = Integer.parseInt(tentry.split(":")[1]);
        this.hrs2 = Integer.parseInt(texit.split(":")[0]);
        this.min2 = Integer.parseInt(texit.split(":")[1]);
    }

    public boolean addItem(FoodLineItem food) {
        mylist.add(food);
        return true;
    }

    public double calculateTotal(int count) {
        for (int i = 0; i <= count; i++) {
            total += mylist.get(i).getPrice();
        }
        return total;
    }

    public double doDiscount(FoodLineItem it, boolean flag) {
        twdis += (it.getPrice() * 0.15);
        return twdis;
    }

    public double doDiscount(FoodLineItem it) {
        dis += (it.getItem().unitPrice * it.getquantity() * 0.1);
        return dis;
    }

    public double doDiscount(FoodItem pizza1, FoodItem pizza2) {
        double dis = 0;
        if (pizza1.unitPrice < pizza2.unitPrice) {
            dis = (-1) * pizza1.unitPrice;
        } else {
            dis = (-1) * pizza2.unitPrice;
        }
        return dis;
    }

    public double doDiscount(FoodItem hotDrink, FoodItem cake, boolean flag) {
        double total = (hotDrink.unitPrice + cake.unitPrice);
        return (total - 200);
    }

    public int entryExit() {
        LocalTime time = LocalTime.of(hrs1, min1, 0);
        LocalTime time2 = LocalTime.of(hrs2, min2, 0);
        LocalTime lunch = LocalTime.of(11, 0, 0);
        LocalTime tea = LocalTime.of(15, 0, 0);
        LocalTime end = LocalTime.of(17, 0, 0);
        int disc = 0;
        if (time.compareTo(lunch) >= 0 && time.compareTo(tea) < 0)
            disc += 2;
        if (time2.compareTo(tea) >= 0 && time2.compareTo(end) <= 0)
            disc += 3;
        return disc;
    }

    public String displayBill(int c) {
        String s = "";
        int disc = entryExit();
        for (int i = 0; i <= c; i++) {
            if (disc == 2) {
                mylist.get(i).lunchTime();
            } else if (disc == 3) {
                mylist.get(i).TeaTime();
            } else if (disc == 5) {
                mylist.get(i).lunchTime();
                mylist.get(i).TeaTime();
            }
            s = s + (i + 1) + " " + mylist.get(i).displayBill() + "\n";
        }
        return s;
    }

    public static void main(String[] args) {
        System.out.println("Enter no. of items to be added");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String tentry, texit;
        System.out.println("Enter the entry time");
        tentry = sc.next();
        System.out.println("Enter the exit time");
        texit = sc.next();
        BillManager b = new BillManager(tentry, texit);
        String name;
        String it;
        double uprice;
        int quantity;
        for (int i = 0; i < n; i++) {
            System.out.println("Enter name of item and unit price");
            it = sc.next();
            name = sc.nextLine();
            uprice = sc.nextDouble();
            FoodItem f = new FoodItem(name, uprice);
            System.out.println("Enter quantity");
            quantity = sc.nextInt();
            FoodLineItem food = new FoodLineItem(f, quantity);
            if (b.addItem(food)) {
                count++;
            }
        }
        System.out.println(" Food Item Description Unit Price(Rs) Quantity Price(Rs)");
        System.out.println(b.displayBill(count));
        int c = 0;
        FoodItem p1 = mylist.get(0).getItem(), p2 = mylist.get(0).getItem();
        for (int i = 0; i <= count; i++) {
            if (mylist.get(i).getItemName().contains("Pizza") == true) {
                c++;
                if (c == 1) {
                    p1 = mylist.get(i).getItem();
                }
                if (c == 2) {
                    p2 = mylist.get(i).getItem();
                    break;
                }
            }
        }
        int ee = b.entryExit();
        double d = 0.0, tc = 0.0, pizd = 0.0;
        FoodItem t = mylist.get(0).getItem(), cake = mylist.get(0).getItem();
        FoodLineItem litem = mylist.get(0);
        if (ee == 2 || ee == 5) {
            for (int i = 0; i <= count; i++) {
                if (mylist.get(i).getItemName().contains("Take Away") == false
                        && mylist.get(i).getItemName().contains("Pizza") == false
                        && mylist.get(i).getItemName().contains("Tea") == false
                        && mylist.get(i).getItemName().contains("Coffee") == false
                        && mylist.get(i).getItemName().contains("Cake") == false) {
                    litem = mylist.get(i);
                    d = b.doDiscount(litem);
                }
            }
            System.out.println("Discount (Lunch Time Special) " + ((-1) * (d)));
        }
        pizd = b.doDiscount(p1, p2);
        System.out.println("Discount (Combo Special) " + pizd);
        if (ee == 3 || ee == 5) {
            for (int i = 0; i <= count; i++) {
                if (mylist.get(i).getItemName().contains("Tea") == true) {
                    t = mylist.get(i).getItem();
                }
                if (mylist.get(i).getItemName().contains("Coffee") == true) {
                    t = mylist.get(i).getItem();
                }
                if (mylist.get(i).getItemName().contains("Cake") == true) {
                    cake = mylist.get(i).getItem();
                }
            }
            tc = (-1) * (b.doDiscount(t, cake, true));
            System.out.println("Discount (Tea-Time Special) " + tc);
        }
        double tw = 0.0;
        for (int i = 0; i <= count; i++) {
            if (mylist.get(i).getItemName().contains("Take Away") == true) {
                tw = b.doDiscount(mylist.get(i), true);
            }
        }
        System.out.println("Discount (Take Away) " + ((-1) * (tw)));
        total = b.calculateTotal(count);
        total += tc + pizd - d - tw;
        System.out.println("Total " + total);
    }
}
