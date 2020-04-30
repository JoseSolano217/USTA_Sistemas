package usta.sistemas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // José Solano
        // 28/04/2020
        // This tells you how many characters you write
        menu();
        int num = num();
        int digits = 0;
        if (num != 0) {
            while (num != 0) {
                num = num / 10;
                digits++;
            }
        }
        System.out.printf("The total digits on this number is " + digits);
    }

    public static void menu() {
        // Menu
        System.out.println(" _____________________________________");
        System.out.println("|          HahaNumbersGo123           |");
        System.out.println("|                v1.4                 |");
        System.out.println("|made by José Solano                  |");
        System.out.println(" -------------------------------------");
        System.out.println("I need to get to the bathroom");
    }

    public static int num() {
        // This is a waste of space, never do this, only villians do it
        Scanner keyboard = new Scanner(System.in);
        System.out.printf("Input a number, any number except for decimals, it will crash");
        int num = keyboard.nextInt();
        return num;
    }
}
