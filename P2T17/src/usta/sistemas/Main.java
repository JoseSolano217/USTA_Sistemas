package usta.sistemas;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // José Solano
        // 23/04/2020
        // This is a login
        menu();
        Scanner keyboard = new Scanner(System.in);
        int password = keyboard.nextInt(), tries = 5;
        boolean right = false;
        if (password == 352 || password == 259 || password == 569) {
            right = true;
        } else {
            right = false;
            while (tries > 1 && right == false) {
                tries -= 1;
                System.out.println("Wrong password, try again (" + tries + " tries left)");
                password = keyboard.nextInt();
                if (password == 352 || password == 259 || password == 569) {
                    right = true;
                }
            }
        }
        if (right == true && tries > 0) {
            System.out.println("Access granted. Welcome to our society");
        } else {
            System.err.println("Too many wrong tries. Special units where sent your way. Have a good day");
        }
    }
    public static void menu() {
        // Me'n'u
        System.out.println(" _____________________________________");
        System.out.println("|               DPSInc                |");
        System.out.println("|                v1.8                 |");
        System.out.println("|made by José Solano                  |");
        System.out.println(" -------------------------------------");
        System.out.println("Input your password");
    }
}