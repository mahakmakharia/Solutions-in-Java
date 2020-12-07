public class FoodLineItem {
    private FoodItem item;
    private int quantity;
    private double price;

    public FoodLineItem(FoodItem item, int quantity) {
        this.item = item;
        this.quantity = quantity;
        this.price = 0;
    }

    public double calcPrice() {
        double p = (item.unitPrice * this.quantity);
        this.price = p;
        return this.price;
    }

    public FoodItem getItem() {
        return this.item;
    }

    public String getItemName() {
        return item.getdesc();
    }

    public int getquantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public void lunchTime() {
        if (this.item.getdesc().contains("Take Away") == false && this.item.getdesc().contains("Pizza") == false
                && this.item.getdesc().contains("Tea") == false && this.item.getdesc().contains("Coffee") == false
                && this.item.getdesc().contains("Cake") == false) {
            this.item.desc = this.item.desc + "(Lunch Time Special)";
        }
    }

    public void TeaTime() {
        if (this.item.getdesc().contains("Tea") || this.item.getdesc().contains("Coffee")
                || this.item.getdesc().contains("Cake")) {
            this.item.desc = this.item.desc + "(Tea-Time Special)";
        }
    }

    public String displayBill() {
        if (this.item.getdesc().contains("Pizza")) {
            this.item.desc = this.item.desc + "(Combo Special)";
        }
        return item.displayBill() + " " + this.quantity + " " + this.calcPrice();
    }
}
