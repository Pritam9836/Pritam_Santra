import java.util.Scanner;

public class VowelConsonantCounter {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Variables to hold the count of vowels and consonants
        int vowelCount = 0;
        int consonantCount = 0;

        // Convert the string to lowercase to make the comparison case-insensitive
        inputString = inputString.toLowerCase();

        // Iterate through each character in the string
        for (int i = 0; i < inputString.length(); i++) {
            char ch = inputString.charAt(i);

            // Check if the character is a vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
            }
            // Check if the character is a consonant (alphabetic characters)
            else if ((ch >= 'a' && ch <= 'z')) {
                consonantCount++;
            }
        }

        // Display the results
        System.out.println("Number of vowels: " + vowelCount);
        System.out.println("Number of consonants: " + consonantCount);

        // Close the scanner object
        scanner.close();
    }
}
