public class SecondLargest {
    public static int findSecondLargest(int[] arr) {
        if (arr == null || arr.length < 2) {
            return -1;
        }
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            } 
        }
        return secondLargest == Integer.MIN_VALUE ? -1 : secondLargest;
    }

    public static void main(String[] args) {
        int[] arr = {10, 17, 37, 54, 79, 83, 26};
        int secondLargest = findSecondLargest(arr);
        if (secondLargest == -1) {
            System.out.println("Second Largest element does not exist.");
        } else {
            System.out.println("Second Largest element is : " + secondLargest);
        }
    }
}