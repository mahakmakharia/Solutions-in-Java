import java.util.*;

public class Student {
    private String name;
    private int rollNo;
    static String collegeName;
    static int counter = 0;

    public Student(String name) {
        this.name = name;
        this.rollNo = setRollNo();
    }

    private static int setRollNo() {
        counter++;
        return counter;
    }

    private static void setCllg(String name) {
        collegeName = name;
    }

    void getStudentInfo() {
        System.out.println("Name " + this.name + " roll number " + this.rollNo + " College name:" + this.collegeName);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter college name");
        String clg1 = sc.nextLine();
        System.out.println("Enter Student name");
        String name1 = sc.nextLine();
        Student s1 = new Student(name1);
        s1.setCllg(clg1);
        s1.getStudentInfo();
        System.out.println("Enter college name");
        String clg2 = sc.nextLine();
        System.out.println("Enter Student name");
        String name2 = sc.nextLine();
        Student s2 = new Student(name2);
        s2.setCllg(clg2);
        s2.getStudentInfo();
    }
}