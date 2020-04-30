package usta.sistemas;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // José Solano
        // 28/04/2020
        // It asks for ten numbers and then gives you average and number of 0s
        menu();
        nums();
    }
    public static void menu() {
        // Menu
        System.out.println(" _____________________________________");
        System.out.println("|          HahaNumbersGo123           |");
        System.out.println("|                v1.4                 |");
        System.out.println("|made by José Solano                  |");
        System.out.println(" -------------------------------------");
        System.out.println("I need to get to the bathroom");
    }
    public static void nums() {
        Scanner keyboard = new Scanner(System.in);
        // this asks for ten numbers
        int positive = 0, negative = 0, zeroes = 0, countplus = 0, countless = 0, i;
        double posavrg = 0, negavrg = 0, avrg = 0;
        for (i = 1; i <= 10; i++) {
            System.out.println("Input the number " + i);
            int num = keyboard.nextInt();
            if (num > 0) {
                positive += num;
                countplus++;
            }
            if (num < 0) {
                negative += num;
                countless++;
            }
            if (num == 0) {
                zeroes++;
            }
        }
        if (countplus > 0) {
            posavrg = positive / countplus;
        }
        if (countless < 0){
            negavrg = negative / countless;
        }
        avrg = (positive+negative)/10;
        System.out.println("The average of only the positive numbers is " + posavrg + ", the average of negative numbers is " + negavrg + ", the total of zeroes is " + zeroes + ", and the total average is " + avrg);
    }
}
