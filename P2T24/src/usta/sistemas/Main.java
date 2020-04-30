package usta.sistemas;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // José Solano
        // 30/04/2020
        // This imitates a coffee machine
        int tea = 1300, black = 1000, milk = 1900, capp = 2500, mocc = 2700;
        menu();
        Scanner keyboard = new Scanner(System.in);
        int choice = keyboard.nextInt();
        int selection = selection(choice);
        sugar();
        System.out.println("Insert the money");
        int money = keyboard.nextInt();
        while (money > 5000) {
            System.out.println("This machine doesn't accept more than 5000 at once");
            money = keyboard.nextInt();
        }
        if (selection == 1) {
            while (money < 1300) {
                System.out.println("The money is not enough, you still need " + (1300 - money));
                money = money + keyboard.nextInt();
            }
            System.out.println("It'll take 30 seconds, your change is " + (money - 1300));
        }
        if (selection == 2) {
            while (money < 1000) {
                System.out.println("The money is not enough, you still need " + (1000 - money));
                money = money + keyboard.nextInt();
            }
            System.out.println("It'll take 30 seconds, your change is " + (money - 1000));
        }
        if (selection == 3) {
            while (money < 1900) {
                System.out.println("The money is not enough, you still need " + (1900 - money));
                money = money + keyboard.nextInt();
            }
            System.out.println("It'll take 45 seconds, your change is " + (money - 1900));
        }
        if (selection == 4) {
            while (money < 2500) {
                System.out.println("The money is not enough, you still need " + (2500 - money));
                money = money + keyboard.nextInt();
            }
            System.out.println("It'll take 60 seconds, your change is " + (money - 2500));
        }
        if (selection == 5) {
            while (money < 1300) {
                System.out.println("The money is not enough, you still need " + (2700 - money));
                money = money + keyboard.nextInt();
            }
            System.out.println("It'll take 70 seconds, your change is " + (money - 2700));
        }
    }
    public static void menu() {
        //
        System.out.println("╔══════════════════════════════╗");
        System.out.println("║     Select your beverage     ║");
        System.out.println("║1.Tea                  $1.300 ║");// 30s
        System.out.println("║2.Black coffee         $1.000 ║");// 30s
        System.out.println("║3.Milk coffee          $1.900 ║");// 45s
        System.out.println("║4.Cappuccino           $2.500 ║");// 60s
        System.out.println("║5.Moccasin             $2.700 ║");// 70s
        System.out.println("╚══════════════════════════════╝");
    }
    public static int selection(int a) {
        int ret = 0;
        Scanner keyboard = new Scanner(System.in);
        while (a < 1 || a > 5) {
            System.out.println("The input isn't recognized, try again or input E to exit");
            a = keyboard.nextInt();
        }
        if (a == 1) {
            ret = 1;
        }
        if (a == 2) {
            ret = 2;
        }
        if (a == 3) {
            ret = 3;
        }
        if (a == 4) {
            ret = 4;
        }
        if (a == 5) {
            ret = 5;
        }
        return ret;
    }
    public static int sugar() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("On a scale of 1 to 10, input how much sugar you want");
        int ret = keyboard.nextInt();
        while (ret < 1 || ret > 10) {
            System.out.println("Input a valid value");
            ret = keyboard.nextInt();
        }
        return ret;
    }
}
