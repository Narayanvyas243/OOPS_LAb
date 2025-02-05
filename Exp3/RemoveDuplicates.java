import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static int[] removeDuplicates(int[] arr) {
        Set<Integer> uniqueElements = new HashSet<>();
        for (int num : arr) {
            uniqueElements.add(num);
        }
        int[] result = new int[uniqueElements.size()];
        int index = 0;
        for (int num : uniqueElements) {
            result[index++] = num;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {4, 1, 3, 2, 5, 3, 4, 9, 2, 8, 9, 5 ,7};
        int[] uniqueArr = removeDuplicates(arr);
        System.out.print("Array without duplicates: ");
        for (int num : uniqueArr) {
            System.out.print(num + " ");
        }
    }
}