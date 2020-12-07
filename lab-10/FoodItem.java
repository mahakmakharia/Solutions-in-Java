public class FoodItem {
    public String desc;
    public double unitPrice;

    public FoodItem(String desc, double unitPrice) {
        this.desc = desc;
        this.unitPrice = unitPrice;
    }

    public String displayBill() {
        return this.desc + " " + this.unitPrice + " ";
    }

    public String getdesc() {
        return this.desc;
    }
}
