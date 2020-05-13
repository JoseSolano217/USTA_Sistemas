package usta.sistemas;

public class Main {

    public static void main(String[] args) {
        // José Solano
        // 12/05/2020
        // This gives you a random value for the four notes of n students
        menu();
        note(matrix());
    }
    public static void menu() {
        // Yes
        System.out.println("╔══════════════════════════════╗");
        System.out.println("║        VectorofaVector       ║");
        System.out.println("║             v1.8             ║");
        System.out.println("║          José Solano         ║");
        System.out.println("╚══════════════════════════════╝");
        System.out.println("\"The first potentially useful thing!\"");
    }
    public static double[][] matrix() {
        double ret[][] = new double[10][4];
        for (int i = 0; i < 4; i++) {
            for (int f = 0; f < 10; f++) {
                ret[f][i] = (double) Math.floor(Math.random()*(5)+1);
            }
        }
        return ret;
    }
    public static void note(double[][] grades) {
        double Final = 0;
        for (int f = 0; f < 10; f++) {
            System.out.println("The grades for the student number " + (f+1) + " are:");
            System.out.println("the first is " + grades[f][0]);
            System.out.println("the second is " + grades[f][1]);
            System.out.println("the third is " + grades[f][2]);
            System.out.println("the fourth is " + grades[f][3]);
            Final = (grades[f][0]*0.2)+(grades[f][1]*0.25)+(grades[f][2]*0.25)+(grades[f][3]*0.3);
            System.out.println("The final grade is " + Final);
        }
    }
}
