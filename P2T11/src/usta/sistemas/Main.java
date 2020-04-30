package usta.sistemas;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // José Solano
        // 21/04/2020
        // This makes the total of a person in some months
        menu();
        int months = months();
        int sum = 0;
        for (int i = 1; i <= months; i = i + 1) {
            int money = money(i);
            sum = sum + money;
        }
        System.out.println("The average money you save each month is " + sum / months + ", and the total money you have saved is " + sum);
        if (sum / months <= 0) {
            System.out.println("Either you messed up on something or you are really bad saving, you need help");
        }
    }
    public static void menu() {
        // Menu
        System.out.println(" _____________________________________");
        System.out.println("|               Monmonz               |");
        System.out.println("|                v1.3                 |");
        System.out.println("|made by José Solano                  |");
        System.out.println(" -------------------------------------");
        System.out.println("\"HERE COMES THE MONEY\"");
    }
    public static int months() {
        // This gives you the total of months
        Scanner keyboard = new Scanner(System.in);
        int n;
        do {
            System.out.print("Input how many months you have saved, ");
            System.err.print("a valid number if you will");
            n = keyboard.nextInt();
        } while (n < 1);
        return n;
    }
    public static int money(int i) {
        // This returns the saved money in one month
        System.out.println("Input the money you saved in the month " + i + ", input a negative number if you only spent");
        Scanner keyboard = new Scanner(System.in);
        int monz = keyboard.nextInt();
        return monz;
    }
}