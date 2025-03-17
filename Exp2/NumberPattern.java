public class NumberPattern {

    public static void main(String[] args) {
         

        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            if (i > 1) { 
                for (int k = i - 1; k >= 1; k--) {
                    System.out.print(" "); 
                }
            }
            System.out.println(); 
        }
    }
}