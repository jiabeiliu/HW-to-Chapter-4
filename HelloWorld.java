
import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declare and initialize variables
        int intVar1 = 10, intVar2 = 20;
        long longVar1 = 100000L, longVar2 = 200000L;
        double doubleVar1 = 10.5, doubleVar2 = 20.5;
        boolean boolVar1 = true, boolVar2 = false;
        char charVar1 = 'A', charVar2 = 'B';

        // Convert int to long
        long intToLong1 = intVar1;
        long intToLong2 = intVar2;

        // Convert long to int
        int longToInt1 = (int) longVar1;
        int longToInt2 = (int) longVar2;

        // Enter values for variables from the terminal
        System.out.print("Enter a new value for intVar1: ");
        intVar1 = scanner.nextInt();
        System.out.print("Enter a new value for intVar2: ");
        intVar2 = scanner.nextInt();

        // Arithmetic operations
        int addition = intVar1 + intVar2;
        int subtraction = intVar1 - intVar2;
        int multiplication = intVar1 * intVar2;
        double division = intVar1 / (double) intVar2;

        // Logical operations
        boolean andOperation = boolVar1 && boolVar2;
        boolean orOperation = boolVar1 || boolVar2;
        boolean notOperation = !boolVar1;

        // Print results
        System.out.println("Addition: " + addition);
        System.out.println("Subtraction: " + subtraction);
        System.out.println("Multiplication: " + multiplication);
        System.out.println("Division: " + division);
        System.out.println("AND Operation: " + andOperation);
        System.out.println("OR Operation: " + orOperation);
        System.out.println("NOT Operation: " + notOperation);

        scanner.close();
    }
}
