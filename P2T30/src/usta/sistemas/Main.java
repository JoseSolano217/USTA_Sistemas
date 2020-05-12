package usta.sistemas;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // José Solano
        // 6/05/2020
        // This shows random numbers and how many of those are even
        Scanner keyboard = new Scanner(System.in);
        menu();
        int n = keyboard.nextInt(), even = 0, odd = 0;
        while (n < 0) {
            System.err.println("Input a number greater than zero");
            n = keyboard.nextInt();
        }
        int[] number = num(n);
        for (int i = 0; i < n; i++) {
            if (number[n]%2 == 0) {
                even++;
            } else {
                odd++;
            }
            System.out.println(number[n]);
        }
        System.out.println("There are " + even + " even numbers and " + odd + " odd numbers");
    }
    public static void menu() {
        // No
        System.out.println("╔══════════════════════════════╗");
        System.out.println("║          Ican'teven          ║");
        System.out.println("║             v1.8             ║");
        System.out.println("║          José Solano         ║");
        System.out.println("╚══════════════════════════════╝");
        System.out.println("\"I'm sick of this waste of space\"");
    }
    public static int[] num(int a) {
        int[] ret = new int[a];
        for (int i = 0; i < a; i++) {
            ret[i] = (int) Math.floor(Math.random()*(100)+1);
        }
        return ret;
    }
}
