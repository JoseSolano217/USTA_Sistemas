package usta.sistemas;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // José Solano
        // 5/05/2020
        // This returns the age of people and tells you if they ate over 18
        menu();
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Input the people/victims");
        int people = keyboard.nextInt();
        while (people <= 0) {
            System.err.println("Input a value I can actually use");
            people = keyboard.nextInt();
        }
        int[] age = age(people);
        int old = 0, young = 0, sixty = 0, total = 0;
        double average;
        for (int i = 0; i<people; i++) {
            System.out.println("The age of the " + (i+1) + " person is " + age[i]);
            if (age[i] >= 18) {
                old ++;
                System.out.println("He's over 18");
            } else {
                young ++;
                System.out.println("He's under 18");
            } if (age[i] >= 60) {
                sixty++;
            }
            total += age[i];
        }
        average = total/people;
        System.out.println("The total of people over 18 is " + old + ", the total of people under 18 is " + young + " and the total of people over 60 is " + sixty);
        System.out.println("The average of age is " + average);
    }
    public static void menu() {
        // E
        System.out.println("╔══════════════════════════════╗");
        System.out.println("║            Vector            ║");
        System.out.println("║             v1.8             ║");
        System.out.println("║          José Solano         ║");
        System.out.println("╚══════════════════════════════╝");
        System.out.println("\"I'm sick of this waste of space\"");
        }
    public static int[] age(int people) {
        int[] age = new int[people];
        for (int i = 0; i < people; i++) {
            age[i] = (int) Math.floor(Math.random()*(80-1))+1;
        }
        return age;
    }
}