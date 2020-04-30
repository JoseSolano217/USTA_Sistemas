package usta.sistemas;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // José Solano
        // 23/04/2020
        // This saves data of some laps of running, according to the tiredness level of the person
        menu();
        System.out.println("Go run and enter your first mark of time");
        boolean tired = false;
        int laps = 0;
        Scanner keyboard = new Scanner(System.in);
        double time = 0, best = 0, average, total_time = 0;
        while (tired != true) {
            laps += 1;
            System.out.println("Input your time for the lap number " + laps + ", in seconds of course");
            time = keyboard.nextDouble();
            if (time < 1) {
                tired = true;
            } else {
                total_time += time;
                System.out.println("Are you tired? Input false or true");
                tired = keyboard.nextBoolean();
                if (laps == 1) {
                    best = time;
                }
                if (time<best) {
                    best = time;
                }
            }
        }
        if (time > 0) {
            average = total_time/laps;
            System.out.println("Your total laps where " + laps + ", your best time is " + best + ", your average time is " + average + ", and your total time was " + total_time);
        } else {
            System.err.println("Go to hell");
        }
    }

    public static void menu() {
        // Menu
        System.out.println(" _____________________________________");
        System.out.println("|             Laps'n'time             |");
        System.out.println("|                v1.3                 |");
        System.out.println("|made by José Solano                  |");
        System.out.println(" -------------------------------------");
        System.out.println("'Cause you're weak");
    }
}