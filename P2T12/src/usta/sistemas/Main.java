package usta.sistemas;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // José Solano
        // 21/04/2020
        // This gives you the raw value and the IVA of n products
        menu();
        double raw = 0;
        int product = product();
        for (int i = 1; i <= product; i = i + 1){
            double value = value(i);
            raw = raw + value;
        }
        System.out.println("The total with IVA (Excluding products with a value of less than 1000 pesos) is " + raw);
    }
    public static void menu() {
        // This is a menu
        System.out.println(" _____________________________________");
        System.out.println("|              MoarMonz               |");
        System.out.println("|                v2.0                 |");
        System.out.println("|made by José Solano                  |");
        System.out.println(" -------------------------------------");
        System.out.println("This can actually be useful, so I'll save my ironic comment for now");
    }
    public static int product() {
        // This gives you the total of products
        System.out.println("Input how many products will you buy");
        Scanner keyboard = new Scanner(System.in);
        int n = keyboard.nextInt();
        while (n<1) {
            System.err.println("The value must be greater than 0, do it again");
            n = keyboard.nextInt();
        }
        return n;
    }
    public static double value(int i) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Input the value of the product number " + i);
        double value = keyboard.nextDouble();
        while (value < 0) {
            System.err.println("Input a valid number, you dumbass");
            value = keyboard.nextDouble();
        }
        if (value>1000) {
            value = value*1.19;
        }
        return value;
    }
}