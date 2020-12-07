import java.util.*;

public class Item {
    private String category;
    private String name;
    private boolean unitOfMeasure;
    private double unitPrice;
    private double weight;

    // Non Perishable
    public Item(String category, String name, double unitPrice) {
        this.category = category;
        this.name = name;
        this.unitPrice = unitPrice;
    }

    // perishable
    public Item(String category, String name, boolean unitOfMeasure, double unitPrice, double weight) {
        this.category = category;
        this.name = name;
        this.unitOfMeasure = unitOfMeasure;
        this.unitPrice = unitPrice;
        this.weight = weight;
    }

    public String getCategory() {
        return this.category;
    }

    public double getUnitPrice() {
        return this.unitPrice;
    }

    public boolean getUnitOfMeasure() {
        return this.unitOfMeasure;
    }

    public double getweight() {
        return this.weight;
    }

    public String printDesc() {
        String result;
        result = this.category + "-" + this.name;
        return result;
    }
}
