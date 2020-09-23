class Circle extends Shape {

    private double radius;

    Circle() {
        super();
        this.radius = 0.0;
    }

    Circle(double radius) {
        super();
        this.radius = radius;
    }

    Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    void printDescription() {
        System.out.println("Radius:" + this.radius);
        System.out.println("Color:" + this.color);
        System.out.println("Area:" + (3.14 * this.radius * this.radius));
    }
}