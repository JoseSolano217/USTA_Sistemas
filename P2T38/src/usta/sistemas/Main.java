package usta.sistemas;
import java.util.Scanner;
public class Main {
    public static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {
        // José Solano
        // 19/05/2020
        // This takes the voting of 123 places, each one with 5000 people to cease the bars once and for all
        menu();
        int[][] total = new int[123][2];
        int yes = yes(total), no = no(total);
        int nor_total = yes + no;
        System.out.print("The total votes is " + nor_total + ", " + ((yes*100)/nor_total) + "% of those are yes and ");
        System.out.println( ((no*100)/nor_total)+ "% are no");
        int val = winner(yes, no);
        moist(total);
        hahano(total);
    }
    public static void menu() {
        // God save this country
        System.out.println("╔══════════════════════════════╗");
        System.out.println("║             Arica           ║");
        System.out.println("║             v8.0             ║");
        System.out.println("║          José Solano         ║");
        System.out.println("╚══════════════════════════════╝");
        System.out.println("\"Guys stop, this isn't an important political event\"");
    }
    public static int yes(int[][] a) {
        int total_yes = 0;
        System.out.print("The total of people who voted for yes is ");
        for (int i = 0; i < a.length; i++) {
            a[i][1] = (int) Math.floor(Math.random()*(5000)+1);
            total_yes += a[i][1];
        }
        System.out.println(total_yes);
        return total_yes;
    }
    public static int no(int[][] a) {
        int total_no = 0;
        System.out.print("The total of people who voted for no is ");
        for (int i = 0; i < a.length; i++) {
            a[i][0] = (int) Math.floor(Math.random()*(5000)+1);
            total_no += a[i][0];
        }
        System.out.println(total_no);
        return total_no;
    }
    public static int winner (int yes, int no) {
        int ret;
        if (yes == no) {
            System.out.println("Draw");
            ret = 0;
        } else if (yes > no) {
            System.out.println("Bars will be closed with " + yes);
            ret = 1;
        } else {
            System.out.println("Bars will be kept open with " + no);
            ret = 2;
        }
        return ret;
    }
    public static void moist (int[][] a) {
        int moist_yes = 0, yes = 0, moist_no = 0, no = 0;
        for (int i = 0; i < a.length; i++) {
                if (yes < a[i][1]) {
                    yes = a[i][1];
                    moist_yes = i;
                } if (no < a[i][0]) {
                no = a[i][0];
                moist_no = i;
            }
            }
        System.out.println("The place where people most voted to end bars was " + (moist_no+1) + " with " + no + " votes");
        System.out.println("The place where people most voted to keep bars was " + (moist_yes+1) + " with " + yes + " votes");
        }
    public static void hahano (int[][] a) {
        int bad_yes = a.length, yes = 5000, bad_no = a.length, no = 5000;
        for (int i = 0; i < a.length; i++) {
            if (yes > a[i][1]) {
                yes = a[i][1];
                bad_yes = i;
            } if (no > a[i][0]) {
                no = a[i][0];
                bad_no = i;
            }
        }
        System.out.println("The place where people less voted to end bars was " + (bad_no+1) + " with " + no + " votes");
        System.out.println("The place where people less voted to keep bars was " + (bad_yes+1) + " with " + yes + " votes");
    }
}
