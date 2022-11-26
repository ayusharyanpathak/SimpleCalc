
import java.util.*;

public class Calc {
    public static void main(String args[]) {
        double a, b;
        int choice;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number = ");
        a = input.nextDouble();
        System.out.print("Enter second number = ");
        b = input.nextDouble();
        System.out.print("\n what you want to do ?");
        System.out.print("\n1. add");
        System.out.print("\n2. sub");
        System.out.print("\n3. product");
        System.out.print("\n 4. divide");
        System.out.print("\n Enter your choice =");
        choice = input.nextInt();
        if (choice == 1) {
            System.out.print("Sum of numbers =" + (a + b));
        } else if (choice == 2) {
            System.out.print("Sum of numbers =" + (a - b));

        } else if (choice == 3) {
            System.out.print("Sum of numbers =" + (a * b));

        } else if (choice == 4) {
            System.out.print("Sum of numbers =" + (a / b));

        } else {
            System.out.print("Please enter a valid input");

        }

    }
}