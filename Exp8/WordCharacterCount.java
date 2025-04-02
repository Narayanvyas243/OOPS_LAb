import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class WordCharacterCount {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the text file name: ");
        String fileName = input.nextLine();
        int wordCount = 0;
        int charCount = 0;

        try (FileInputStream fis = new FileInputStream(fileName)) {
            int c;
            boolean isWord = false;
            while ((c = fis.read()) != -1) {
                charCount++;
                if (Character.isWhitespace(c)) {
                    if (isWord) {
                        wordCount++;
                        isWord = false;
                    }
                } else {
                    isWord = true;
                }
            }
            if (isWord) {
                wordCount++;
            }
            System.out.println("Total characters (excluding whitespace): " + charCount);
            System.out.println("Total words: " + wordCount);
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}