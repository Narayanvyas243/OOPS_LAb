class Employee {
    private int employeeID;
    private String name;
    private String department;
    private double salary;
    private static int totalEmployees;

    public Employee() {
        employeeID = 0;
        name = "N/A";
        department = "N/A";
        salary = 0.0;
        totalEmployees++;
    }

    public Employee(int employeeID, String name, String department, double salary) {
        this.employeeID = employeeID;
        this.name = name;
        this.department = department;
        this.salary = salary;
        totalEmployees++;
    }

    public double calculateSalary() {
        return salary;
    }

    public double getSalary() {
        return salary;
    }

    public void displayEmployeeInfo() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
        System.out.println("--------------------");
    }

    public static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }
}

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        Employee emp2 = new Employee(101, "Alice", "Engineering", 60000);
        Employee emp3 = new Employee(102, "Bob", "Marketing", 55000);
        Employee emp4 = new Employee();

        Employee.displayTotalEmployees();

        emp1.displayEmployeeInfo();
        System.out.println("Salary of emp1: " + emp1.getSalary());

        emp2.displayEmployeeInfo();
        System.out.println("Salary of emp2: " + emp2.calculateSalary());

        emp3.displayEmployeeInfo();
        System.out.println("Salary of emp3: " + emp3.getSalary());

        emp4.displayEmployeeInfo();
        System.out.println("Salary of emp4: " + emp4.getSalary());

        Employee emp5 = new Employee(103, "Charlie", "HR", 70000);
        Employee.displayTotalEmployees();
    }
}