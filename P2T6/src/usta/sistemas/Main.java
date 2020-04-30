package usta.sistemas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // José Gabriel
        // 15/04/2020
        // This calculates the number of seconds in certain hours, minutes, and transform seconds to hours and minutes
        menu();
        int option = option();
        if (option == 1) {
            hts();
            }
        else {
            if (option == 2) {
                mts();
            }
            else {
                if (option == 3) {
                    stmah();
                }
            }
        }
    }

    public static void menu() {
        // And again, there is a menu
        System.out.println(" _____________________________________");
        System.out.println("|        TimewaitsfornobodySoft       |");
        System.out.println("|                v1.98                |");
        System.out.println("|made by José Solano                  |");
        System.out.println(" -------------------------------------");
        System.out.println("\"I never learned how to do this\"");
    }
    public static int option() {
        // This, however, is my first cycle here...of course I have done cycles before in C++, but those programs have long been deleted
        System.out.println("Select an option \n1. Hours > Seconds \n2. Minutes > Seconds \n3. Seconds > Hours and Minutes");
        Scanner keyboard = new Scanner(System.in);
        int choice = keyboard.nextInt();
        while (choice < 1 || choice > 3) {
            System.err.println("Input a valid number");
            System.out.println("1. Hours > Seconds \\n2. Minutes > Seconds \\n3. Seconds > Hours and Minutes");
            choice = keyboard.nextInt();
        }
        return choice;
    }
    public static void hts(){
        System.out.println("Input the value to convert");
        Scanner keyboard = new Scanner(System.in);
        int hours = keyboard.nextInt();
        int seconds = hours*3600;
        System.out.println(hours + " hours are " + seconds + " seconds");
    }
    public static void mts(){
        System.out.println("Input the value to convert");
        Scanner keyboard = new Scanner(System.in);
        int minutes = keyboard.nextInt();
        int seconds = minutes*60;
        System.out.println(minutes + " minutes are " + seconds + " seconds");
    }
    public static void stmah(){
        System.out.println("Input the value to convert");
        Scanner keyboard = new Scanner(System.in);
        int seconds = keyboard.nextInt();
        int hours = seconds/3600;
        int minutes = seconds/60;
        System.out.println(seconds + " seconds are " + hours + " hours and " + minutes + " minutes");
    }
}
