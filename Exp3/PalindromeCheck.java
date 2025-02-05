public class PalindromeCheck {
    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (Character.toLowerCase(str.charAt(left)) != Character.toLowerCase(str.charAt(right))) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        String str1 = "NAMAN";
        String str2 = "HUMAN";
        if (isPalindrome(str1)) {
            System.out.println(str1 + " is a palindrome");
        } else {
            System.out.println(str1 + " is not a palindrome");
        }
        if (isPalindrome(str2)) {
            System.out.println(str2 + " is a palindrome");
        } else {
            System.out.println(str2 + " is not a palindrome");
        }
    }
}