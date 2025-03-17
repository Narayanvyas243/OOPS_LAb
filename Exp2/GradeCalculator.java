import java.util.Scanner;

public class GradeCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter marks for Subject 1: ");
        float s1 = scanner.nextFloat(); 

        System.out.println("Enter marks for Subject 2: ");
        float s2 = scanner.nextFloat();

        System.out.println("Enter marks for Subject 3: ");
        float s3 = scanner.nextFloat();

        float average = (s1 + s2 + s3) / 3.0f; 

        if (average >= 90) {
            System.out.println("Grade A");
        } else if (average >= 75) {
            System.out.println("Grade B");
        } else if (average >= 50) {
            System.out.println("Grade C");
        } else {
            System.out.println("Grade F");
        }

        scanner.close();
    }
}
