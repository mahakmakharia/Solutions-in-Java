class Rectangle extends Shape {

    double height, width;

    Rectangle() {
        super();
        this.height = 0.0;
        this.width = 0.0;
    }

    Rectangle(double height, double width) {
        super();
        this.height = height;
        this.width = width;
    }

    Rectangle(String color, double height, double width) {
        super(color);
        this.height = height;
        this.width = width;
    }

    @Override
    void printDescription() {
        System.out.println("Height:" + this.height);
        System.out.println("Width:" + this.width);
        System.out.println("Color:" + this.color);
        System.out.println("Area:" + this.height * this.width);
    }

}