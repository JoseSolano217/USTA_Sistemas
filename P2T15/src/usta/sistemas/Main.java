package usta.sistemas;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        menu();
        System.out.println("You only have 500000 pesos");
        Scanner keyboard = new Scanner(System.in);
        int sum = 0, value, total = 0;
        do {
            System.out.println("Input the value");
            value = keyboard.nextInt();
            total = total + value;
            sum = sum + 1;
        } while (total<500000);
        if (total>500000) {
            total = total - value;
            sum = sum -1;
        }
        System.out.println("The total is " + total + " and the quantity of products is " + sum);
    }
    public static void menu() {
        // Menu
        System.out.println(" _____________________________________");
        System.out.println("|            Thisisbadman             |");
        System.out.println("|                v1.4                 |");
        System.out.println("|made by José Solano                  |");
        System.out.println(" -------------------------------------");
        System.out.println("You only have one shot");
    }
}
