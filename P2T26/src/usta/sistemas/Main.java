package usta.sistemas;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        // José Solano
        // 4/05/2020
        // Same as part 1, but there are two now
        int total = 0;
        menu();
        int[] morning = salary(), afternoon = salary();
        System.out.println("The random salaries for the eight employees of the morning are listed below");
        System.out.println("");
        for (int i = 0; i < 8; i++) {
            System.out.println("The salary of the " + (i+1)+ " employee is " + morning[i]);
        }
        System.out.println("The random salaries for the eight employees of the afternoon are listed below");
        System.out.println("");
        for (int i = 0; i < 8; i++) {
            System.out.println("The salary of the " + (i+1)+ " employee is " + afternoon[i]);
        }
        for (int i = 0; i < 8; i++) {
            total += morning[i]+afternoon[i];
        }
        System.out.println("The total of money you spend on salaries is " + total);
    }
    public static void menu() {
        // E
        System.out.println("╔══════════════════════════════╗");
        System.out.println("║        ArrayofVectors2       ║");
        System.out.println("║             v2.1             ║");
        System.out.println("║          José Solano         ║");
        System.out.println("╚══════════════════════════════╝");
        System.out.println("\"It has came back!\"");
    }
    public static int[] salary() {
        Random ran = new Random();
        int[] salary = new int[8];
        for (int i = 0; i < 8; i++) {
            salary[i] = (int) Math.floor(Math.random()*(2000000-980658)+980658);
        }
        return salary;
    }
}