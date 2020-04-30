package usta.sistemas;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // José Solano
        // 29/04/2020
        // This tells you how many numbers there are between 1 and n. why would you need that? can't you count? Are you dumb? Are you disabled? Go to hell
        menu();
        int max = num();
        int p = 0, i, num = ;
        for (i = 2; i < max; i++) {
            if (max%i == 0) {
                p++;
            }
        }
        if (p == 0) {
            p++;
        }
        System.out.println("You got " + (i-1) + " numbers, and " + p + " of them are prime");
    }

    public static void menu() {
        //
        System.out.println(" _____________________________________");
        System.out.println("| I'minanexcruciatingpainpleasehelpme |");
        System.out.println("|                v6.9                 |");
        System.out.println("|made by José Solano                  |");
        System.out.println(" -------------------------------------");
    }
    public static int num() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Input a number");
        int num = keyboard.nextInt();
        while (num<=1) {
            System.err.println("You know your mistakes, scum");
            num = keyboard.nextInt();
        }
        return num;
    }
    
}