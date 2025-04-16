import java.util.ArrayList;

public class PrimeCheck {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(3);
        integers.add(4);
        integers.add(5);
        integers.add(6);
        integers.add(7);

        for (Integer num : integers) {
            boolean isPrime = true;
            if (num < 2) isPrime = false;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            System.out.println(num + " is prime: " + isPrime);
        }
    }
}