package usta.sistemas;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // José Solano
        // 7/05/2020
        // This gives random values to a person's weight, and determines if they are fat or skinny
        Scanner keyboard = new Scanner(System.in);
        menu();
        int n = keyboard.nextInt(), skinny = 0, fat = 0, malnourished = 0;
        while (n < 0) {
            System.err.println("Input a number greater than zero");
            n = keyboard.nextInt();
        }
        double[] weight = num(n);
        for (int i = 0; i < n; i++) {
            if (weight[i] < 40) {
                malnourished++;
            }
            if (weight[i] >= 40 && weight[i] < 70) {
                skinny++;
            }
            if (weight[i] >= 70) {
                fat++;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println("The weight of the person number " + (i+1) + " is " + weight[i]);
        }
        System.out.println("There are " + malnourished + " malnourished persons, " + skinny + " persons, and " + fat + " fat bois");
    }
    public static void menu() {
        // Scrambled eggs
        System.out.println("╔══════════════════════════════╗");
        System.out.println("║         50TonsPerPill        ║");
        System.out.println("║             v1.4             ║");
        System.out.println("║          José Solano         ║");
        System.out.println("╚══════════════════════════════╝");
        System.out.println("");
    }
    public static double[] num(int a) { // Yes, more waste of space, but actually not
        double[] ret = new double[a];
        for (int i = 0; i < a; i++) {
            ret[i] = Math.random()*(120-21)+20;
        }
        return ret;
    }
}