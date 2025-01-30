import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input base number
        System.out.print("Enter the base number: ");
        double base = scanner.nextDouble();

        // Input exponent
        System.out.print("Enter the exponent: ");
        double exponent = scanner.nextDouble();

        // Calculate power using Math.pow()
        double result = Math.pow(base, exponent);

        // Display the result
        System.out.println(base + " raised to the power of " + exponent + " is " + result);
        
    }
    
}
