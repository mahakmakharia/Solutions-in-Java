public abstract class Shape {
    private String colour = "orange";

    public String getColour() {
        return this.colour;
    }

    protected boolean setColour(String colour) {
        this.colour = colour;
        return true;
    }

    public abstract String show();

    public abstract double getArea();

}
