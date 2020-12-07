public class Employee {
    private String id = "";
    private String name = "";
    private double salary = 0.0;

    public Employee(String id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public String getId() {
        return (this.id);
    }

    public String getName() {
        return (this.name);
    }

    public double getSalary() {
        return (this.salary);
    }

    public static void main(String[] args) {
        Employee eq = new Employee("id", "Mahak Makharia", 50000);
        System.out.println(eq.getId() + " " + eq.getName() + " " + eq.getSalary());
    }
}