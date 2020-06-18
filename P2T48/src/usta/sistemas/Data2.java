package usta.sistemas;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Data2 {
    public static boolean Data2(String name, String code, String isbn, String desc) {
        boolean ret;
        try {
            File file = new File("D:/libro.txt");
            if (file.exists()) {
                FileWriter file2 = new FileWriter(file, true);
                BufferedWriter data = new BufferedWriter(file2);
                data.write("\n" + name + " | " + code + " | " + isbn + " | " + desc);
                data.close();
                ret = true;
            } else {
                ret = false;
            }
            return ret;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    public static String[][] b_data() {
        String[][] books;
        String texto, tmp, emp;
        int row = 0, lines = 0, limit1, limit2, limit3;
        try {
            File file = new File("D:/libro.txt");
            if (file.exists()) {
                Scanner file2 = new Scanner(file);
                while (file2.hasNextLine()) {
                    lines++;
                    file2.nextLine();
                }
                file2.close();
                file2 = null;
                books = new String[lines][4];
                file2 = new Scanner(file);
                while (file2.hasNextLine()) {
                    texto = file2.nextLine();
                    limit1 = texto.indexOf("|");
                    if (limit1 != -1) {
                        books[row][0] = texto.substring(0, limit1);
                        tmp = texto.substring(limit1 + 1);
                        limit2 = tmp.indexOf("|");
                        books[row][1] = tmp.substring(0, limit2);
                        emp = tmp.substring(limit2 + 1);
                        limit3 = emp.indexOf("|");
                        books[row][2] = emp.substring(0, limit3);
                        books[row][3] = emp.substring(limit3 + 1);
                        row++;
                    }
                }
                file2.close();
                return books;
            } else {
                return null;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}