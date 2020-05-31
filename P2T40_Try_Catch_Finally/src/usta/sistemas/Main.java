package usta.sistemas;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // Asks for two numbers and divide them
        try {
            Scanner keyboard = new Scanner(System.in);
            System.out.println("Input the first number");
            int a = keyboard.nextInt();
            System.out.println("Input the second number");
            int b = keyboard.nextInt();
            System.out.println("The sum is " + (a + b));
        } catch (Exception e) {
            System.err.println("The software can only use integer numbers, not words or fractional numbers");
        }
    }
}
