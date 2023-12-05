import java.util.Scanner;

public class HexagonArea {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the side length of the hexagon
        System.out.print("Enter the side length of the hexagon: ");

        // Read the input from the user
        double sideLength = scanner.nextDouble();

        // Close the Scanner to avoid resource leak
        scanner.close();

        // Calculate the area of the hexagon
        double area = (6 * Math.pow(sideLength, 2)) / (4 * Math.tan(Math.PI / 6));

        // Display the result
        System.out.printf("The area of the hexagon is %.2f%n", area);
    }
}
