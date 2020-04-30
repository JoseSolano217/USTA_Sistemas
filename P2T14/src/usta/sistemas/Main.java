package usta.sistemas;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        menu();
        System.out.println("Be inputting numbers");
        Scanner keyboard = new Scanner(System.in);
        int total = 0;
        double a = 0, sum = 0, avrg;
        while (a<100) {
            a = keyboard.nextDouble();
            sum = sum + a;
            total += 1;
        }
        if (a < 100) {
            avrg = sum/total;
        }
        System.out.println("You inputted " + total + " Numbers, which sums " + sum);
    }
    public static void menu() {
        // Menu
        System.out.println(" _____________________________________");
        System.out.println("|                Nums                 |");
        System.out.println("|                v1.3                 |");
        System.out.println("|made by José Solano                  |");
        System.out.println(" -------------------------------------");
        System.out.println("I got nothing");
    }
}
