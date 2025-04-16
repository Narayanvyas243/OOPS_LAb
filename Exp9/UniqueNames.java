import java.util.HashSet;

public class UniqueNames {
    public static void main(String[] args) {
        String[] names = {"Aman", "Varchasv", "Sourabh", "Varchasv", "Aman"};
        HashSet<String> uniqueNames = new HashSet<>();

        for (String name : names) {
            uniqueNames.add(name);
        }

        System.out.println("Unique names: " + uniqueNames);
        System.out.println("Is 'Aman' in the set? " + uniqueNames.contains("Aman"));
    }
}