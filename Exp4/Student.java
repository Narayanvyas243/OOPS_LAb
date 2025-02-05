import java.util.Scanner;

class Student {
    String name;
    int age;

    Student() {
        System.out.println("default constructor");
    }

    Student(String name, int age) {
        this.name = name;
        this.age = age;

    }

    public void println() {
        System.out.println("Name : " + name + " age :" + age);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" enter the name : ");
        String InputName = scanner.nextLine();
        System.out.print("enter the age : ");
        int InputAge = scanner.nextInt();

        Student S1 = new Student();
        S1.name = " Narayan";
        S1.age = 19;
        S1.println();

        Student S2 = new Student(InputName, InputAge);
        S2.println();
    }
}