package usta.sistemas;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // José Solano
        // 14/04/2020
        // This asks for two numbers and says if they are the same
        menu();
        boolean compare = compare();
        if (compare == true) {
            System.out.println("They are the same numbers");
        }
        else {
            System.out.println("They aren't the same numbers");
        }
    }
    public static void menu() {
        System.out.println(" _____________________________________");
        System.out.println("|             Booleanman              |");
        System.out.println("|                v1.7                 |");
        System.out.println("|made by José Solano                  |");
        System.out.println(" -------------------------------------");
        System.out.println("\"We find out obvious things\"");
    }
    public static boolean compare() {
        System.out.println("Input the first number");
        Scanner keyboard = new Scanner(System.in);
        int num1 = keyboard.nextInt();
        System.out.println("Input the second number");
        int num2 = keyboard.nextInt();
        if (num1 == num2) {
            return true;
        }
        else {
            return false;
        }
    }
}
