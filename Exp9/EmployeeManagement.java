import java.util.ArrayList;

class Employee {
    private String name;
    private int id;
    private double salary;

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', id=" + id + ", salary=" + salary + "}";
    }
}

public class EmployeeManagement {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Alice", 1, 50000));
        employees.add(new Employee("Bob", 2, 60000));
        employees.add(new Employee("Charlie", 3, 70000));

        employees.get(1).setSalary(65000);
        employees.removeIf(emp -> emp.getId() == 1);

        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }
}