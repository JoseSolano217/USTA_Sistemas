package usta.sistemas;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // José Solano
        // 16/04/2020
        // This plays with the strings you put here
        Scanner keyboard = new Scanner(System.in);
        menu();
        int choice = option();
        if (choice == 1) {
            string();
        }
        else {
            if (choice == 2) {
                capital();
            }
            else {
                if (choice == 3) {
                    vowel();
                }
            }
        }
    }

    public static void menu() {
        System.out.println(" _____________________________________");
        System.out.println("|              Stringboi              |");
        System.out.println("|                v1.2                 |");
        System.out.println("|made by José Solano                  |");
        System.out.println(" -------------------------------------");
        System.out.println("\"This is really useless! Thanks!\"");
    }

    public static int option() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Select an option \n1. First character \n2. Capital conversion \n3. Vowel conversion");
        int choice = keyboard.nextInt();
        while (choice < 1 || choice > 3) {
            System.err.println("Enter a valid option dumbass");
            choice = keyboard.nextInt();
        }
        return choice;
    }
    public static void string() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Write the word");
        String word = keyboard.nextLine();
        while (word.length()<5) {
            System.err.println("The word must be 5 characters minimum");
            word = keyboard.nextLine();
        }
        char c = word.charAt(0);
        System.out.println("The first letter of your word is " + c);
    }
    public static void capital() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Write the word");
        String word = keyboard.nextLine();
        while (word.length()<5) {
            System.err.println("The word must be 5 characters minimum");
            word = keyboard.nextLine();
        }
        System.out.println("Your word in capitals is " + word.toUpperCase());
    }
    public static void vowel() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Write the word");
        String word = keyboard.nextLine();
        while (word.length()<5) {
            System.err.println("The word must be 5 characters minimum");
            word = keyboard.nextLine();
        }
        System.out.println("The word, replacing all vowels with @, is " + word.replace("a","@").replace("e","@").replace("i","@").replace("o","@").replace("u","@").replace("A","@").replace("E","@").replace("I","@").replace("O","@").replace("U","@"));
    }
}

