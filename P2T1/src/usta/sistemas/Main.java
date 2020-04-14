package usta.sistemas;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // José Solano
        // 13/04/2020
        // This converts various temperatures
        menu();
        opt();
        int choice = opt();
        sec(choice);
    }
    public static void menu(){
        // This creates a menu
        System.out.println(" _____________________________________");
        System.out.println("|              BoiledEgg              |");
        System.out.println("|                v1.7                 |");
        System.out.println("|made by José 'Eater of breads' Solano|");
        System.out.println(" -------------------------------------");
        System.out.println("Input what kind of degree you want to convert \n1. Celcius \n2. Farenheith \n3. Kelvin");
    }
    public static int opt() {
        // This takes the degree to convert
        Scanner keyboard = new Scanner(System.in);
        int option = keyboard.nextInt();
        if (option == 1 || option == 2 || option == 3) {
            System.out.println("Accepted");
            System.out.println("Now input the changed degree");
        }
        else {
            System.err.println("You must enter a valid number");
            option = 0;
        }
        return option;
    }
    public static int sec(int conv){
        // This takes the second degree
        Scanner keyboard = new Scanner(System.in);
        int option = keyboard.nextInt();
        if (option == 1 || option == 2 || option == 3) {
            if (conv==option) {
                System.err.println("You must enter a different valid number");
            }
        }
        else {
            System.err.println("You must enter a valid number");
        }
        return option;
    }
    public static void convertions(int opt, int sec){
        // Finally, these are the operations
        System.out.println("Input the value to convert");
        Scanner keyboard = new Scanner(System.in);
        int value = keyboard.nextInt();
        if (opt == 1 && sec == 2) {
            System.out.println("The converted value is " + ((value*9/5)+32);
        }
        else {
            if (opt == 2 && sec == 1) {
                System.out.println("The converted value is " + ((value-32)*5/9);
        }
            else {
                if (opt == 1 && sec == 3) {
                    System.out.println("The converted value is " + (value+273.15);
                }
                else {
                    if (opt == 3 && sec == 3) {
                        System.out.println("The converted value is " + (value-273.15);
                    }
                    else {
                        System.err.println("I have no idea what happened, but you screwed it up, you dumbass"); // I was tired here
                    }
                }
            }
        }
    }