import java.util.Scanner;

public class ShapeManager {
    public ShapeManager() {
    }

    public void manageShape(Shape myshape) {
        myshape.printDescription();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ShapeManager mymngr = new ShapeManager();
        double breadth, length;
        String color;
        int choice;
        do {
            System.out.println("1.Get dimensions and area of rectangle");
            System.out.println("2.Get dimensions and area of square");
            System.out.println("3.Get dimensions and area of circle");
            System.out.println("4.Exit");
            System.out.print("Enter your choice:");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter the color:");
                    color = sc.next();
                    System.out.print("Enter length of the rectangle:");
                    length = sc.nextDouble();
                    System.out.print("Enter breadth of the rectangle:");
                    breadth = sc.nextDouble();
                    Rectangle Myrect = new Rectangle(color, length, breadth);
                    mymngr.manageShape(Myrect);
                    break;
                case 2:
                    System.out.print("Enter the color:");
                    color = sc.next();
                    System.out.print("Enter length of the square:");
                    length = sc.nextDouble();
                    Square Mysq = new Square(color, length);
                    mymngr.manageShape(Mysq);
                    break;

                case 3:
                    System.out.print("Enter the color:");
                    color = sc.next();
                    System.out.print("Enter radius of the circle:");
                    length = sc.nextDouble();
                    Circle Mycirc = new Circle(color, length);
                    mymngr.manageShape(Mycirc);
                    break;

                case 4:
                    System.out.println("Exiting..");
                    System.exit(0);
                default:
                    System.out.println("Invalid Choice");
            }

        } while (choice != 4);
    }

}
