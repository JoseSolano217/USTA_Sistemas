package usta.sistemas;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // José Solano
        // 13/04/2020
        // This calculates the average height of 5 children
        menu();
        double adding = sum();
        System.out.println("The average height of your kids is " + average(adding));
    }
    public static void menu() {
        // This is a menu
        System.out.println("------AreyareadykidsSoft------");
        System.out.println("-------------v1.6-------------");
        System.out.println("---------José  Solano---------");
        System.out.println("\"Because a big child is more valuable\"");
    }
    public static double sum(){
        // This asks a value for height for every children and adds it all together
        System.out.println("Input the height of your first kid in meters");
        Scanner keyboard = new Scanner(System.in);
        double height1 = keyboard.nextDouble();
        System.out.println("Input the height of your second kid in meters");
        double height2 = keyboard.nextDouble();
        System.out.println("Input the height of your second kid in meters");
        double height3 = keyboard.nextDouble();
        System.out.println("Input the height of your second kid in meters");
        double height4 = keyboard.nextDouble();
        System.out.println("Input the height of your second kid in meters");
        double height5 = keyboard.nextDouble();
        return height1+height2+height3+height4+height5;
    }
    public static double average(double adding) {
        //I don't need to explain this one, do I?
        return adding/5;
    }
}
