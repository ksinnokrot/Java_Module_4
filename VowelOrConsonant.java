import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a letter
        System.out.print("Enter a letter: ");

        // Read the input from the user (considering only the first character)
        char input = scanner.next().charAt(0);

        // Close the Scanner to avoid resource leak
        scanner.close();

        // Check if the input is a letter
        if (Character.isLetter(input)) {
            // Convert the letter to lowercase for easy comparison
            char lowercaseInput = Character.toLowerCase(input);

            // Check if the letter is a vowel or consonant
            if (lowercaseInput == 'a' || lowercaseInput == 'e' ||
                lowercaseInput == 'i' || lowercaseInput == 'o' || lowercaseInput == 'u') {
                System.out.println(input + " is a vowel");
            } else {
                System.out.println(input + " is a consonant");
            }
        } else {
            // Display an error message for invalid input
            System.out.println(input + " is an invalid input");
        }
    }
}
