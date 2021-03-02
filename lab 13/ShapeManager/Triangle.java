class Triangle extends Shape implements Comparable {

    private int base = 0;
    private int height = 0;

    public Triangle(String colour, int base, int height) {
        this.setColour(colour);
        this.base = base;
        this.height = height;
    }

    public Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    public String show() {
        return "I am a triangle of colour " + this.getColour();
    }

    public double getArea() {
        return 0.5 * this.base * this.height;
    }

    public int compareTo(Object other) {
        double area1 = this.getArea();
        double area2 = ((Triangle) other).getArea();

        if (area1 > area2)
            return 1;
        else if (area1 == area2)
            return 0;
        else
            return -1;
    }
}