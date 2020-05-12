package usta.sistemas;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // José Solano
        // 7/05/2020
        // This votes randomly for n persons
        Scanner keyboard = new Scanner(System.in);
        menu();
        int n = keyboard.nextInt(), winner = 0, total = 0, can = 0, second = 0, sec = 0;
        int[] votes = num(n);
        while (n < 0) {
            System.err.println("Input a number greater than zero");
            n = keyboard.nextInt();
        }
        for (int i = 0; i < n; i++) {
            total = total + votes[i];
            System.out.println("The candidate number " + (i+1) + " have " + votes[i] + " votes");
            if (votes[i] > winner) {
                winner = votes[i];
                can = (i);
            }
        }
        for (int i = 0; i < n; i++) {
            if (can != i) {
                if (second < votes[i]) {
                    second = votes[i];
                    sec = i;
                }
            }
        }
        System.out.println("The total citizens that voted were " + total);
        System.out.println("The candidate number " + (can+1) + " won, with " + winner + " votes");
        System.out.println("The candidate number " + (sec+1) + " was second with " + second + " votes");
        System.out.println("God bless this country");
    }
    public static void menu() {
        // Eagle
        System.out.println("╔══════════════════════════════╗");
        System.out.println("║            Vector            ║");
        System.out.println("║             v1.8             ║");
        System.out.println("║          José Solano         ║");
        System.out.println("╚══════════════════════════════╝");
        System.out.println("\"Do you want freedom?\"");
    }
    public static int[] num(int a) { // Yes, more waste of space, but actually not
        int[] ret = new int[a];
        for (int i = 0; i < a; i++) {
            ret[i] = (int) Math.floor(Math.random()*(5000)+1);
        }
        return ret;
    }
}