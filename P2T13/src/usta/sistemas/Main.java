package usta.sistemas;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // José Solano
        // 20/04/2020
        // This calculates the average salary and the highest one
        menu();
        int employer = employer();
        double total = 0, highest = 0, average = 0, salary = 0;
        for (int i = 1; i <= employer ; i = i + 1) {
            salary = salary(i);
            total = total + salary;
            if (highest < salary) {
                highest = salary;
            }
        }
        average = total/employer;
        System.out.println("The total salary is " + total + ", the average salary is " + average + ", and the highest salary is " + highest);
    }
    public static void menu() {
        // More menu
        System.out.println(" _____________________________________");
        System.out.println("|            AhyesHierarchy           |");
        System.out.println("|                v1.0                 |");
        System.out.println("|made by José Solano                  |");
        System.out.println(" -------------------------------------");
        System.out.println("Monz");
    }
    public static int employer() {
        // This is the employer total
        System.out.println("Input how many employers are there");
        Scanner keyboard = new Scanner(System.in);
        int n = keyboard.nextInt();
        while (n<1) {
            System.err.println("The value must be greater than 0, do it again");
            n = keyboard.nextInt();
        }
        return n;
    }
    public static double salary(int i) {
        // This returns the salary of one employer
        System.out.println("Input the wage of the employer " + i);
        Scanner keyboard = new Scanner(System.in);
        double wage = keyboard.nextDouble();
        while (wage<=0) {
            System.out.println("You can't be paid so little, input a real salary");
            wage = keyboard.nextInt();
        }
        System.out.println("Now input the days worked");
        int days = keyboard.nextInt();
        while (days < 0 || days > 30) {
            System.err.println("Input a valid number goddamnit");
        }
        double salary = (wage*days)/30;
        return salary;
    }
}