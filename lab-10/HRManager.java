import java.util.*;

public class HRManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name of professor");
        String name = sc.nextLine();
        System.out.println("Enter years of experience");
        int y = sc.nextInt();
        if (y < 5) {
            AssistantProf ap = new AssistantProf(y, name);
            System.out.println(ap.introduce());
        } else if (y < 10) {
            AssociateProf asp = new AssociateProf(y, name);
            System.out.println(asp.introduce());
        } else {
            HOD hod = new HOD(y, name);
            System.out.println(hod.introduce());
        }
    }
}
