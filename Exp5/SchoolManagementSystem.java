abstract class Person {
    public abstract void performDuty();
}

class Student extends Person {
    @Override
    public void performDuty() {
        System.out.println("Student is studying.");
    }
}

class Teacher extends Person {
    @Override
    public void performDuty() {
        System.out.println("Teacher is teaching.");
    }
}

public class SchoolManagementSystem {
    public static void main(String[] args) {
        Person[] people = new Person[3];

        people[0] = new Student();
        people[1] = new Teacher();
        people[2] = new Student();

        for (Person person : people) {
            person.performDuty();
        }

        System.out.println("\n--- Alternative using a List ---");

        java.util.List<Person> personList = new java.util.ArrayList<>();

        personList.add(new Student());
        personList.add(new Teacher());
        personList.add(new Student());
        personList.add(new Teacher());

        for (Person person : personList) {
            person.performDuty();
        }
    }
}