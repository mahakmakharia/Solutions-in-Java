import java.util.Scanner;

public class WithdrawalManager {

    public static void main(String[] args) {

        int choice = 0, amount = 0;
        do {
            Scanner sc = new Scanner(System.in);

            System.out.println("WITHDRAWAL MENU");
            System.out.println("Enter the amount you'd like to approve");
            amount = sc.nextInt();
            System.out.println("1. Are you a Junior Officer?");
            System.out.println("2. Are you a Senior Officer?");
            System.out.println("3. Are you the Executive Officer?");
            System.out.println("4. Exit");
            System.out.println("Enter your choice");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    JuniorOfficer junior_off = new JuniorOfficer();
                    if (junior_off.canApprove(amount))
                        System.out.println("You can approve the payment");
                    else
                        System.out.println("You can't approve the payment");
                    break;
                case 2:
                    SeniorOfficer senior_off = new SeniorOfficer();
                    if (senior_off.canApprove(amount))
                        System.out.println("You can approve the payment");
                    else
                        System.out.println("You can't approve the payment");

                    break;

                case 3:
                    ExecutiveOfficer exec_off = new ExecutiveOfficer();
                    if (exec_off.canApprove(amount))
                        System.out.println("You can approve the payment");
                    else
                        System.out.println("You can't approve the payment");
                    break;
                case 4:
                    System.out.println("Exiting");
                    System.exit(0);
                default:
                    System.out.println("INvalid Input");

                    break;

            }

        } while (choice != 4);

    }

}
