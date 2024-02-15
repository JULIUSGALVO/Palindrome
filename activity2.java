import java.util.Scanner;

public class activity2 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            // Get user input for a string
            System.out.print("Enter a string: ");
            String inputString = scanner.nextLine();

            // Convert the string to lowercase to make the palindrome check case-insensitive
            inputString = inputString.toLowerCase();

            // Convert the string to a char array
            char[] charArray = inputString.toCharArray();

            // Check if the string is a palindrome
            if (isPalindrome(charArray)) {
                System.out.println("The entered string is a palindrome.");
            } else {
                System.out.println("The entered string is not a palindrome.");
            }
        }
    }

    private static boolean isPalindrome(char[] charArray) {
        int left = 0;
        int right = charArray.length - 1;

        // Check if the characters from the outer ends are equal, and move towards the center
        while (left < right) {
            if (charArray[left] != charArray[right]) {
                return false; // Not a palindrome
            }
            left++;
            right--;
        }

        return true; // Palindrome
    }
}
