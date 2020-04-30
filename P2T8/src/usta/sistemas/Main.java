package usta.sistemas;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // José Solano
        // 17/04/2020
        // This converts kilometers to miles and vice versa
        menu();
        int choice = option();
        if (choice == 1) {
            kmtml();
        }
        else {
            if (choice == 2) {
                mltkm();
            }
        }

    }
    public static void menu() {
        System.out.println(" _____________________________________");
        System.out.println("|               America               |");
        System.out.println("|                v1.7                 |");
        System.out.println("|made by José Solano                  |");
        System.out.println(" -------------------------------------");
        System.out.println("\"Because meter bad\"");
    }
    public static int option () {
        System.out.println("Choose an option \n1. Km to Ml \n2. Ml to Km (Heresy)");
        Scanner keyboard = new Scanner(System.in);
        int choice = keyboard.nextInt();
        while (choice != 1 && choice != 2) {
            System.err.println("Input a valid number");
            choice = keyboard.nextInt();
        }
        return choice;
    }
    public static void kmtml () {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Input the value in those filthy kilometers");
        int km = keyboard.nextInt();
        double ml = km/1.609;
        System.out.println("The new value is " + ml);
    }
    public static void mltkm () {
        Scanner keyboard = new Scanner(System.in);
        System.err.println("You filthy monster, you don't even deserve to be dead");
        System.err.println("Input your shit");
        int ml = keyboard.nextInt();
        double km = ml*1.609;
        System.err.println("Look what you did, you monster, it is " + km);
    }
}
