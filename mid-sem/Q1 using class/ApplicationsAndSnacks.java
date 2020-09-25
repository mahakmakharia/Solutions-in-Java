public class ApplicationsAndSnacks extends Item {

    String name;
    double unitprice;
    int quantity;

    ApplicationsAndSnacks(String name, double unitprice, int quantity) {
        super(name, unitprice);
        this.name = name;
        this.unitprice = unitprice;
        this.quantity = quantity;

    }

    @Override
    double getPrice() {

        return this.unitprice * this.quantity;
    }

}