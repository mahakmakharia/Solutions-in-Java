import java.util.*;

public class ReversePos {
    public static int reverse(int n) {
        int r = 0;
        while (n > 0) {
            int d = n % 10;
            r = r * 10 + d;
            n = n / 10;
        }
        return r;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a positive number");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Your input is not a positive number ");
            return;
        } else {
            int a = reverse(n);
            System.out.println("Reverse of number " + n + " is " + a);
        }
    }
}