package usta.sistemas;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // José Solano
        // 14/04/2020
        // This calculates the area of a circle, a square, or a triangle
        menu(); // This calls the menu
        Scanner keyboard = new Scanner(System.in);
        int choice = keyboard.nextInt();
        if (choice < 1 || choice > 3) {
            System.err.println("You must enter a valid number");
        }
        else {
            if (choice == 1) {
                circle(); // This, however, calls the circle
            } else {
                if (choice == 2) {
                    square(); // Oh look, this calls the square!
                } else {
                    if (choice == 3) {
                        triangle(); // Hmmm...yes. This calls the triangle
                    }
                }
            }
            System.out.println("Thank you for using ArealisD, have a nice day");
        }
    }
    public static void menu () {
        // This is the menu
        System.out.println("-----------ArealisD-----------");
        System.out.println("-------------v1.0-------------");
        System.out.println("---------José  Solano---------");
        System.out.println("Input the form you need to find the area \n1. Circle \n2. Square \n3.Triangle");
    }
    public static void circle () {
        // This is, indeed, the area of a circle
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Input the radius of the circle in centimeters");
        double rad = keyboard.nextDouble();
        double circ = rad*rad*3.1416;
        System.out.println("The area is " + circ);
    }
    public static void square () {
        // And this here, is the area of a square
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Input a side of the square in centimeters");
        double side1 = keyboard.nextDouble();
        System.out.println("Input another side of the square in centimeters");
        double side2 = keyboard.nextDouble();
        double area = side1*side2;
        System.out.println("The area is " + area);
    }
    public static void triangle () {
        // You know what this is
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Input the height of the triangle in centimeters");
        double height = keyboard.nextDouble();
        System.out.println("Input the base of the triangle in centimeters");
        double base = keyboard.nextDouble();
        double area = height*base;
        System.out.println("The area is " + area);
    }
}
