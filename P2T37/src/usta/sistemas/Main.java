package usta.sistemas;
import java.util.Scanner;
public class Main {
    public static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        // José Solano
        // 19/05/2020
        // This creates random numbers from 1 to 100 for a matrix with [X][Y] spaces given by the user
        menu();
        int col = columns(), ro = rows();
        int[][] mat = num(col, ro);
        avrg(col, ro, mat);
    }

    public static void menu() {
        // *visible confusion*
        System.out.println("╔══════════════════════════════╗");
        System.out.println("║             What             ║");
        System.out.println("║        vIt's a mystery       ║");
        System.out.println("║          José Solano         ║");
        System.out.println("╚══════════════════════════════╝");
        System.out.println("I can't comprehend");
    }
    public static int columns() {
        int ret;
        System.out.println("Input the x dimension of the matrix");
        ret = keyboard.nextInt();
        while (ret < 0) {
            System.err.println("Input a valid number greater than 0");
            ret = keyboard.nextInt();
        }
        return ret;
    }
    public static int rows() {
        int ret;
        System.out.println("Input the y dimension of the matrix");
        ret = keyboard.nextInt();
        while (ret < 0) {
            System.err.println("Input a valid number greater than 0");
            ret = keyboard.nextInt();
        }
        return ret;
    }
    public static int[][] num(int a, int b) {
        int[][] ret = new int[a][b];
        for (int i = 0; i < a; i++) {
            for (int f = 0; f < b; f++) {
                ret[i][f] = (int) Math.floor(Math.random()*(100)+1);
            }
        }
        return ret;
    }
    public static void avrg(int a, int b, int[][] c) {
        for (int i = 0; i < b; i++) {
            int sum = 0;
            System.out.print("The average for the row number " + (i+1) + " is ");
            for (int f = 0; f < a; f++) {
                sum += c[f][i];
            }
            System.out.println(sum);
        }
    }
}