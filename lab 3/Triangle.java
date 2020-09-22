import java.util.*;

class Triangle {
    int base;
    int height;

    Triangle() {
        base = 0;
        height = 0;
    }

    Triangle(int b, int h) {
        base = b;
        height = h;
    }

    double getArea() {
        return 0.5 * this.base * this.height;
    }

    void show() {
        System.out
                .println("Height and Base of the triangle are " + this.height + " and " + this.base + " respectively");
        System.out.println("Area:" + this.getArea());
    }

    static void compare(Triangle t1, Triangle t2) {
        if (t1.getArea() == t2.getArea())
            System.out.println("Triangles are equal");
        else if (t1.getArea() > t2.getArea())
            System.out.println("First triangle is larger");
        else
            System.out.println("Second triangle is larger");
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int b, h;

        System.out.println("Do you wish to do a comparison?(1 for Yes and 0 for No)");
        int ch = sc.nextInt();
        switch (ch) {
            case 0:
                System.out.println("Enter the dimensions for Triangle:");
                b = sc.nextInt();
                h = sc.nextInt();
                checkValidity(b, h);
                Triangle t = new Triangle(b, h);

                t.show();

                break;
            case 1:
                System.out.println("Enter the dimensions for first triangle:");
                b = sc.nextInt();
                h = sc.nextInt();
                checkValidity(b, h);
                Triangle t1 = new Triangle(b, h);

                System.out.println("Enter the dimensions for second triangle:");
                b = sc.nextInt();
                h = sc.nextInt();
                checkValidity(b, h);
                Triangle t2 = new Triangle(b, h);

                System.out.println("1st triangle:");
                t1.show();
                System.out.println();

                System.out.println("2nd triangle:");
                t2.show();
                System.out.println();

                compare(t1, t2);

                break;

            default:
                System.out.println("Invalid Input");
        }
        scanner.close();
    }

    public static void checkValidity(int base, int height) {
        if (base <= 0 || height <= 0) {
            System.out.println("Base/Height cannot be 0 or negative");
            System.exit(0);
        }
    }

}
