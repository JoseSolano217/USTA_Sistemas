package usta.sistemas;
import java.io.PrintWriter;
public class Main {

    public static void main(String[] args) {
        try {
            PrintWriter admin_files = new PrintWriter("D:\\texto.txt");
            admin_files.println("First Line");
            admin_files.println("Second Line");
            admin_files.close();
        } catch (Exception e){
            System.err.println("The software finished because: ");
            e.printStackTrace();
        }
    }
}
