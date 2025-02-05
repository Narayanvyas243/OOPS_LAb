import java.util.Scanner;
class University {
    static String universityName = "UPES";

    String studentName;

    University(String studentName) {
        this.studentName = studentName;
    }

    static void displayUniversityName() {
        System.out.println("University Name: " + universityName);
    }

    void displayStudentName() {
        System.out.println("Student Name : " + studentName);
    }

    public static void main(String[] args) {
       University.displayUniversityName();
        Scanner scanner = new Scanner(System.in);
        System.out.print(" enter the name of student 1 : ");
        String a = scanner.nextLine();

        System.out.print(" enter the name of student 2 : ");
        String b = scanner.nextLine();

        System.out.print(" enter the name of student 3 : ");
        String c = scanner.nextLine();

        University student1 = new University(a);
        University student2 = new University(b);
        University student3 = new University(c);

        student1.displayStudentName();
        student2.displayStudentName();
        student3.displayStudentName();

        University.universityName = "GRAPHIC ERA";

        University.displayUniversityName();

        student1.displayUniversityName();
        student2.displayUniversityName();
        student3.displayUniversityName();
    }
}