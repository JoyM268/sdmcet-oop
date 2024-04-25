/* Write a Java program that takes IA-1 marks as input. The IA-1 marks must be in the range 0-20. Proper error messages to be printed if the input entered is
invalid (use exception handling mechanism for printing error messages). In case of valid input, the program should just print the entered marks as output */
import java.util.Scanner;

class IAMarksOutOfRange extends Exception {
    public String toString() {
        return "IA-1 marks must be between 0 and 20.";
    }
}

class Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter IA-1 marks (0-20): ");
        try {
            int marks = scanner.nextInt();
            if (marks < 0 || marks > 20) {
                throw new IAMarksOutOfRange();
            }
            System.out.println("You entered: " + marks);
        } catch (Exception e) {
            System.err.println("Error: " + e);
        }
    }
}