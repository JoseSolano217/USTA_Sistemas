package usta.sistemas;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // José Solano
        // 20/04/2020
        // This gives you the average height of a group of children, or any kind of grown up man, actually
        menu();
        int child = child();
        int i;
        double sum = 0;
        for (i = 1; i <= child; i += 1) {
            double height = height(i);
            sum = sum + height;
        }
        double avrg = sum/child;
        System.out.println("It is " + avrg);
    }

    public static void menu() {
        // This is a menu
        System.out.println(" _____________________________________");
        System.out.println("|           Y'allreadykids?           |");
        System.out.println("|                v2.0                 |");
        System.out.println("|made by José Solano                  |");
        System.out.println(" -------------------------------------");
        System.out.println("\"Big kids are helth\"");
    }
    public static int child() {
        // This gives you the children total
        System.out.println("Input how many children you have");
        Scanner keyboard = new Scanner(System.in);
        int n = keyboard.nextInt();
        while (n<1) {
            System.err.println("The value must be greater than 0, do it again");
            n = keyboard.nextInt();
        }
        return n;
    }
    public static double height(int i) {
        // This returns the height of one child
        System.out.println("Input the height in meters of your child number " + i);
        Scanner keyboard = new Scanner(System.in);
        double height = keyboard.nextDouble();
        while (height<0.2 || height>2.0) {
            System.out.println("There is no way a kid can have that height");
            System.out.println("Do it again, this time for real");
            height = keyboard.nextInt();
        }
        return height;
    }
}
