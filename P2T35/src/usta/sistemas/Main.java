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
        while (a < 1) {
            System.err.println("You know your sins, impure. do it again");
            a = keyboard.nextInt();
        }
        yes(rating(a), a);
    }

    public static void menu() {
        // Consume
        System.out.println("╔══════════════════════════════╗");
        System.out.println("║             Food             ║");
        System.out.println("║             v1.8             ║");
        System.out.println("║          José Solano         ║");
        System.out.println("╚══════════════════════════════╝");
        System.out.println("It's only food, what can I say about it?");
        System.out.println("Input the students");
    }
    public static int[][] rating(int a) {
        int[][] ret = new int[a][20];
        for (int i = 0; i < a; i++) {
            for (int f = 0; f < 20; f++) {
                ret[i][f] = (int) Math.floor(Math.random()*(10));
            }
        }
        return ret;
    }
    public static void yes(int[][] b, int a) {
        int no = 0, ye = 0, av = 0;
        Double na, ya, re;
        for (int i = 0; i < a; i++) {
            for (int f = 0; f < 20; f++) {
                if (b[i][f] <= 3) {
                    no++;
                } else if (b[i][f] >= 7){
                    ye++;
                } else {
                    av++;
                }
            }
        }
        if (no != 0) {
            na = (double)(no*100)/(a*20);
        } else {
            na = 0.0;
        } if (ye != 0) {
                ya = (double)(ye*100)/(a*20);
            } else {
            ya = 0.0;
        } if (av != 0) {
            re = (double)(av*100)/(a*20);
        } else {
            re = 0.0;
        }
        System.out.println("The total bad ratings were " + no + ", making it " + na + " percent of total ratings");
        System.out.println("The total regular ratings were " + av + ", making it " + re + " percent of total ratings");
        System.out.println("The total good ratings were " + ye + ", making it " + ya + " percent of total ratings");
    }
}