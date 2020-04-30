package usta.sistemas;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // José Solano
        // 14/04/2020
        // This decides if two numbers are multiples
        menu();
        if (ope()==true) {
            System.out.println("They are indeed multiple");
        }
        else {
            System.out.println("Sadly, they aren't multiple");
        }
    }
    public static void menu() {
        System.out.println(" _____________________________________");
        System.out.println("|              Multiman               |");
        System.out.println("|                v1.7                 |");
        System.out.println("|made by José Solano                  |");
        System.out.println(" -------------------------------------");
        System.out.println("\"Because people don't know how to do this things\"");
    }
    public static boolean ope() {
        System.out.println("Input the first number");
        Scanner keyboard = new Scanner(System.in);
        int num1 = keyboard.nextInt();
        System.out.println("Input the second number");
        int num2 = keyboard.nextInt();
        if (num1%num2==0) {
            return true;
        }
        else {
            return false;
        }
    }
}
