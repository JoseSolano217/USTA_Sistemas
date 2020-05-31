package usta.sistemas;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        boolean works = false;
        do {
            try {
                System.out.println("Input a number");
                Scanner keyboard = new Scanner(System.in);
                int a = keyboard.nextInt();
                works = true;
            } catch (Exception e){
                System.err.println("This only works with numbers");
            }
        } while (works == false);
    }
}