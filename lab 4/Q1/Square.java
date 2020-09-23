class Square extends Rectangle {

    double side;

    Square() {
        super();
    }

    Square(double side) {
        super(side, side);
        this.side = side;
    }

    Square(String color, double side) {
        super(color, side, side);
        this.side = side;
    }

    @Override
    void printDescription() {
        System.out.println("Side:" + this.side);
        System.out.println("Area:" + this.side * this.width);
    }
}