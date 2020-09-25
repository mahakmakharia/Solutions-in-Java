public class Item {

    String name;
    double unitprice;

    Item() {
        name = "";
        unitprice = 0.0;
    }

    Item(String name, double unitprice) {
        this.name = name;
        this.unitprice = unitprice;
    }

    double getPrice(double quantity) {
        return this.unitprice * quantity;
    }

    double getPrice(double measureunit, double weight) {
        return this.unitprice * (weight / measureunit);

    }
}