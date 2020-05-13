package usta.sistemas;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // José Solano
        // 12/05/2020
        // This gives you the times for some swimmers
        menu();
        Scanner keyboard = new Scanner(System.in);
        int a = keyboard.nextInt();
        results(competition(a), a);
    }
    public static void menu() {
        // Water
        System.out.println("╔══════════════════════════════╗");
        System.out.println("║           SwimmyOne          ║");
        System.out.println("║             v1.8             ║");
        System.out.println("║          José Solano         ║");
        System.out.println("╚══════════════════════════════╝");
        System.out.println("\"I used to swim very well...\"");
        System.out.println("Input the total competitors");
    }
    public static double[][] competition(int a){
        double[][] ret = new double[a][10];
        for (int i = 0; i < a; i++) {
            for (int f = 0; f < 10; f++) {
                ret[i][f] = (double) Math.floor(Math.random()*(10-6)+6);
            }
        }
        return ret;
    }
    public static void results(double[][] a, int b) {
        for (int i = 0; i < b; i++) {
            System.out.println("The times for the competitor number " + (i+1) + " are shown bellow");
            for (int f = 0; f < 10; f++) {
                System.out.println((f+1) + " time = " + a[i][f]);
            }
            System.out.println("");
        }
    }
}