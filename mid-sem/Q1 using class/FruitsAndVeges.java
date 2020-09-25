public class FruitsAndVeges extends Item {
    String name;
    double unitprice, weight, measureunit;

    FruitsAndVeges(String name, double unitprice, double weight, double measureunit) {
        super(name, unitprice);
        this.name = name;
        this.unitprice = unitprice;
        this.weight = weight;
        this.measureunit = measureunit;

    }

    @Override
    double getPrice() {
        return this.unitprice * (this.weight / this.measureunit);
    }

}
