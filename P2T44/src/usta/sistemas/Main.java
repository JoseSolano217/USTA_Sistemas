package usta.sistemas;
import java.util.Scanner;
import java.io.PrintWriter;
public class Main {
public static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {
        // José Solano
        // 1/06/2020
        // This lets you input your basic personal data on a text file
        menu();
        try {
            System.out.println("Input your name");
            String name = keyboard.nextLine();
            System.out.println("Input your biography");
            String bio = keyboard.nextLine();
            System.out.println("Input your email");
            String email = keyboard.nextLine();
            System.out.println("Input your number");
            String num = keyboard.nextLine();
            Boolean saver = save(name, bio, email, num);
            if (saver == true) {
                System.out.println("Data saved successfully");
            }
        } catch (Exception e) {
            System.err.println("Program finished because:");
            e.printStackTrace();
            System.err.println("Show it to an engineer to fix it");
        }
    }
    public static void menu() {
        // Indeed
        System.out.println("╔══════════════════════════════╗");
        System.out.println("║            Filing            ║");
        System.out.println("║             v1.2             ║");
        System.out.println("║          José Solano         ║");
        System.out.println("╚══════════════════════════════╝");
        System.out.println("Incredibly useless.");
    }
    public static boolean save (String a, String b, String c, String d) {
        boolean saver = true;
        try {
            PrintWriter file = new PrintWriter("D:/user.txt", "UTF-8");
            file.println("Name: " + a);
            file.println("Biography: " + b);
            file.println("Email: " + c);
            file.println("Number: " + d);
            file.close();
        } catch (Exception e) {
            System.err.println("The software couldn't close your data because:");
            e.printStackTrace();
            saver = false;
        }
        return saver;
    }
}
