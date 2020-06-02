package usta.sistemas;
import java.io.File;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // José Solano
        // 1/06/2020
        // This shows the data of a file
        try {
            Scanner file = new Scanner(new File("D:/texto.txt"));
            while (file.hasNextLine()) {
                System.out.println(file.nextLine());
            }
            file.close();
        } catch (Exception e) {
            System.err.println("The software finished because of:");
            e.printStackTrace();
            System.err.println("Show it to an engineer to fix this");
        }
    }
}
