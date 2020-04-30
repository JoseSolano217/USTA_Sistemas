package usta.sistemas;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // José Solano
        // 27/04/2020
        // This multiply
        menu();
        System.out.println("Input a number, and 0 to exit");
        Scanner keyboard = new Scanner(System.in);
        int num = keyboard.nextInt();
        while (num > 99 || num < 0) {
            System.err.println("Input a number between 1 and 99");
            num = keyboard.nextInt();
        }
        while (num != 0) {
            if (num != 0) {
                for (int i = 0; i <= 10; i += 1) {
                    int multi = num * i;
                    System.out.println(num + " x " + i + " = " + multi);
                }
            }
            System.out.println("You wish to continue? If so, just put the next number, or 0 to exit");
            num = keyboard.nextInt();
            while (num > 99 || num < 0) {
                System.err.println("Input a number between 1 and 99");
                num = keyboard.nextInt();
            }
        }
        System.out.println("Exit successful");
    }
    public static void menu() {
        //
        System.out.println(" _____________________________________");
        System.out.println("|          CripplingDepression        |");
        System.out.println("|                v1.3                 |");
        System.out.println("|made by José Solano                  |");
        System.out.println(" -------------------------------------");
        System.out.println("I don't know what choices have brought me here, but I live in eternal regret for it");
    }
}
