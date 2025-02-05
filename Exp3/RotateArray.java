class RotateArray {

    public static void rotateArray(int[] arr, int k) {
        int n = arr.length;
        k = k % n;

        if (k < 0) {
            k = n + k;
        }

        reverse(arr, 0, n - 1); 
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1); 
    }

    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {3, 6, 8, 0, 5};
        int k = 2;

        System.out.println("Original Array:");
        printArray(arr);

        rotateArray(arr, k);
        System.out.println("Rotated Array:");
        printArray(arr);


        int[] arr2 = {2, 6, 2, 8, 6};
        int k2 = -1;
        System.out.println("Original Array 2 :");
        printArray(arr2);

        rotateArray(arr2, k2);
        System.out.println("Rotated Array 2 :");
        printArray(arr2);

       
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
// logic reverse full array and then again reverse from 0 index to k position -
// 1 and then reverse from k to array.length