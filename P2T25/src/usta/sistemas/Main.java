package usta.sistemas;
import java.util.Random;
public class Main {

    public static void main(String[] args) {
        // José Solano
        // 4/05/2020
        // This creates five random salaries between 1000000 and 2000000
        menu();
        int[] salary = salaries();
        yes(salary);
    }
    public static void menu() {
        // E
        System.out.println("╔══════════════════════════════╗");
        System.out.println("║        ArrayofVectors        ║");
        System.out.println("║             v2.1             ║");
        System.out.println("║          José Solano         ║");
        System.out.println("╚══════════════════════════════╝");
    }
    public static  int[] salaries() {
        // This makes random numbers between 1000000 and 2000000
        Random ran = new Random();
        int[] salary = new int[5];
        for (int i = 0; i < 5; i++) {
            salary[i] = (int) Math.floor(Math.random()*(2000000-1000000)+1000000);
        }
        return salary;
    }
    public static void yes(int[] a) {
        // This is a waste of code lines
        System.out.println("The random salaries are listed below");
        System.out.println("");
        for (int i = 0; i < 5; i++) {
            System.out.println("The salary of the " + (i+1)+ " employee is " + a[i]);
        }
    }
}
