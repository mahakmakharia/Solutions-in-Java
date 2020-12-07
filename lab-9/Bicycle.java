import java.util.*;

public class Bicycle {
    private int gear;
    private int speed;

    public Bicycle(int gear, int speed) {
        this.gear = gear;
        this.speed = speed;
    }

    public void putBreakes(int decrement) {
        speed -= decrement;
        if (speed <= 0) {
            System.out.println("Speed is too low for the Bicycle to move\n");
        }
    }

    public String toString() {
        return "gear value is: " + this.gear + " speed is: " + this.speed;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter gear value ");
        int g = sc.nextInt();
        System.out.println("Enter speed value ");
        int s = sc.nextInt();
        System.out.println("Enter seatHeight value ");
        int h = sc.nextInt();
        MountainBike b = new MountainBike(g, s, h);
        System.out.println(b.toString());
        b.putBreakes(20);
        System.out.println("After breaks " + b.toString());
    }
}
