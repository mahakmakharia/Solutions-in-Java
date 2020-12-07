import java.util.*;

public class EmployeeManager {
	private Employee[] empList;
	static int count_insert = 0;

	public static void main(String[] args) {
		EmployeeManager myMgr = new EmployeeManager();
		Employee eq = new Employee("123", "H De", 60000);
		int choice;
		// create a Scanner object here
		Scanner sc = new Scanner(System.in);
		// do-while loop for user input
		do {
			System.out.println("Perform the following methods:");
			System.out.println("1: insert");
			System.out.println("2: remove");
			System.out.println("3: find");
			System.out.println("4: display");
			System.out.println("5: quit");
			// read user input
			System.out.println("Enter the choice value: ");
			choice = sc.nextInt();
			switch (choice) {
				case 1: /* insert() call */ {
					String id;
					String name;
					double salary;

					System.out.println("Enter the Employee id and full name");
					id = sc.next();
					name = sc.nextLine();
					System.out.println("Enter the Employee salary ");
					salary = sc.nextDouble();
					if (id == null) {
						System.out.println("Error - id cannot be null");
					} else if (name == null) {
						System.out.println("Error - name cannot be null");
					} else {
						Employee emp = new Employee(id, name, salary);
						boolean n = myMgr.insert(emp);
						if (n == true) {
							System.out.println("Employee added ");
						} else {
							System.out.println("The insertion failed");

						}
					}
					break;
				}
				case 2: /* remove() call */
				{
					System.out.println("Enter the id of the employee to remove");
					String rem = sc.next();
					if (rem != null) {
						boolean status = myMgr.remove(rem);
						if (status == true) {
							System.out.println("Employee removed");
						} else {
							System.out.println("Employee with id " + rem + " cannot be found.");
						}
					} else {
						System.out.println("Error - id cannot be null");
					}
					break;
				}
				case 3: /* find() call */ {
					System.out.println("Enter the id of the employee to search");
					String rem = sc.next();
					if (rem != null) {
						boolean status = myMgr.find(rem);
						if (status == true) {
							System.out.println("Employee is available");
						} else {
							System.out.println("Employee with id " + rem + " cannot be found.");
						}
					} else {
						System.out.println("Error - id cannot be null");
					}
					break;
				}
				case 4: /* display() call */
				{
					myMgr.display();
					break;
				}

				case 5: {
					System.out.println("Program terminating");
					break;
				}
				default: /* add error handling */
				{
					System.out.println("Sorry wrong choice! Please try again");
					choice = 1;
					break;
				}
			}
		} while (choice != 5);
	}

	public EmployeeManager() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of employees to be added ");
		int n = sc.nextInt();
		empList = new Employee[n];
	}

	public boolean insert(Employee emp) {
		int j;
		j = count_insert - 1;
		while (j >= 0 && empList[j].getId().compareTo(emp.getId()) > 0) {
			empList[j + 1] = empList[j];
			j--;
		}
		if (j + 1 < empList.length) {
			empList[j + 1] = emp;
			count_insert++;
			return true;
		}
		return false;
	}

	public boolean remove(String id) {
		int c = 0, flag = 0;
		for (int i = 0; i < empList.length; i++) {
			if (empList[i] != null) {
				if (empList[i].getId().equals(id)) {
					c = i;
					flag = 1;
					break;
				}
			}
		}
		for (int i = c; i < empList.length - 1; i++) {
			empList[i] = empList[i + 1];
		}
		if (flag == 1) {
			count_insert--;
			return true;
		} else {
			return false;
		}
	}

	public boolean find(String id) {
		int c;
		for (int i = 0; i < empList.length; i++) {
			if (empList[i] != null) {
				if (empList[i].getId().equals(id)) {
					c = i;
					System.out.println("Employee Id: " + empList[i].getId() + " Employee Name:" + empList[i].getName()
							+ " Salary: " + empList[i].getSalary());
					return true;
				}
			} else

			{
				break;
			}
		}
		return false;
	}

	public void display() {
		for (int i = 0; i < empList.length; i++) {
			if (empList[i] != null) {
				System.out.println("id = " + empList[i].getId() + ", Full Name =" + empList[i].getName() + ", Salary = "
						+ empList[i].getSalary());
			}
		}
	}
}