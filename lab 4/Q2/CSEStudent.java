import java.util.Scanner;

public class CSEStudent extends Student {

    public String hobby;

    CSEStudent() {
        this.hobby = "Hacking";
    }

    CSEStudent(String name) {
        super(name);
        this.hobby = "Hacking";
    }

    public String introduce() {
        return "Hello, my name is " + this.getName() + " , and my hobby is " + this.hobby;
    }

    public static void main(String[] args) {
        int choice;
        int flag = 1;
        String name = "Arif";
        Scanner sc = new Scanner(System.in);
        Person obj;

        while (flag == 1) {
            System.out.print("Enter your name:");
            name = sc.next();
            System.out.print("Do you want to fix this name?(1 for yes/ 0 for no):");
            flag = sc.nextInt();

        }
        do {

            System.out.println("1.at get together for student leaders of various colleges in salt lake");
            System.out.println("2.at a closed door Hacker society meeting");
            System.out.println("3.at a cousins birthday party");
            System.out.println("4.Exit");
            System.out.print("Where do you want to introduce yourself?:");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    obj = new Student(name);
                    System.out.println(obj.introduce());
                    break;
                case 2:
                    obj = new CSEStudent(name);
                    System.out.println(obj.introduce());
                    break;
                case 3:
                    obj = new Person(name);
                    System.out.println(obj.introduce());
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Invalid Choice");

            }
        } while (choice != 4);

    }

}
