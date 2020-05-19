package usta.sistemas;
public class Main {

    public static void main(String[] args) {
        // José Solano
        // 14/05/2020
        // This converts the vowels of some names on a 4x5 String matrix
        menu();
        String[][] names = {{"Maria", "Pedro", "José", "Camilo", "Rodrigo"},
                            {"Ana", "Lucia", "Martha", "Juliana", "Patricia"},
                            {"Felipe", "Alexander", "Soffi", "Carmen", "Augusto"},
                            {"Alfredo", "Luis", "Ramiro", "Karen", "Andrea"}};
        names = replace(names);
        for (int i = 0; i < 4; i++) {
            System.out.println((i+1) + " = ");
            for (int f = 0; f < 5; f++) {
                System.out.print(  " ║ " + names[i][f]);
            }
            System.out.println("");
        }
    }
    public static void menu() {
        // He's Bacc
        System.out.println("╔══════════════════════════════╗");
        System.out.println("║             Namae            ║");
        System.out.println("║             v7.0             ║");
        System.out.println("║          José Solano         ║");
        System.out.println("╚══════════════════════════════╝");
        System.out.println("It's even better that it's previous iteration!");
    }
    public static String[][] replace(String[][] s) {
        for (int i = 0; i < 4; i++) {
            for (int f = 0; f < 5; f++) {
                s[i][f] = s[i][f].toUpperCase().replace("A", "@").replace("E", "3").replace("I", "1").replace("O", "Ø").replace("U", "⌂");
            }
        }
        return s;
    }
}